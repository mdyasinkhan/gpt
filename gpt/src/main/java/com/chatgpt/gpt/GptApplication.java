package com.chatgpt.gpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GptApplication {

	public static void main(String[] args) {
		SpringApplication.run(GptApplication.class, args);
	}
	
	@Bean
	
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
