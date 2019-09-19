package com.test.mac.addr.lookup.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"oui", "isPrivate", "companyName", "companyAddress", "countryCode"})
public class VendorDetails {

	@JsonProperty("oui") private String oui;
	@JsonProperty("isPrivate") private Boolean isPrivate;
	@JsonProperty("companyName") private String companyName;
	@JsonProperty("companyAddress") private String companyAddress;
	@JsonProperty("countryCode") private String countryCode;
	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("oui")
	public String getOui() {
		return oui;
	}

	@JsonProperty("oui")
	public void setOui(String oui) {
		this.oui = oui;
	}

	@JsonProperty("isPrivate")
	public Boolean getIsPrivate() {
		return isPrivate;
	}

	@JsonProperty("isPrivate")
	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	@JsonProperty("companyName")
	public String getCompanyName() {
		return companyName;
	}

	@JsonProperty("companyName")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@JsonProperty("companyAddress")
	public String getCompanyAddress() {
		return companyAddress;
	}

	@JsonProperty("companyAddress")
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	@JsonProperty("countryCode")
	public String getCountryCode() {
		return countryCode;
	}

	@JsonProperty("countryCode")
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}