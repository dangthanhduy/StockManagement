package com.thanhduyuit.model;

import java.util.List;
import java.util.Map;

public class ProviderGoodTypeReponse extends MessageResponse {

	private List<ProviderModel> listProviderName;

	private List<GoodTypeModel> listGoodTypeName;

	public List<ProviderModel> getListProviderName() {
		return listProviderName;
	}

	public void setListProviderName(List<ProviderModel> listProviderName) {
		this.listProviderName = listProviderName;
	}

	public List<GoodTypeModel> getListGoodTypeName() {
		return listGoodTypeName;
	}

	public void setListGoodTypeName(List<GoodTypeModel> listGoodTypeName) {
		this.listGoodTypeName = listGoodTypeName;
	}

	public ProviderGoodTypeReponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProviderGoodTypeReponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}

}
