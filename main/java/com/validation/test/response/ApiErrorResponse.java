package com.validation.test.response;

import java.util.List;

public class ApiErrorResponse {
    private String status;
    private String code;
    private List<String> messages;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<String> getMessages() {
		return messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	
	public ApiErrorResponse() {
		super();
	}

	

  
    
}
