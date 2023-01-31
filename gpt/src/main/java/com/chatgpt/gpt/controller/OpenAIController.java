package com.chatgpt.gpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chatgpt.gpt.model.OpenAIEntity;
import com.chatgpt.gpt.response.ResponseHandler;
import com.chatgpt.gpt.service.OpenAIService;

@RestController
public class OpenAIController {
	@Autowired
	private final OpenAIService openAIService;
	
	
	public OpenAIController(OpenAIService openAIService) {
		this.openAIService= openAIService;
	}
	
	@PostMapping("/completions")
	
	public String completion(@RequestBody OpenAIEntity aiEntity) {
		return openAIService.Completions(aiEntity);
	}
	
 //@PostMapping("/completions")
	
	//public ResponseEntity<Object> completion(@RequestBody OpenAIEntity aiEntity) {
		
		
		//return ResponseHandler.responseEntity("this is generated", HttpStatus.OK, openAIService.Completions(aiEntity));
		
	//}

	

}
