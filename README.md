# SOFA Spec

SOFA describes special messages that ride along inside text-based conversational communications
providing machine-readable actions, notifications and intents for interaction with the Ethereum
network.

In the context of Token, they are sent between users, or between users and bots.


## Public Manifest

SOFA clients that are intended to accept communications publicly (such as a chatbot app)
should provide a JSON manifest publicly available via HTTP GET request. This manifest is
used by browsers to decide how to present your SOFA app to the user.

Example manifest:
```json
{
  "displayName": "TokenBot",
  "versions": ["sofaV1"],
  "avatarUrl": "http://static-assets.tokenapp.com/avatar.png",
  "interfaces": ["Chatbot"],
  "languages": ["en"],
  "ethereumAddress": "0x...",
  "requiresIntroduction": true
}
```


## Messages

SOFA messages are plain text JSON payloads, with a special prefix that identifies the message type.
The prefix takes the form:

`namespace::type:`

For instance:

```json
SOFA::TxStatusChange:{
  "status": Pending,
  "txHash": "0x...",
  "value": "0.01"
}
```



## Message Usage Examples


### Initialize

When a client speaks to a SOFA app for the first time, the first message should be
of type Initialize, which provides context for the bot about who it is speaking to.

```json
SOFA::Initialize:{
  "paymentAddress": "0xa2a0134f1df987bc388dbcb635dfeed4ce497e2a",
  "username": "mark"
}
```


### InitializationRequest

If an Initialize message has not been sent, or needs to be re-sent, a bot may send
an InitializationRequest message, which should trigger the client to send an Initialize
message.

```json
SOFA::InitializationRequest:{
  "message": "I don't who you are!"
}
```


### TxRequest

Request money from message recipient. This message contains all information required
to execute payment if approved by recipient.

```json
SOFA::TxRequest:{
  "currency": "USD",
  "value": 0.01,
  "destinationAddress": "0x056db290f8ba3250ca64a45d16284d04bc6f5fbf"
}
```


### TxStatusChange

Notification of status change for Ethereum transaction. Only trustworthy when coming from
a trusted source. It is still useful from untrusted sources for triggering the recipient
to check the validity of the transaction/status on the Ethereum network.

```json
SOFA::TxStatusChange:{
  "status": "pending",
  "txHash": "0x...",
  "value": "0.01"
}
```


### Question

Pose a question and suggest (or require) certain answers/actions. Clients should go into a
"question answering" state upon receipt of this question, rendering the responses as appropriate
and enabling/disabling custom typed text responses.

Example: Single choice list, no custom response
```json
SOFA::Question:{
  "question": "Now let’s try sending some money. Choose a charity to make a donation of $0.01.",
  "allowCustom": false,
  "responses": [
    {"label": "Red Cross"},
    {"label": "Ethereum foundation"},
    {"label": "GiveWell.org"},
    {"label": "Not now, thanks", "role": "negative"}
  ]
}
```

Example: Yes/No question
```json
SOFA::Question:{
  "question": "Would you like to recieve notifications?",
  "allowCustom": no,
  "responses": [
    {"label": "Sure!", "role": "affirmative"},
    {"label": "No thanks", "role": "negative"}
  ]
}
```

Example: Question with prefilled common responses, and ability for custom text responses
that the bot will attempt to understand
```json
SOFA::Question:{
  "question": "Great! Now that we've set that up, how often do you want to recieve reminders?",
  "allowCustom": true,
  "responses": [
    {"label": "Never"},
    {"label": "Once per day"},
    {"label": "Twice per day"},
    {"label": "Once per week"},
    {"label": "Twice per week"}
  ]
}
```

Example: General 'menu' question with a mix of grouped responses
```json
SOFA::Question:{
  "question": "What would you like me to do for you right now?",
  "allowCustom": false,
  "responses": [
    {
      "label": "Trip",
      "responses": [
        {"label": "Directions", "action": "Webview:/Directions"},
        {"label": "Timetable"},
        {"label": "Exit Info"},
        {"label": "Service Conditions", "action": "Webview:/ServiceConditions"}
      ]
    },
    {"label": "Services"},
    {"label": "Nothing"}
  ]
}
```