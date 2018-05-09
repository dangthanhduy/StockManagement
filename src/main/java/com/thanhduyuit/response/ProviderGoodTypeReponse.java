package com.thanhduyuit.response;

import java.util.List;
import java.util.Map;

import com.thanhduyuit.model.GoodTypeModel;
import com.thanhduyuit.model.ProviderModel;
import com.thanhduyuit.model.UnitTypeModel;

public class ProviderGoodTypeReponse extends MessageResponse {

	private List<ProviderModel> listProviderName;

	private List<GoodTypeModel> listGoodTypeName;

	private List<UnitTypeModel> listUnitType;

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

	public List<UnitTypeModel> getListUnitType() {
		return listUnitType;
	}

	public void setListUnitType(List<UnitTypeModel> listUnitType) {
		this.listUnitType = listUnitType;
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
