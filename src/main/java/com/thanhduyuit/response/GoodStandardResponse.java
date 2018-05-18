package com.thanhduyuit.response;

import java.util.List;

import com.thanhduyuit.model.GoodResponse;

public class GoodStandardResponse extends MessageResponse {
	
	private List<GoodResponse> listgoods;
	
	
	public GoodStandardResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodStandardResponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}

	public GoodStandardResponse(String message, long statuscode, List<GoodResponse> listgoods) {
		super(message, statuscode);
		this.listgoods = listgoods;
	}

	public List<GoodResponse> getListgoods() {
		return listgoods;
	}

	public void setListgoods(List<GoodResponse> listgoods) {
		this.listgoods = listgoods;
	}
	
	
	

}
