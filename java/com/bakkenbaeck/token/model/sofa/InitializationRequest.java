
package com.bakkenbaeck.token.model.sofa;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * SOFA::InitializationRequest
 * <p>
 * Sent by automated clients if first message recieved from contact is not Initialize.
 * 
 */
public class InitializationRequest {

    /**
     * Message
     * <p>
     * Plain text message shown to recipient
     * 
     */
    @SerializedName("message")
    @Expose
    private String message;

    /**
     * Message
     * <p>
     * Plain text message shown to recipient
     * 
     */
    public String getMessage() {
        return message;
    }

    /**
     * Message
     * <p>
     * Plain text message shown to recipient
     * 
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public InitializationRequest withMessage(String message) {
        this.message = message;
        return this;
    }

}
