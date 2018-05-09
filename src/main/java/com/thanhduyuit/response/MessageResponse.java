package com.thanhduyuit.response;


public class MessageResponse {

	private String message;

	private long statuscode;


	public MessageResponse(String message, long statuscode) {
		super();
		this.message = message;
		this.statuscode = statuscode;
	}

	public MessageResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(long statuscode) {
		this.statuscode = statuscode;
	}

}
