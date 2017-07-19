# Simple Open Financial App (SOFA) Protocol

The SOFA protocol lets you quickly develop financial applications. It is a JSON protocol that provides standard message and attachment structures, simple UI controls, and commands to interact with the Ethereum network.

SOFA apps are chat bots (with dynamically generated buttons, menus, etc) but they can also have web views for more complex interactions.

For example, see [Creating a Token App](http://developers.tokenbrowser.com/docs/creating-a-token-app).

## Example Interactions

![example1](https://i.imgur.com/VXOyrDl.png)
![example1](https://i.imgur.com/muzf1Qi.jpg)

## Messages

SOFA messages are plain text JSON payloads, with a special prefix that identifies the message type.
The prefix takes the form:

`SOFA::Type:`

There are 6 top-level types/schemas:

- **SOFA::Message** - The general use message type that encapsulates any combination of plain text, buttons, and image/video/link attachments
- **SOFA::Command** - Arbitrary command sent silently as the result of a button press
- **SOFA::InitRequest** - Requests metadata from the recipient client. Data is then sent using an Init message
- **SOFA::Init** - Sends requested metadata from InitRequest
- **SOFA::Payment** - Informs the recipient of an Ethereum transaction
- **SOFA::PaymentRequest** - Requests an Ethereum transaction from the recipient


## Usage Examples

### SOFA::Message

SOFA::Message is the general-use schema that provides all common messaging functionality.
All top-level keys are optional. The structure is as follows:

```javascript
{
  "body": "…", // text message
  "controls": [ // list of UI controls to display in client
    {
      "type": "…", // supported types: button, group
      "label": "…", // displayed button text
      "value": …, // underlying value sent by tapping button
      "controls": …, //nested list of controls inside type "group"
    }
  ],
  "showKeyboard": …, // hints to the recipient whether freeform text responses will be accepted
  "attachments": [ // images/videos/urls
     {
       "type": "image/jpeg",
       "url": "…"
     }
  ]
}
```

Example: A plain text message:
```json
SOFA::Message:{
  "body": "Hello, nice to meet you!"
}
```

Example: A message that presents UI controls:
```json
SOFA::Message:{
  "body": "Now let’s try sending some money. Choose a charity to make a donation of $0.01.",
  "controls": [
    {"type": "button", "label": "Red Cross", "value": "red-cross"},
    {"type": "button", "label": "Ethereum foundation", "value": "ethereum-foundation"},
    {"type": "button", "label": "GiveWell.org", "value": "givewell.org"},
    {"type": "button", "label": "Not now, thanks", "value": -1}
  ]
}
```

Example: Question with prefilled common responses, and ability for typed text
responses that the bot will attempt to parse and understand:
```json
SOFA::Message:{
  "body": "Great! Now that we've set that up, how often do you want to recieve reminders?",
  "controls": [
    {"type": "button", "label": "Never", "value": -1},
    {"type": "button", "label": "Once per week", "value": 1},
    {"type": "button", "label": "Twice per week", "value": 2},
    {"type": "button", "label": "Once per day", "value": 7},
    {"type": "button", "label": "Twice per day", "value": 14}
  ],
  "showKeyboard": true
}
```

Example: Message that presents a large nested menu of controls, including actions that trigger
webview mode of app:
```json
SOFA::Message:{
  "body": "What would you like me to do for you right now?",
  "controls": [
    {
      "type": "group",
      "label": "Trip",
      "controls": [
        {"type": "button", "label": "Directions", "action": "Webview::http://mydapp.com/directions"},
        {"type": "button", "label": "Timetable", "value": "timetable"},
        {"type": "button", "label": "Exit Info", "value": "exit"},
        {"type": "button", "label": "Service Conditions", "action": "Webview::http://mydapp.com/service-conditions"}
      ]
    },
    {
      "type": "group",
      "label": "Services",
      "controls": [
        {"type": "button", "label": "Buy Ticket", "action": "Webview::http://mydapp.com/buy-ticket"},
        {"type": "button", "label": "Support", "value": "support"}
      ]
    },
    {"type": "button", "label": "Nothing", "value": -1}
  ],
  "showKeyboard": false
}
```


Example: Message that adds visible UI controls but has no text message:
```json
SOFA::Message:{
  "controls": [
    {"type": "button", "label": "Tell me a joke!", "value": "joke"},
    {"type": "button", "label": "Show me a picture!", "value": "picture"}
  ]
}
```


### SOFA::Command

Message sent by client in which the user has tapped a button whose value is "timetable":
```json
SOFA::Command:{
  "body": "Timetable",
  "value": "timetable"
}
```

### SOFA::InitRequest

If an Init message has not been sent, or needs to be re-sent, a bot may send
an InitRequest message, which should trigger the client to send an Init
message containing the requested information.

```json
SOFA::InitRequest:{
  "values": ["paymentAddress", "language"]
}
```


### SOFA::Init

When a client speaks to a SOFA app for the first time, the first message should be
of type Init, which provides context for the bot about who it is speaking to.

```json
SOFA::Init:{
  "paymentAddress": "0xa2a0134f1df987bc388dbcb635dfeed4ce497e2a",
  "language": "en"
}
```


### SOFA::Payment

Notification of an Ethereum transaction. Only trustworthy when coming from
a trusted source. Will often be sent multiple times, each time the status
changes.

```json
SOFA::Payment:{
  "status": "unconfirmed",
  "txHash": "0x...",
  "value": "0xce0eb154f900000",
  "fromAddress": "0x...",
  "toAddress": "0x...",
  "reference": "42"
}
```



### SOFA::PaymentRequest

Request money from message recipient. This message contains all information required
to execute payment if approved by recipient. Value is always denominated in Wei and
hex encoded.

```json
SOFA::PaymentRequest:{
  "body": "Thanks for the great time! Can you send your share of the tab?",
  "value": "0xce0eb154f900000",
  "destinationAddress": "0x056db290f8ba3250ca64a45d16284d04bc6f5fbf"
}
```

An optional string reference `reference` can be added to the payment request in order to
keep track of payments and purchases.







## Public App Manifest

SOFA clients that are intended to accept communications publicly (such as a chatbot app)
should provide a JSON manifest publicly available via HTTP GET request. This manifest is
used by browsers to decide how to present your SOFA app to the user.

Example manifest:
```javascript
{
  "displayName": "TokenBot",
  "protocol": "sofa-v1.0", //version of SOFA protocol
  "avatarUrl": "https://static-assets.tokenapp.com/avatar.png",
  "interfaces": ["ChatBot","WebApp"], // list of supported interfaces
  "ownerAddress": "0x...", // ethereum address of chat bot
  "paymentAddress": "0x...", // ethereum address for eth transactions
  "webApp": "https://tokenapp.com", // optional, URI of web view
  "languages": ["en"] // list of supported languages
  "initRequest": {"values": ["paymentAddress", "language"]} // hint to client that an Init message should be sent automatically when the app is opened
}
```
