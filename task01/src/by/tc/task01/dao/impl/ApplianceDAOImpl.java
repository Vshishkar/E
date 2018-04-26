package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.parser.ApplianceParser;
import by.tc.task01.dao.parser.ApplianceParserImpl;
import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.appliance.factory.ApplianceFactory;

public class ApplianceDAOImpl implements  ApplianceDAO {

	

	private static String root = System.getProperty("user.dir");
	private static String src = "/src/appliances_db.txt";
	
	
	
	@Override
	public <E> List<Appliance> find(Criteria<E> criteria) {
						
		ArrayList<Appliance> result = new ArrayList<>();
		
		ApplianceParser applianceParser = new ApplianceParserImpl();
		
		ArrayList<String> appliances =  applianceParser.parse(root+src,criteria);
				
		for (String appliance: appliances){														
			Map<String,String> params = getKeysAndValues(appliance);		
			Appliance object = ApplianceFactory.buildAppliance(params,criteria.getGroupSearchName().getSimpleName()); 			
			result.add(object);			
		}		
		return result;
	}

	public static Map<String,String> getKeysAndValues(String appliance){
		
		Map<String,String> result = new HashMap<>();
		
		String[] typeAndAttributes = appliance.split(":");
		
		String [] keysAndValues = typeAndAttributes[1].split(",");	
		
		for(String keyAndValue:keysAndValues){
			String [] params = keyAndValue.split("=");
			result.put(params[0].trim(),params[1].trim());
		}
						
		return result;
		
	}
	
	
	
}
