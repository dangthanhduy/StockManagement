package com.thanhduyuit.response;

import java.util.List;

import com.thanhduyuit.model.ActivityLogModel;

public class StaticLogModelResponse extends StockLogResponse {
	
	private double totalImport;
	
	private double totalExport;

	public double getTotalImport() {
		return totalImport;
	}

	public void setTotalImport(double totalImport) {
		this.totalImport = totalImport;
	}

	public double getTotalExport() {
		return totalExport;
	}

	public void setTotalExport(double totalExport) {
		this.totalExport = totalExport;
	}

	public StaticLogModelResponse(double totalImport, double totalExport) {
		super();
		this.totalImport = totalImport;
		this.totalExport = totalExport;
	}

	public StaticLogModelResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StaticLogModelResponse(String message, long statuscode, List<ActivityLogModel> listLog) {
		super(message, statuscode, listLog);
		// TODO Auto-generated constructor stub
	}

	public StaticLogModelResponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}
	
}
