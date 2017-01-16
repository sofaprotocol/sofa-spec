
package com.bakkenbaeck.token.model.sofa;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * SOFA::Response
 * <p>
 * A response that is suggested as an answer to a Question
 * 
 */
public class Response {

    /**
     * Label
     * <p>
     * Label/display name of response
     * (Required)
     * 
     */
    @SerializedName("label")
    @Expose
    private String label;
    /**
     * Responses
     * <p>
     * A sub-list of responses
     * 
     */
    @SerializedName("responses")
    @Expose
    private List<Response> responses = new ArrayList<Response>();
    /**
     * Action
     * <p>
     * A client-side action
     * 
     */
    @SerializedName("action")
    @Expose
    private String action;
    /**
     * Role
     * <p>
     * Hint to client about the meaning of the response, for UI/rendering
     * 
     */
    @SerializedName("role")
    @Expose
    private String role;

    /**
     * Label
     * <p>
     * Label/display name of response
     * (Required)
     * 
     */
    public String getLabel() {
        return label;
    }

    /**
     * Label
     * <p>
     * Label/display name of response
     * (Required)
     * 
     */
    public void setLabel(String label) {
        this.label = label;
    }

    public Response withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Responses
     * <p>
     * A sub-list of responses
     * 
     */
    public List<Response> getResponses() {
        return responses;
    }

    /**
     * Responses
     * <p>
     * A sub-list of responses
     * 
     */
    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public Response withResponses(List<Response> responses) {
        this.responses = responses;
        return this;
    }

    /**
     * Action
     * <p>
     * A client-side action
     * 
     */
    public String getAction() {
        return action;
    }

    /**
     * Action
     * <p>
     * A client-side action
     * 
     */
    public void setAction(String action) {
        this.action = action;
    }

    public Response withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Role
     * <p>
     * Hint to client about the meaning of the response, for UI/rendering
     * 
     */
    public String getRole() {
        return role;
    }

    /**
     * Role
     * <p>
     * Hint to client about the meaning of the response, for UI/rendering
     * 
     */
    public void setRole(String role) {
        this.role = role;
    }

    public Response withRole(String role) {
        this.role = role;
        return this;
    }

}
