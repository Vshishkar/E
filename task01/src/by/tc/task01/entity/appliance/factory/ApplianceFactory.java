package by.tc.task01.entity.appliance.factory;

import java.util.Map;

import by.tc.task01.entity.appliance.Appliance;

public class ApplianceFactory {
	
	public static Appliance buildAppliance(Map<String, String> appliance,String type){
							
		ApplianceBuildingService buildAppliance;
		
		switch(type){
		
		case "Oven":{
			buildAppliance = new OvenFactory();
			break;
		}
		case "Laptop":{
			buildAppliance = new LaptopFactory();
			break;
			
		}
		case "Newspaper":{
			buildAppliance = new NewspaperFactory();
			break;
		}
		case "Refrigerator":{
			buildAppliance = new RefrigeratorFactory();
			break;
		}
		case "Speakers":{
			buildAppliance = new SpeakersFactory();
			break;
		}
		case "TabletPC":{
			buildAppliance = new TabletPCFactory();
			break;
		}
		case "TextBook":{
			buildAppliance = new TextBookFactory();
			break;
		}
		case "VacuumCleaner":{
			buildAppliance = new VacuumCleanerFactory();
			break;
		}
		default:{
			return null;
		}		
		
		}
		return buildAppliance.buildAppliance(appliance);
		
	}

}
