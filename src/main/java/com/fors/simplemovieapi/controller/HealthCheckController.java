package com.fors.simplemovieapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;


@RestController
public class HealthCheckController {
	
    @Operation(
    		summary = "Returns OK if service is running"
    )
	@RequestMapping(value = "/health-check", method = RequestMethod.GET, produces = "text/plain")
	public String healthCheck(){
		return "OK";
	}

}
