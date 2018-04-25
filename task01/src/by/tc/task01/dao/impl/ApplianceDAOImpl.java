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
import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.appliance.factory.ApplianceFactory;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements  ApplianceDAO {

	

	private static String root = System.getProperty("user.dir");
	private static String src = "/src/by/tc/task01/dao/appliances_db.txt";
	
	
	
	@Override
	public <E> List<Appliance> find(Criteria<E> criteria) {
						
		ArrayList<Appliance> result = new ArrayList<>();
		
		ArrayList<String> appliances =  readAllAppliance();
		// спорный момент,т.к при большой базе данных не выгодно читать все строки
		
		
		for (String appliance: appliances){
			if(checkAppliance(appliance,criteria)){				
				Map<String,String> params = getKeysAndValues(appliance);
				Appliance object =ApplianceFactory.buildAppliance(params,criteria.getGroupSearchName().getSimpleName()); 			
				result.add(object);
			}
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
	
	
	public static <E> boolean checkAppliance(String appliance,Criteria<E> criteria){
		
		String[] typeAndAttributes = appliance.split(":");
		
		if(criteria.getGroupSearchName().getSimpleName().equals(typeAndAttributes[0])){ //проверка совпадения типа 
			
			String [] keysAndValues = typeAndAttributes[1].split(",");		
			Set<E> keys = criteria.keySet();			
			
			int counter = 0;
			
			for(E key : keys){		
				
				Object value = criteria.getValue(key);				
				String checkString = key.toString() + "=" + value.toString();				
				
				
				for(String keyAndValue:keysAndValues){					
					if(keyAndValue.contains(checkString)){						
						counter++;					
					}
				}
				
			}
			
			if(counter == keys.size()){
				return true;
			}
			else{
				return false;
			}
			
		}
		else{
			return false;
		}
		
	}
	
	
	public static ArrayList<String> readAllAppliance() {
		ArrayList<String> products = new ArrayList<>();
		try (BufferedReader bf = new BufferedReader(new FileReader(root + src))){
			while (bf.ready()) {
				String line = bf.readLine();
				if(!line.isEmpty()) {
					products.add(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return products;
	}
	
}
