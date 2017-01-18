
package com.bakkenbaeck.token.model.sofa;

import java.util.ArrayList;
import java.util.List;
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
     * Values
     * <p>
     * Values required in the Initialize response
     * 
     */
    @SerializedName("values")
    @Expose
    private List<Object> values = new ArrayList<Object>();

    /**
     * Values
     * <p>
     * Values required in the Initialize response
     * 
     */
    public List<Object> getValues() {
        return values;
    }

    /**
     * Values
     * <p>
     * Values required in the Initialize response
     * 
     */
    public void setValues(List<Object> values) {
        this.values = values;
    }

    public InitializationRequest withValues(List<Object> values) {
        this.values = values;
        return this;
    }

}
