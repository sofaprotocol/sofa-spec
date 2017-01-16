
package com.bakkenbaeck.token.model.sofa;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * SOFA App Manifest
 * <p>
 * Manifest used by browsers to decide how to present your SOFA app to the user.
 * 
 */
public class AppManifest {

    /**
     * Display Name
     * <p>
     * Human-readable app name
     * (Required)
     * 
     */
    @SerializedName("displayName")
    @Expose
    private String displayName;
    /**
     * Versions
     * <p>
     * List of supported SOFA versions
     * (Required)
     * 
     */
    @SerializedName("versions")
    @Expose
    private List<String> versions = new ArrayList<String>();
    /**
     * Avatar Url
     * <p>
     * URL of image to be used as app icon/avatar
     * (Required)
     * 
     */
    @SerializedName("avatarUrl")
    @Expose
    private String avatarUrl;
    /**
     * Interfaces
     * <p>
     * List of user interfaces supported by this app
     * (Required)
     * 
     */
    @SerializedName("interfaces")
    @Expose
    private List<Interface> interfaces = new ArrayList<Interface>();
    /**
     * Languages
     * <p>
     * List of ISO 639-1 codes for supported languages 
     * (Required)
     * 
     */
    @SerializedName("languages")
    @Expose
    private List<String> languages = new ArrayList<String>();
    /**
     * Ethereum Address
     * <p>
     * Ethereum address of app
     * (Required)
     * 
     */
    @SerializedName("ethereumAddress")
    @Expose
    private String ethereumAddress;
    /**
     * Requires Introduction
     * <p>
     * Flag indicating whether client must first send Initialization message
     * (Required)
     * 
     */
    @SerializedName("requiresIntroduction")
    @Expose
    private Boolean requiresIntroduction;

    /**
     * Display Name
     * <p>
     * Human-readable app name
     * (Required)
     * 
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name
     * <p>
     * Human-readable app name
     * (Required)
     * 
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AppManifest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Versions
     * <p>
     * List of supported SOFA versions
     * (Required)
     * 
     */
    public List<String> getVersions() {
        return versions;
    }

    /**
     * Versions
     * <p>
     * List of supported SOFA versions
     * (Required)
     * 
     */
    public void setVersions(List<String> versions) {
        this.versions = versions;
    }

    public AppManifest withVersions(List<String> versions) {
        this.versions = versions;
        return this;
    }

    /**
     * Avatar Url
     * <p>
     * URL of image to be used as app icon/avatar
     * (Required)
     * 
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * Avatar Url
     * <p>
     * URL of image to be used as app icon/avatar
     * (Required)
     * 
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public AppManifest withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * Interfaces
     * <p>
     * List of user interfaces supported by this app
     * (Required)
     * 
     */
    public List<Interface> getInterfaces() {
        return interfaces;
    }

    /**
     * Interfaces
     * <p>
     * List of user interfaces supported by this app
     * (Required)
     * 
     */
    public void setInterfaces(List<Interface> interfaces) {
        this.interfaces = interfaces;
    }

    public AppManifest withInterfaces(List<Interface> interfaces) {
        this.interfaces = interfaces;
        return this;
    }

    /**
     * Languages
     * <p>
     * List of ISO 639-1 codes for supported languages 
     * (Required)
     * 
     */
    public List<String> getLanguages() {
        return languages;
    }

    /**
     * Languages
     * <p>
     * List of ISO 639-1 codes for supported languages 
     * (Required)
     * 
     */
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public AppManifest withLanguages(List<String> languages) {
        this.languages = languages;
        return this;
    }

    /**
     * Ethereum Address
     * <p>
     * Ethereum address of app
     * (Required)
     * 
     */
    public String getEthereumAddress() {
        return ethereumAddress;
    }

    /**
     * Ethereum Address
     * <p>
     * Ethereum address of app
     * (Required)
     * 
     */
    public void setEthereumAddress(String ethereumAddress) {
        this.ethereumAddress = ethereumAddress;
    }

    public AppManifest withEthereumAddress(String ethereumAddress) {
        this.ethereumAddress = ethereumAddress;
        return this;
    }

    /**
     * Requires Introduction
     * <p>
     * Flag indicating whether client must first send Initialization message
     * (Required)
     * 
     */
    public Boolean getRequiresIntroduction() {
        return requiresIntroduction;
    }

    /**
     * Requires Introduction
     * <p>
     * Flag indicating whether client must first send Initialization message
     * (Required)
     * 
     */
    public void setRequiresIntroduction(Boolean requiresIntroduction) {
        this.requiresIntroduction = requiresIntroduction;
    }

    public AppManifest withRequiresIntroduction(Boolean requiresIntroduction) {
        this.requiresIntroduction = requiresIntroduction;
        return this;
    }

}
