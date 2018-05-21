package com.thanhduyuit.response;

public class ImportGoodResponse extends MessageResponse {
	private int quantitychange;

	public int getQuantitychange() {
		return quantitychange;
	}

	public void setQuantitychange(int quantitychange) {
		this.quantitychange = quantitychange;
	}

	public ImportGoodResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImportGoodResponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}

	public ImportGoodResponse(String message, long statuscode, int quantitychange) {
		super(message, statuscode);
		this.quantitychange = quantitychange;
	}

}
