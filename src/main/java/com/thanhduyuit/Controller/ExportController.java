package com.thanhduyuit.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thanhduyuit.DAO.GoodDao;
import com.thanhduyuit.DAO.GoodTypeDao;
import com.thanhduyuit.entities.Good;
import com.thanhduyuit.entities.GoodType;
import com.thanhduyuit.entities.Receipt;

@Controller
public class ExportController {

	@Autowired
	private GoodDao goodDao;
	
	@Autowired
	private GoodTypeDao goodTypeDao;

	@RequestMapping("/getallgoods")
	@ResponseBody
	public List<Good> getAllGood() throws Exception {
		List<Good> response = new ArrayList<>();
		response = (List<Good>) goodDao.findAll();
		return response;
	}
	
	@RequestMapping("/getallgoodtypes")
	@ResponseBody
	public List<GoodType> getAllGoodTypes() throws Exception {
		List<GoodType> response = new ArrayList<>();
		response = (List<GoodType>) goodTypeDao.findAll();
		return response;
	}
	
	@RequestMapping("/getgoodbyid")
	@ResponseBody
	public Good getGoodById(long goodId) throws Exception {
		Good good  =  goodDao.findOne(goodId);
		GoodType gt = goodTypeDao.findOne(1L);
		if (good != null) return good;
		else {
			return new Good("name","code","type","unit",gt,1L);
		}
		
	}
	
	
	@RequestMapping("/getgoodbycreceipt")
	@ResponseBody
	public int getGoodByReceipt(long goodId) throws Exception {
		Good good  =  goodDao.findOne(goodId);
		return good.getListReceipt().size();
	}
}
