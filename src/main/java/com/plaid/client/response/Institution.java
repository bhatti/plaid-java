package com.plaid.client.response;

import com.plaid.client.request.Credentials;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Institution {
    private String id;
    private String name;
    private String type;
    private Credentials credentials;
    private boolean has_mfa;
    private List<String> mfa;
    private List<String> products;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public boolean isHas_mfa() {
        return has_mfa;
    }

    public void setHas_mfa(boolean has_mfa) {
        this.has_mfa = has_mfa;
    }

    public List<String> getMfa() {
        return mfa;
    }

    public void setMfa(List<String> mfa) {
        this.mfa = mfa;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Institution [id=" + id + ", name=" + name + ", type=" + type
                + ", credentials=" + credentials + ", has_mfa=" + has_mfa
                + ", mfa=" + mfa + ", products=" + products + "]";
    }
}
