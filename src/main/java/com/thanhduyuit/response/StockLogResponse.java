package com.thanhduyuit.response;

import java.util.List;

import com.thanhduyuit.model.ActivityLogModel;

public class StockLogResponse extends MessageResponse {

	private List<ActivityLogModel> listLog;

	public List<ActivityLogModel> getListLog() {
		return listLog;
	}

	public void setListLog(List<ActivityLogModel> listLog) {
		this.listLog = listLog;
	}

	public StockLogResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StockLogResponse(String message, long statuscode) {
		super(message, statuscode);
		// TODO Auto-generated constructor stub
	}

	public StockLogResponse(String message, long statuscode, List<ActivityLogModel> listLog) {
		super(message, statuscode);
		this.listLog = listLog;
	}

}
