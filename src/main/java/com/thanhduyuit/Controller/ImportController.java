package com.thanhduyuit.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.thanhduyuit.DAO.GoodTypeDao;
import com.thanhduyuit.DAO.ProviderDao;
import com.thanhduyuit.Modal.MessageResponse;
import com.thanhduyuit.Service.ImportService;
import com.thanhduyuit.Service.ResponseBuilder;
import com.thanhduyuit.entities.Good;

@Controller
public class ImportController {
	
	
	@Autowired
	private ProviderDao providerDao;
	
	@Autowired
	private GoodTypeDao goodTypeDao;
	
	@Autowired
	private ImportService importer;
	
	@Autowired
	private ResponseBuilder responseRuilder;
	
	@RequestMapping("/getAllGood")
	@ResponseBody
	public MessageResponse getAllGoods() throws Exception {
		Gson gson = new Gson();
		List<Good> response = new ArrayList<>();
		response = importer.getAllGoods();
		String json = gson.toJson(response.get(0));
		return responseRuilder.createGoodBuilder(json);
	}


//	@RequestMapping("/getAllGood")
//	@ResponseBody
//	public MessageResponse createGoodType(String name, String code, String description) throws Exception {
//		if (name.equalsIgnoreCase("undefined") || code.equalsIgnoreCase("undefined")
//				|| description.equalsIgnoreCase("undefined")) {
//			throw new Exception("Invalid data");
//		}
//		GoodType goodType = null;
//		Message message= null;
//		try {
//			goodType = new GoodType(name, code, description);
//			goodTypeDao.save(goodType);
//			
//			message = new Message("401", "Failed");
//		} catch (Exception ex) {
//			return null;
//		}
//		System.out.println("GoodType succesfully created! (id = " + goodType.getId() + ")"); 
//		return message;
//	}
}
