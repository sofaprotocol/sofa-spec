
package com.bakkenbaeck.token.model.sofa;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * SOFA::Command
 * <p>
 * Arbitrary text command in response to button tap
 * 
 */
public class Command {

    /**
     * Value
     * <p>
     * Value property copied from button that triggered the message
     * (Required)
     * 
     */
    @SerializedName("value")
    @Expose
    private String value;

    /**
     * Value
     * <p>
     * Value property copied from button that triggered the message
     * (Required)
     * 
     */
    public String getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * Value property copied from button that triggered the message
     * (Required)
     * 
     */
    public void setValue(String value) {
        this.value = value;
    }

    public Command withValue(String value) {
        this.value = value;
        return this;
    }

}
