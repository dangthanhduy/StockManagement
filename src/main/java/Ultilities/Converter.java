package Ultilities;

import com.thanhduyuit.entities.GoodType;
import com.thanhduyuit.entities.Provider;
import com.thanhduyuit.entities.Unit;
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

}
