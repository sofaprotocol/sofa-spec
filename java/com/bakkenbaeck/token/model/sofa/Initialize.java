
package com.bakkenbaeck.token.model.sofa;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * SOFA::Initialize
 * <p>
 * The first message a client should send to an automated partner.
 * 
 */
public class Initialize {

    /**
     * Payment Address
     * <p>
     * Ethereum address to be used for transactions. May differ from chat address.
     * (Required)
     * 
     */
    @SerializedName("paymentAddress")
    @Expose
    private String paymentAddress;

    /**
     * Payment Address
     * <p>
     * Ethereum address to be used for transactions. May differ from chat address.
     * (Required)
     * 
     */
    public String getPaymentAddress() {
        return paymentAddress;
    }

    /**
     * Payment Address
     * <p>
     * Ethereum address to be used for transactions. May differ from chat address.
     * (Required)
     * 
     */
    public void setPaymentAddress(String paymentAddress) {
        this.paymentAddress = paymentAddress;
    }

    public Initialize withPaymentAddress(String paymentAddress) {
        this.paymentAddress = paymentAddress;
        return this;
    }

}
