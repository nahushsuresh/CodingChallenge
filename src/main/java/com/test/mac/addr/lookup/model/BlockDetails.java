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
@JsonPropertyOrder({"blockFound", "borderLeft", "borderRight", "blockSize", "assignmentBlockSize", "dateCreated", "dateUpdated"})
public class BlockDetails {

	@JsonProperty("blockFound") private Boolean blockFound;
	@JsonProperty("borderLeft") private String borderLeft;
	@JsonProperty("borderRight") private String borderRight;
	@JsonProperty("blockSize") private Integer blockSize;
	@JsonProperty("assignmentBlockSize") private String assignmentBlockSize;
	@JsonProperty("dateCreated") private String dateCreated;
	@JsonProperty("dateUpdated") private String dateUpdated;
	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("blockFound")
	public Boolean getBlockFound() {
		return blockFound;
	}

	@JsonProperty("blockFound")
	public void setBlockFound(Boolean blockFound) {
		this.blockFound = blockFound;
	}

	@JsonProperty("borderLeft")
	public String getBorderLeft() {
		return borderLeft;
	}

	@JsonProperty("borderLeft")
	public void setBorderLeft(String borderLeft) {
		this.borderLeft = borderLeft;
	}

	@JsonProperty("borderRight")
	public String getBorderRight() {
		return borderRight;
	}

	@JsonProperty("borderRight")
	public void setBorderRight(String borderRight) {
		this.borderRight = borderRight;
	}

	@JsonProperty("blockSize")
	public Integer getBlockSize() {
		return blockSize;
	}

	@JsonProperty("blockSize")
	public void setBlockSize(Integer blockSize) {
		this.blockSize = blockSize;
	}

	@JsonProperty("assignmentBlockSize")
	public String getAssignmentBlockSize() {
		return assignmentBlockSize;
	}

	@JsonProperty("assignmentBlockSize")
	public void setAssignmentBlockSize(String assignmentBlockSize) {
		this.assignmentBlockSize = assignmentBlockSize;
	}

	@JsonProperty("dateCreated")
	public String getDateCreated() {
		return dateCreated;
	}

	@JsonProperty("dateCreated")
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	@JsonProperty("dateUpdated")
	public String getDateUpdated() {
		return dateUpdated;
	}

	@JsonProperty("dateUpdated")
	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
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

