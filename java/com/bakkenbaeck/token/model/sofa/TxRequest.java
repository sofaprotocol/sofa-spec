
package com.bakkenbaeck.token.model.sofa;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * TxRequest
 * <p>
 * Request an Ethereum transaction
 * 
 */
public class TxRequest {

    /**
     * Currency
     * <p>
     * ISO 4217 currency code. Specifies the denomination of request value.
     * (Required)
     * 
     */
    @SerializedName("currency")
    @Expose
    private String currency;
    /**
     * Value
     * <p>
     * Value of transaction in given currency (fractional numbers allowed)
     * (Required)
     * 
     */
    @SerializedName("value")
    @Expose
    private Double value;
    /**
     * Destination Address
     * <p>
     * Ethereum address of recipient
     * (Required)
     * 
     */
    @SerializedName("destinationAddress")
    @Expose
    private String destinationAddress;
    /**
     * Sender Address
     * <p>
     * Ethereum address of sender
     * (Required)
     * 
     */
    @SerializedName("senderAddress")
    @Expose
    private String senderAddress;

    /**
     * Currency
     * <p>
     * ISO 4217 currency code. Specifies the denomination of request value.
     * (Required)
     * 
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Currency
     * <p>
     * ISO 4217 currency code. Specifies the denomination of request value.
     * (Required)
     * 
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public TxRequest withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Value
     * <p>
     * Value of transaction in given currency (fractional numbers allowed)
     * (Required)
     * 
     */
    public Double getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * Value of transaction in given currency (fractional numbers allowed)
     * (Required)
     * 
     */
    public void setValue(Double value) {
        this.value = value;
    }

    public TxRequest withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Destination Address
     * <p>
     * Ethereum address of recipient
     * (Required)
     * 
     */
    public String getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Destination Address
     * <p>
     * Ethereum address of recipient
     * (Required)
     * 
     */
    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public TxRequest withDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
        return this;
    }

    /**
     * Sender Address
     * <p>
     * Ethereum address of sender
     * (Required)
     * 
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sender Address
     * <p>
     * Ethereum address of sender
     * (Required)
     * 
     */
    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public TxRequest withSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
        return this;
    }

}
