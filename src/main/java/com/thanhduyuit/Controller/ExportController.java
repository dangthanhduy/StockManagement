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
}
