package by.epam.vshishkarov.entity;
import java.util.HashMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epam.vshishkarov.entity.equipment.Equipment;
import by.epam.vshishkarov.entity.equipment.EquipmentCreator;


public class Runner {
	
	public static void main(String[] args) {
		System.out.println("Chose appliance or press <Enter>:");
		Scanner sc = new Scanner(System.in);
		String groupName = sc.nextLine();
		List<String> products;
		if (groupName.equals("")) {
			products = Reader.readAllAppliance();
		} else {
			products = Reader.readApplianceGroup(groupName);
		}
		if (products.isEmpty()) {
			System.out.println("Nothing was found");
		} else {		
			System.out.println("Define properties:");
			String paramLine = sc.nextLine();
			HashMap<String, String> parameters = getParameters(paramLine);
			ArrayList<Equipment> queryResults =  getQueryResults(products, parameters);
			System.out.println(queryResults.toString());			
		}
	}
	
	
	
	private static ArrayList<Equipment> getQueryResults(List<String> products, HashMap<String, String> parameters) {
		ArrayList<Equipment> result = new ArrayList<>();
		Iterator<String> iterator = products.iterator();
		while(iterator.hasNext()) {
			String product = iterator.next();
			HashMap<String, String> productParameters = getParameters(product);
			boolean mismatche = false;
			for (String key : parameters.keySet()) {
				if (!parameters.get(key).equals(productParameters.get(key))) {
					mismatche = true;					
					break;	
				}				
			}
			if (mismatche) {
				iterator.remove();
			}
			else{
				EquipmentCreator ec = new EquipmentCreator();
				Equipment e = ec.createByString(product);							
				result.add(e);
				
			}
		}
		return result;
	}
	
	
	private static HashMap<String, String> getParameters(String paramLine){
		String regex = "([A-za-z0-9_]+)=([A-za-z0-9_.]+)";
		HashMap<String, String> parameters = new HashMap<>();
		Pattern parameterPattern = Pattern.compile(regex);
		Matcher matcher = parameterPattern.matcher(paramLine);
		while (matcher.find()) {
			String paramName = matcher.group(1).toUpperCase();
			String paramValue = matcher.group(2);
			parameters.put(paramName, paramValue);
		}
		return parameters;
	}

}