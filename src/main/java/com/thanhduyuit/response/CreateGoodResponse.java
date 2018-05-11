package com.thanhduyuit.response;

import com.thanhduyuit.model.GoodModelCreate;

public class CreateGoodResponse extends MessageResponse {

	private Long goodID;

	private GoodModelCreate goodmodel;

	public Long getGoodID() {
		return goodID;
	}

	public void setGoodID(Long goodID) {
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

	public GoodModelCreate getGoodmodel() {
		return goodmodel;
	}

	public void setGoodmodel(GoodModelCreate goodmodel) {
		this.goodmodel = goodmodel;
	}

	public CreateGoodResponse(String message, long statuscode, Long goodID, GoodModelCreate goodmodel) {
		super(message, statuscode);
		this.goodID = goodID;
		this.goodmodel = goodmodel;
	}

}
