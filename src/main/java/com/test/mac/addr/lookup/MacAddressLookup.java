package com.test.mac.addr.lookup;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.test.mac.addr.lookup.model.MacAddressLookupResponse;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.http.client.fluent.Request;

import java.io.IOException;
import java.util.Arrays;

public class MacAddressLookup {

	private static ObjectMapper objectMapper = new ObjectMapper();

	public static void main(String[] args) throws IOException {
		System.out.println("Args received: " + Arrays.toString(args));
		CommandLineParser parser = new DefaultParser();
		Options options = new Options();

		Option macAddressInputOption = new Option("m", "mac-addr", true, "MAC Address");
		macAddressInputOption.setRequired(true);
		options.addOption(macAddressInputOption);

		Option verboseInputOption = new Option("v", "verbose", false, "Verbose");
		verboseInputOption.setRequired(false);
		options.addOption(verboseInputOption);

		CommandLine cmd = null;
		try {
			cmd = parser.parse(options, args);
		} catch (ParseException parseException) {
			parseException.printStackTrace();
			HelpFormatter formatter = new HelpFormatter();
			formatter.printHelp("mac-addr-lookup", options);
			System.exit(1);
		}

		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		String response = Request.Get("https://api.macaddress.io/v1?apiKey=at_NdqxLFXqnqiaQZZispiHYc2IlKdwe&output=json&search=" + cmd.getOptionValue('m')).connectTimeout(1000).socketTimeout(1000).execute().returnContent().asString();
		if (cmd.hasOption('v')) {
			Object json = objectMapper.readValue(response, Object.class);
			String indented = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
			System.out.println(indented);
		} else {
			MacAddressLookupResponse macAddressLookupResponse = objectMapper.readValue(response, MacAddressLookupResponse.class);
			System.out.println(">>>>>>>>>>>>>>> COMPANY DETAILS <<<<<<<<<<<<<<<<");
			System.out.println("Company Name	: 	" + macAddressLookupResponse.getVendorDetails().getCompanyName());
			System.out.println("Company Address	:	" + macAddressLookupResponse.getVendorDetails().getCompanyAddress());
			System.out.println("Country Code	: 	" + macAddressLookupResponse.getVendorDetails().getCountryCode());
		}
	}

}
