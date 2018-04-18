package by.epam.vshishkarov.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
	
	
	private static String root = System.getProperty("user.dir");
	private static String src = "/src/by/epam/vshishkarov/entity/appliances_db.txt";
	
	public static List<String> readAllAppliance() {
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
	
	public static List<String> readApplianceGroup(String groupName) {
		ArrayList<String> products = new ArrayList<>();
		try (BufferedReader bf = new BufferedReader(new FileReader(root + src))){
			while (bf.ready()) {
				String line = bf.readLine();
				if (line.startsWith(groupName)) {
					products.add(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return products;
	}

}