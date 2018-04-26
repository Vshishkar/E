package by.tc.task01.entity.criteria;

public final class SearchCriteria {
	
	public static enum Oven{
		POWER_CONSUMPTION,WEIGHT,CAPACITY,DEPTH,HEIGHT,WIDTH
	}
	
	public static enum Laptop{
		BATTERY_CAPACITY,OS,MEMORY_ROM,SYSTEM_MEMORY,CPU,DISPLAY_INCHS
	}
	

	public static enum Refrigerator{
		POWER_CONSUMPTION,WEIGHT,FREEZER_CAPACITY,OVERAL_CAPACITY,HEIGHT,WIDTH
	}
	
	public static enum VacuumCleaner{
		POWER_CONSUMPTION,FILTER_TYPE,BAG_TYPE,WAND_TYPE,MOTOR_SPEED_REGULATION,CLEANING_WIDTH
	}
	
	public static enum TabletPC{
		BATTARY_CAPACITY,DISPLAY_INCHS,MEMORY_ROM,FLASH_MEMORY_CAPACITY,COLOR
	}
	
	public static enum Speakers{
		POWER_CONSUMPTION,NUMBER_OF_SPEAKERS,FREQUENCY_RANGE,CORD_LENGTH
	}
	
	public static enum TextBook{
		TITLE,SUBJECT,AUTHOR,NUMBER_OF_PAGES
	}
	
	public static enum Newspaper{
		TITLE,PERIODICITY,PAID_OR_FREE
	}
	
	private SearchCriteria(){}
	
	//Чтобы запретить наследование используем private конструктор & final class 
		
}
