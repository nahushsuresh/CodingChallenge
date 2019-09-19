package com.test.mac.addr.lookup.model;

		import java.util.HashMap;
		import java.util.Map;
		import com.fasterxml.jackson.annotation.JsonAnyGetter;
		import com.fasterxml.jackson.annotation.JsonAnySetter;
		import com.fasterxml.jackson.annotation.JsonIgnore;
		import com.fasterxml.jackson.annotation.JsonInclude;
		import com.fasterxml.jackson.annotation.JsonProperty;
		import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"vendorDetails", "blockDetails", "macAddressDetails"})
public class MacAddressLookupResponse {

	@JsonProperty("vendorDetails") private VendorDetails vendorDetails;
	@JsonProperty("blockDetails") private BlockDetails blockDetails;
	@JsonProperty("macAddressDetails") private MacAddressDetails macAddressDetails;
	@JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("vendorDetails")
	public VendorDetails getVendorDetails() {
		return vendorDetails;
	}

	@JsonProperty("vendorDetails")
	public void setVendorDetails(VendorDetails vendorDetails) {
		this.vendorDetails = vendorDetails;
	}

	@JsonProperty("blockDetails")
	public BlockDetails getBlockDetails() {
		return blockDetails;
	}

	@JsonProperty("blockDetails")
	public void setBlockDetails(BlockDetails blockDetails) {
		this.blockDetails = blockDetails;
	}

	@JsonProperty("macAddressDetails")
	public MacAddressDetails getMacAddressDetails() {
		return macAddressDetails;
	}

	@JsonProperty("macAddressDetails")
	public void setMacAddressDetails(MacAddressDetails macAddressDetails) {
		this.macAddressDetails = macAddressDetails;
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
