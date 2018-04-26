package by.tc.task01.dao.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import by.tc.task01.entity.criteria.Criteria;

public class ApplianceParserImpl implements ApplianceParser {

	@Override
	public ArrayList<String> parse(String path) {
		ArrayList<String> result = new ArrayList<>();
		try (BufferedReader bf = new BufferedReader(new FileReader(path))){
			while (bf.ready()) {
				String line = bf.readLine();
				if(!line.isEmpty()) {
					result.add(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public <E> ArrayList<String> parse(String path, Criteria<E> criteria) {
		ArrayList<String> result = new ArrayList<>();
		try (BufferedReader bf = new BufferedReader(new FileReader(path))){
			while (bf.ready()) {
				String line = bf.readLine();
				if(!line.isEmpty()) {
					if(checkAppliance(line,criteria)){
						result.add(line);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
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

}
