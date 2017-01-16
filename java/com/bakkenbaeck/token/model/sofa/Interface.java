
package com.bakkenbaeck.token.model.sofa;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public enum Interface {

    @SerializedName("ChatBot")
    CHAT_BOT("ChatBot"),
    @SerializedName("WebView")
    WEB_VIEW("WebView");
    private final String value;
    private final static Map<String, Interface> CONSTANTS = new HashMap<String, Interface>();

    static {
        for (Interface c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private Interface(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static Interface fromValue(String value) {
        Interface constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
