package Ultilities;

import java.util.ArrayList;
import java.util.List;

import com.thanhduyuit.entities.Good;
import com.thanhduyuit.entities.GoodType;
import com.thanhduyuit.entities.Provider;
import com.thanhduyuit.entities.Unit;
import com.thanhduyuit.model.GoodModelCreate;
import com.thanhduyuit.model.GoodResponse;
import com.thanhduyuit.model.GoodTypeModelCreate;
import com.thanhduyuit.model.ProviderModelCreate;
import com.thanhduyuit.model.UnitModelCreate;

public class Converter {
	
	
	public static GoodTypeModelCreate goodTypeToModelCreate(GoodType entity) {
		GoodTypeModelCreate response = new GoodTypeModelCreate(entity.getCode(), entity.getDecription(), entity.getTypeName());
		
		return response;
	}
	
	public static ProviderModelCreate providerToModelCreate(Provider entity) {
		ProviderModelCreate response = new ProviderModelCreate(entity.getProviderName(), entity.getPhoneNumber(), entity.getDecription(), entity.getVote(), entity.getAddress());
		return response;
	}
	
	public static UnitModelCreate unitToModelCreate(Unit entity) {
		UnitModelCreate response = new UnitModelCreate(entity.getUnit(), entity.getDescription());
		return response;
	}
	
	public static GoodModelCreate goodToModelCreate(Good entity) {
		GoodModelCreate reponse  = new GoodModelCreate(entity.getName(),entity.getCode(),entity.getType(),entity.getUnit(),entity.getImagePath(),Long.toString(entity.getProvider().getId()), Double.toString(entity.getImportPrice()),Double.toString(entity.getExportPrice()));
		return reponse;
	}
	
	public static List<GoodResponse> goodEntityToGoodResponse(List<Good> listEntities) {
		List<GoodResponse> response = new ArrayList<>();
		
		for (Good good : listEntities){
			GoodResponse goodResponse =  new GoodResponse();
			goodResponse.setCode(good.getCode());
			goodResponse.setExportPrice(good.getExportPrice());
			goodResponse.setGoodType(good.getGoodType());
			goodResponse.setId(good.getId());
			goodResponse.setImagePath(good.getImagePath());
			goodResponse.setImportPrice(good.getImportPrice());
			goodResponse.setName(good.getName());
			goodResponse.setProvider(good.getProvider());
			goodResponse.setQuantity(good.getQuantity());
			goodResponse.setType(good.getType());
			goodResponse.setUnit(good.getUnit());
			response.add(goodResponse);
		}
		return response;
	}

}
