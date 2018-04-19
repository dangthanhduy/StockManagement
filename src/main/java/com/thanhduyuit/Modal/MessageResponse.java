package com.thanhduyuit.Modal;

import java.util.List;

public class MessageResponse {

	private String message;

	private long statuscode;

	private String contents;

	public MessageResponse(String message, long statuscode, String listOjects) {
		super();
		this.message = message;
		this.statuscode = statuscode;
		this.contents = listOjects;
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

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

}
