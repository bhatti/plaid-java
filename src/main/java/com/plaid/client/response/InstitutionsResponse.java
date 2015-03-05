package com.plaid.client.response;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InstitutionsResponse {

    private List<Institution> institutions;

    public InstitutionsResponse(Institution[] institutions) {
        this.institutions = Arrays.asList(institutions);
    }
    
    public List<Institution> getInstitutions() {
        return institutions;
    }    
}
