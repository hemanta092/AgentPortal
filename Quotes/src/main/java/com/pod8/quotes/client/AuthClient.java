package com.pod8.quotes.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.pod8.quotes.model.AuthResponse;

@FeignClient(url = "${auth.url}", name = "authapp")
public interface AuthClient {

	@GetMapping(value = "/validate")
	public AuthResponse getValidity(@RequestHeader("Authorization") String token);

}
