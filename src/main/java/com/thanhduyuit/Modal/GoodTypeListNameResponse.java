package com.thanhduyuit.Modal;

import java.util.Map;

public class GoodTypeListNameResponse extends MessageResponse {

	private Map<Long, String> listGoodTypeName;

	public Map<Long, String> getListGoodTypeName() {
		return listGoodTypeName;
	}

	public void setListGoodTypeName(Map<Long, String> listGoodTypeName) {
		this.listGoodTypeName = listGoodTypeName;
	}

	public GoodTypeListNameResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodTypeListNameResponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}

	public GoodTypeListNameResponse(String message, long statuscode, Map<Long, String> listGoodTypeName) {
		super(message, statuscode);
		this.listGoodTypeName = listGoodTypeName;
	}

}
