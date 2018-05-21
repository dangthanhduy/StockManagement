package com.thanhduyuit.response;

public class ExportGoodResponse extends MessageResponse {

	private int quantityAfterchange;


	public int getQuantityAfterchange() {
		return quantityAfterchange;
	}

	public void setQuantityAfterchange(int quantityAfterchange) {
		this.quantityAfterchange = quantityAfterchange;
	}

	public ExportGoodResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExportGoodResponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}

	public ExportGoodResponse(String message, long statuscode, int quantitychange) {
		super(message, statuscode);
		this.quantityAfterchange = quantitychange;
	}

}
