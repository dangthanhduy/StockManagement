package com.thanhduyuit.response;

public class CreateGoodResponse extends MessageResponse {
	
	private Long goodID;

	public Long getGoodID() {
		return goodID;
	}

	public void setGoodID(Long goodID) {
		this.goodID = goodID;
	}

	public CreateGoodResponse(String message, long statuscode, Long goodID) {
		super(message, statuscode);
		this.goodID = goodID;
	}

	public CreateGoodResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateGoodResponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}
	
	
}
