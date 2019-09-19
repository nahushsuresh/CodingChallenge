package com.test.mac.addr.lookup.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"searchTerm", "isValid", "virtualMachine", "applications", "transmissionType", "administrationType", "wiresharkNotes", "comment"})
public class MacAddressDetails {

	@JsonProperty("searchTerm") private String searchTerm;
	@JsonProperty("isValid") private Boolean isValid;
	@JsonProperty("virtualMachine") private String virtualMachine;
	@JsonProperty("applications") private List<String> applications = null;
	@JsonProperty("transmissionType") private String transmissionType;
	@JsonProperty("administrationType") private String administrationType;
	@JsonProperty("wiresharkNotes") private String wiresharkNotes;
	@JsonProperty("comment") private String comment;
	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("searchTerm")
	public String getSearchTerm() {
		return searchTerm;
	}

	@JsonProperty("searchTerm")
	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}

	@JsonProperty("isValid")
	public Boolean getIsValid() {
		return isValid;
	}

	@JsonProperty("isValid")
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	@JsonProperty("virtualMachine")
	public String getVirtualMachine() {
		return virtualMachine;
	}

	@JsonProperty("virtualMachine")
	public void setVirtualMachine(String virtualMachine) {
		this.virtualMachine = virtualMachine;
	}

	@JsonProperty("applications")
	public List<String> getApplications() {
		return applications;
	}

	@JsonProperty("applications")
	public void setApplications(List<String> applications) {
		this.applications = applications;
	}

	@JsonProperty("transmissionType")
	public String getTransmissionType() {
		return transmissionType;
	}

	@JsonProperty("transmissionType")
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	@JsonProperty("administrationType")
	public String getAdministrationType() {
		return administrationType;
	}

	@JsonProperty("administrationType")
	public void setAdministrationType(String administrationType) {
		this.administrationType = administrationType;
	}

	@JsonProperty("wiresharkNotes")
	public String getWiresharkNotes() {
		return wiresharkNotes;
	}

	@JsonProperty("wiresharkNotes")
	public void setWiresharkNotes(String wiresharkNotes) {
		this.wiresharkNotes = wiresharkNotes;
	}

	@JsonProperty("comment")
	public String getComment() {
		return comment;
	}

	@JsonProperty("comment")
	public void setComment(String comment) {
		this.comment = comment;
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