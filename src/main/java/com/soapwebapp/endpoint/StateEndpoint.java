package com.soapwebapp.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soapwebapp.service.StateService;
import com.soapwebapp.soap_web_app.GetStateRequest;
import com.soapwebapp.soap_web_app.GetStateResponse;


@Endpoint
public class StateEndpoint {

	@PayloadRoot(namespace="http://soapwebapp.com/soap-web-app", localPart="getStateRequest")
	@ResponsePayload
	public GetStateResponse getStateRequest(@RequestPayload GetStateRequest request) {
		
		GetStateResponse response = new GetStateResponse();
		response.setState(StateService.getState(request.getName()));
		
		return response;
	}
}
