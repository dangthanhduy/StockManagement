package com.thanhduyuit.response;

import com.thanhduyuit.model.ProviderModelCreate;

public class CreateProviderResponse extends MessageResponse {
	private Long providerID;

	private ProviderModelCreate providerModel;

	public Long getProviderID() {
		return providerID;
	}

	public void setProviderID(Long providerID) {
		this.providerID = providerID;
	}

	public ProviderModelCreate getProviderModel() {
		return providerModel;
	}

	public void setProviderModel(ProviderModelCreate providerModel) {
		this.providerModel = providerModel;
	}

	public CreateProviderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateProviderResponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}

	public CreateProviderResponse(String message, long statuscode, Long providerID, ProviderModelCreate providerModel) {
		super(message, statuscode);
		this.providerID = providerID;
		this.providerModel = providerModel;
	}

}
