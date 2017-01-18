
package com.bakkenbaeck.token.model.sofa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Control
 * <p>
 * A UI control instance
 * 
 */
public class Control {

    /**
     * Type
     * <p>
     * Type of control
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private Control.Type type;
    /**
     * Label
     * <p>
     * Label/display name of control
     * (Required)
     * 
     */
    @SerializedName("label")
    @Expose
    private String label;
    /**
     * Value
     * <p>
     * Value for the Command send upon tapping button
     * 
     */
    @SerializedName("value")
    @Expose
    private String value;
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
     * Controls
     * <p>
     * A sub-list of controls within a group
     * 
     */
    @SerializedName("controls")
    @Expose
    private List<Control> controls = new ArrayList<Control>();

    /**
     * Type
     * <p>
     * Type of control
     * (Required)
     * 
     */
    public Control.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Type of control
     * (Required)
     * 
     */
    public void setType(Control.Type type) {
        this.type = type;
    }

    public Control withType(Control.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Label
     * <p>
     * Label/display name of control
     * (Required)
     * 
     */
    public String getLabel() {
        return label;
    }

    /**
     * Label
     * <p>
     * Label/display name of control
     * (Required)
     * 
     */
    public void setLabel(String label) {
        this.label = label;
    }

    public Control withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Value
     * <p>
     * Value for the Command send upon tapping button
     * 
     */
    public String getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * Value for the Command send upon tapping button
     * 
     */
    public void setValue(String value) {
        this.value = value;
    }

    public Control withValue(String value) {
        this.value = value;
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

    public Control withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Controls
     * <p>
     * A sub-list of controls within a group
     * 
     */
    public List<Control> getControls() {
        return controls;
    }

    /**
     * Controls
     * <p>
     * A sub-list of controls within a group
     * 
     */
    public void setControls(List<Control> controls) {
        this.controls = controls;
    }

    public Control withControls(List<Control> controls) {
        this.controls = controls;
        return this;
    }

    public enum Type {

        @SerializedName("button")
        BUTTON("button"),
        @SerializedName("group")
        GROUP("group");
        private final String value;
        private final static Map<String, Control.Type> CONSTANTS = new HashMap<String, Control.Type>();

        static {
            for (Control.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Control.Type fromValue(String value) {
            Control.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
