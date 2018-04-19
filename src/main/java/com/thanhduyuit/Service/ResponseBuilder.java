package com.thanhduyuit.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thanhduyuit.Modal.MessageResponse;

@Service
public class ResponseBuilder {

	public MessageResponse createGoodBuilder(String contents) {
		MessageResponse response = new MessageResponse();
		if (contents == null) {
			response.setStatuscode(500);
			response.setMessage("Cannot get list goods...!");
			return response;
		} else {
			response.setStatuscode(200);
			response.setMessage("Success");
			response.setContents(contents);
			return response;
		}

	}

}
