package com.thanhduyuit.model;

import java.util.List;

import com.thanhduyuit.entities.Good;

public class GoodStandardResponse extends MessageResponse {
	
	private List<Good> listgoods;
	
	
	public GoodStandardResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodStandardResponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}

	public GoodStandardResponse(String message, long statuscode, List<Good> listgoods) {
		super(message, statuscode);
		this.listgoods = listgoods;
	}

	public List<Good> getListgoods() {
		return listgoods;
	}

	public void setListgoods(List<Good> listgoods) {
		this.listgoods = listgoods;
	}
	
	
	

}
