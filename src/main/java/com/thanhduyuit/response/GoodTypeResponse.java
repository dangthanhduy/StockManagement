package com.thanhduyuit.response;

import java.util.List;

import com.thanhduyuit.entities.GoodType;

public class GoodTypeResponse extends MessageResponse {

	private List<GoodType> listGoodType;

	public GoodTypeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodTypeResponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}

	public GoodTypeResponse(String message, long statuscode, List<GoodType> listGoodType) {
		super(message, statuscode);
		this.listGoodType = listGoodType;
	}

	public List<GoodType> getListGoodType() {
		return listGoodType;
	}

	public void setListGoodType(List<GoodType> listGoodType) {
		this.listGoodType = listGoodType;
	}

}
