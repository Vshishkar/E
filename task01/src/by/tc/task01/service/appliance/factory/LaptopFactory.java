package by.tc.task01.service.appliance.factory;

import java.util.Map;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.Laptop;

public class LaptopFactory implements ApplianceBuildingService {

	@Override
	public Appliance buildAppliance(Map<String, String> params) {				
		by.tc.task01.entity.appliance.Laptop laptop = new by.tc.task01.entity.appliance.Laptop();				
		
		
		laptop.setBatteryCapacity( Double.parseDouble(params.get(Laptop.BATTERY_CAPACITY.toString())));
		laptop.setCpu(params.get(Laptop.CPU.toString()));
		laptop.setDisplayInches(Double.parseDouble(params.get(Laptop.DISPLAY_INCHS.toString())));
		laptop.setMemoryRom(Double.parseDouble(params.get(Laptop.MEMORY_ROM.toString())));
		laptop.setOs(params.get(Laptop.OS.toString()));
		laptop.setSystemMemory(Double.parseDouble(params.get(Laptop.SYSTEM_MEMORY.toString())));
							
		return laptop;
	}

}
