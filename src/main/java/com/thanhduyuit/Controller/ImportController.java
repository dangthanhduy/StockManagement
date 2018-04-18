package com.thanhduyuit.Controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thanhduyuit.DAO.GoodDao;
import com.thanhduyuit.DAO.GoodTypeDao;
import com.thanhduyuit.DAO.ProviderDao;
import com.thanhduyuit.Modal.MessageResponse;
import com.thanhduyuit.Service.ImportService;
import com.thanhduyuit.Service.Message;
import com.thanhduyuit.entities.Good;
import com.thanhduyuit.entities.GoodType;
import com.thanhduyuit.entities.Provider;
import com.thanhduyuit.entities.Stock;

@Controller
public class ImportController {
	
	
	@Autowired
	private GoodDao goodDao;
	
	@Autowired
	private ProviderDao providerDao;
	
	@Autowired
	private GoodTypeDao goodTypeDao;
	
	@Autowired
	private ImportService importer;
	
	@RequestMapping("/createGood")
	@ResponseBody
	public MessageResponse createGood(String name, String code, String type, String unit, String imagePath, double quantity,
			String importPrice, String exportPrice, String goodTypeID, String providerID) throws Exception {
		
		
		importer.createGood(name, code, type, unit, imagePath, quantity, importPrice, exportPrice, goodTypeID, providerID);
		
		return "User succesfully created! (id = " + good.getId() + ")";
	}


	@RequestMapping("/createGoodType")
	@ResponseBody
	public Message createGoodType(String name, String code, String description) throws Exception {
		if (name.equalsIgnoreCase("undefined") || code.equalsIgnoreCase("undefined")
				|| description.equalsIgnoreCase("undefined")) {
			throw new Exception("Invalid data");
		}
		GoodType goodType = null;
		Message message= null;
		try {
			goodType = new GoodType(name, code, description);
			goodTypeDao.save(goodType);
			
			message = new Message("401", "Failed");
		} catch (Exception ex) {
			return null;
		}
		System.out.println("GoodType succesfully created! (id = " + goodType.getId() + ")"); 
		return message;
	}
}
