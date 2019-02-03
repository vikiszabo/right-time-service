package com.rightime.service;

import net.user.time_service.GetTimeRequest;
import net.user.time_service.GetTimeResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class TimeServiceEndpoint {

    private static final String NAMESPACE_URI = "http://user.net/time-service";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTimeRequest")
    @ResponsePayload
    public GetTimeResponse getTime(@RequestPayload GetTimeRequest request) {
        GetTimeResponse response = new GetTimeResponse();
        response.setTime("time for request: " + request.getFormat());

        return response;
    }



}
