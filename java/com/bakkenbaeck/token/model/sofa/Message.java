
package com.bakkenbaeck.token.model.sofa;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * SOFA::Message
 * <p>
 * General-use message structure
 * 
 */
public class Message {

    /**
     * Body
     * <p>
     * Plain text message to be shown to recipient
     * 
     */
    @SerializedName("body")
    @Expose
    private String body;
    /**
     * Show Keyboard
     * <p>
     * Hint for client about whether arbitrary text responses will be parsed. If false, the client should disable the keyboard/input.
     * 
     */
    @SerializedName("showKeyboard")
    @Expose
    private Boolean showKeyboard;
    /**
     * Controls
     * <p>
     * List of UI controls to construct in client
     * 
     */
    @SerializedName("controls")
    @Expose
    private List<Control> controls = new ArrayList<Control>();
    /**
     * Attachments
     * <p>
     * List image/video/url attachments
     * 
     */
    @SerializedName("attachments")
    @Expose
    private List<Object> attachments = new ArrayList<Object>();

    /**
     * Body
     * <p>
     * Plain text message to be shown to recipient
     * 
     */
    public String getBody() {
        return body;
    }

    /**
     * Body
     * <p>
     * Plain text message to be shown to recipient
     * 
     */
    public void setBody(String body) {
        this.body = body;
    }

    public Message withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Show Keyboard
     * <p>
     * Hint for client about whether arbitrary text responses will be parsed. If false, the client should disable the keyboard/input.
     * 
     */
    public Boolean getShowKeyboard() {
        return showKeyboard;
    }

    /**
     * Show Keyboard
     * <p>
     * Hint for client about whether arbitrary text responses will be parsed. If false, the client should disable the keyboard/input.
     * 
     */
    public void setShowKeyboard(Boolean showKeyboard) {
        this.showKeyboard = showKeyboard;
    }

    public Message withShowKeyboard(Boolean showKeyboard) {
        this.showKeyboard = showKeyboard;
        return this;
    }

    /**
     * Controls
     * <p>
     * List of UI controls to construct in client
     * 
     */
    public List<Control> getControls() {
        return controls;
    }

    /**
     * Controls
     * <p>
     * List of UI controls to construct in client
     * 
     */
    public void setControls(List<Control> controls) {
        this.controls = controls;
    }

    public Message withControls(List<Control> controls) {
        this.controls = controls;
        return this;
    }

    /**
     * Attachments
     * <p>
     * List image/video/url attachments
     * 
     */
    public List<Object> getAttachments() {
        return attachments;
    }

    /**
     * Attachments
     * <p>
     * List image/video/url attachments
     * 
     */
    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }

    public Message withAttachments(List<Object> attachments) {
        this.attachments = attachments;
        return this;
    }

}
