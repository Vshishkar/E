package by.tc.task01.main;


import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.List;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Runner {
	
	public static void main(String[] args){
		
		List<Appliance> appliances ;
		
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();
		
		Criteria<Laptop> criteriaLaptop = new Criteria<>(Laptop.class);
			
		criteriaLaptop.add(Laptop.MEMORY_ROM,4000);
						
		appliances = service.find(criteriaLaptop);
		
		System.out.println(appliances.toString());
		
		
		// --------------------------------------------
		
		Criteria<Oven> criteriaOven = new Criteria<>(Oven.class);
		criteriaOven.add(Oven.CAPACITY,33);
		
		appliances = service.find(criteriaOven);
		
		System.out.println(appliances.toString());
		
		
		
		
	}

}
