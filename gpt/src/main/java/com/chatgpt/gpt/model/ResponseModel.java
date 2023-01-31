package com.chatgpt.gpt.model;

import java.util.ArrayList;
import java.util.List;

public class ResponseModel {
	
	private List<String> choices = new ArrayList<>();

	public List<String> getChoices() {
		return choices;
	}

	public void setChoices(List<String> choices) {
		this.choices = choices;
	}

}
