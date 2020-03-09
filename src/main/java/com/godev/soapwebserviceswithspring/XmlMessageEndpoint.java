package com.godev.soapwebserviceswithspring;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.godev.soap.webservices.demo.GetXmlMessageRequest;
import com.godev.soap.webservices.demo.GetXmlMessageResponse;

@Endpoint
public class XmlMessageEndpoint {
	private static final String NAMESPACE_URI = "http://godev.com/soap/webservices/demo";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getXmlMessageRequest")
	@ResponsePayload
	public GetXmlMessageResponse getXmlDocument(@RequestPayload GetXmlMessageRequest request) {
		GetXmlMessageResponse response = new GetXmlMessageResponse();
		response.setXmlMessage("<xml>empty document</xml>");

		return response;
	}
}
