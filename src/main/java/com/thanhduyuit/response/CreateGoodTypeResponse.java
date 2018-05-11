package com.thanhduyuit.response;

import com.thanhduyuit.model.GoodTypeModelCreate;

public class CreateGoodTypeResponse extends MessageResponse {

	private Long goodTypeID;

	private GoodTypeModelCreate goodTypeModel;

	public CreateGoodTypeResponse(Long goodTypeID, GoodTypeModelCreate goodTypeModel) {
		super();
		this.goodTypeID = goodTypeID;
		this.goodTypeModel = goodTypeModel;
	}

	public Long getGoodTypeID() {
		return goodTypeID;
	}

	public void setGoodTypeID(Long goodTypeID) {
		this.goodTypeID = goodTypeID;
	}

	public GoodTypeModelCreate getGoodTypeModel() {
		return goodTypeModel;
	}

	public void setGoodTypeModel(GoodTypeModelCreate goodTypeModel) {
		this.goodTypeModel = goodTypeModel;
	}

	public CreateGoodTypeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateGoodTypeResponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}


}
