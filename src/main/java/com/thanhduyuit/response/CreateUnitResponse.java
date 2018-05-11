package com.thanhduyuit.response;

import com.thanhduyuit.model.UnitModelCreate;

public class CreateUnitResponse extends MessageResponse {

	private Long unitID;

	private UnitModelCreate unitModel;

	public Long getUnitID() {
		return unitID;
	}

	public void setUnitID(Long unitID) {
		this.unitID = unitID;
	}

	public UnitModelCreate getUnitModel() {
		return unitModel;
	}

	public void setUnitModel(UnitModelCreate unitModel) {
		this.unitModel = unitModel;
	}

	public CreateUnitResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateUnitResponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}

}
