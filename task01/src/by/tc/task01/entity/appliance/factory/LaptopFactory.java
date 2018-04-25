package by.tc.task01.entity.appliance.factory;

import java.util.Map;

import by.tc.task01.entity.appliance.Appliance;
import by.tc.task01.entity.appliance.Laptop;

public class LaptopFactory implements ApplianceBuildingService {

	@Override
	public Appliance buildAppliance(Map<String, String> params) {				
		Laptop laptop = new Laptop();				
		
		laptop.setBatteryCapacity( Double.parseDouble(params.get("BATTERY_CAPACITY")));
		laptop.setCpu(params.get("CPU"));
		laptop.setDisplayInches(Double.parseDouble(params.get("DISPLAY_INCHS")));
		laptop.setMemoryRom(Double.parseDouble(params.get("MEMORY_ROM")));
		laptop.setOs(params.get("OS"));
		laptop.setSystemMemory(Double.parseDouble(params.get("SYSTEM_MEMORY")));
							
		return laptop;
	}

}
