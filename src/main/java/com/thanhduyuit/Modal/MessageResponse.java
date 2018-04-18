package com.thanhduyuit.Modal;

import java.util.List;

public class MessageResponse {
	
	private String message;
	
	private long statuscode;
	
	private List<Object> listOjects;
	
	public MessageResponse(String message, long statuscode, List<Object> listOjects) {
		super();
		this.message = message;
		this.statuscode = statuscode;
		this.listOjects = listOjects;
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

	public List<Object> getListOjects() {
		return listOjects;
	}

	public void setListOjects(List<Object> listOjects) {
		this.listOjects = listOjects;
	}
	
}
