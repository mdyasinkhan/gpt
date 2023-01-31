package com.chatgpt.gpt.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.chatgpt.gpt.model.OpenAIEntity;
import com.chatgpt.gpt.model.ResponseModel;

@Service
public class OpenAIService {
	
	private static final String API="https://api.openai.com/v1/completions";
	private static final String KEY="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";
	
	//@Value("${default.API}")
	//private String API;
	//@Value("${default.KEY}")
	//private String KEY;
	
	@Autowired
	private final RestTemplate restTemplate;
	
	
	public OpenAIService(RestTemplate restTemplate) {
		this.restTemplate= restTemplate;
	}
	
	public String  Completions(OpenAIEntity aiEntity) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", "Bearer " + KEY);
		
		HttpEntity<OpenAIEntity> entity= new HttpEntity<>(aiEntity, headers);
		return restTemplate.postForObject(API, entity, String.class);
	}
	

}


