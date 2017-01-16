
package com.bakkenbaeck.token.model.sofa;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * SOFA::Question
 * <p>
 * A question message that suggests (or requires) certain answers/actions
 * 
 */
public class Question {

    /**
     * Question
     * <p>
     * Plain text message to be shown to recipient
     * (Required)
     * 
     */
    @SerializedName("question")
    @Expose
    private String question;
    /**
     * Allow Custom
     * <p>
     * Hint for client about whether arbitrary text responses will be parsed. If false, the client should disable the keyboard/input.
     * (Required)
     * 
     */
    @SerializedName("allowCustom")
    @Expose
    private Boolean allowCustom;
    /**
     * Responses
     * <p>
     * List of suggested/allowed responses
     * (Required)
     * 
     */
    @SerializedName("responses")
    @Expose
    private List<Response> responses = new ArrayList<Response>();

    /**
     * Question
     * <p>
     * Plain text message to be shown to recipient
     * (Required)
     * 
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Question
     * <p>
     * Plain text message to be shown to recipient
     * (Required)
     * 
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    public Question withQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * Allow Custom
     * <p>
     * Hint for client about whether arbitrary text responses will be parsed. If false, the client should disable the keyboard/input.
     * (Required)
     * 
     */
    public Boolean getAllowCustom() {
        return allowCustom;
    }

    /**
     * Allow Custom
     * <p>
     * Hint for client about whether arbitrary text responses will be parsed. If false, the client should disable the keyboard/input.
     * (Required)
     * 
     */
    public void setAllowCustom(Boolean allowCustom) {
        this.allowCustom = allowCustom;
    }

    public Question withAllowCustom(Boolean allowCustom) {
        this.allowCustom = allowCustom;
        return this;
    }

    /**
     * Responses
     * <p>
     * List of suggested/allowed responses
     * (Required)
     * 
     */
    public List<Response> getResponses() {
        return responses;
    }

    /**
     * Responses
     * <p>
     * List of suggested/allowed responses
     * (Required)
     * 
     */
    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public Question withResponses(List<Response> responses) {
        this.responses = responses;
        return this;
    }

}
