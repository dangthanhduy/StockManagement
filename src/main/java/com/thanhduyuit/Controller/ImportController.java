package com.thanhduyuit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thanhduyuit.DAO.GoodDao;
import com.thanhduyuit.DAO.GoodTypeDao;
import com.thanhduyuit.Service.Message;
import com.thanhduyuit.entities.Good;
import com.thanhduyuit.entities.GoodType;

@Controller
public class ImportController {
	
	
	@Autowired
	private GoodDao goodDao;
	
	@Autowired
	private GoodTypeDao goodTypeDao;
	
	@RequestMapping("/createGood")
	@ResponseBody
	public String createGood(String name, String type, String code, String unit, String price) throws Exception {
		if (name.equalsIgnoreCase("undefined") || type.equalsIgnoreCase("undefined")
				|| code.equalsIgnoreCase("undefined") || unit.equalsIgnoreCase("undefined")
				|| price.equalsIgnoreCase("undefined")) {
			throw new Exception("Invalid data");
		}
		Good good = null;
		double priceDouble = Double.parseDouble(price);
		GoodType goodType = new GoodType();
		goodType = goodTypeDao.findOne(1L);
		try {
			good = new Good(name, type, code, unit, goodType, priceDouble);
			goodDao.save(good);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
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
