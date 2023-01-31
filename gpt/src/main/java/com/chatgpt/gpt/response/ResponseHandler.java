
package com.chatgpt.gpt.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

	public static ResponseEntity<Object> responseEntity(String message, HttpStatus httpStatus, Object responseObject) {

		Map<String, Object> response = new HashMap<>();
		response.put("message", "response generated");

		response.put("httpStatus", httpStatus);
		response.put("data", responseObject);

		return new ResponseEntity<>(response, httpStatus);
	}

}
