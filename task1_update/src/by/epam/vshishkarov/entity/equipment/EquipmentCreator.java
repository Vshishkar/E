package by.epam.vshishkarov.entity.equipment;

public class EquipmentCreator {
	
	public Equipment createByString(String string){
		Equipment result = new Equipment();
		String[] type = string.split(":");
		result.setType(type[0]);
		
		String[] params = type[1].split(",");
		for (String param :params){
			String[] values = param.split("=");
			Attribute attr = new Attribute(values[0],values[1]);
			result.addAtribute(attr);
		}
		return result;
	}

}
