package by.tc.task01.entity.appliance;

public class Newspaper extends Appliance {
	
	private String title;
	private String paidOrFree;
	private String numberOfPeriodocity;
	
	
	public Newspaper(){
		
	}
	
	public Newspaper(String title,String paidOrFree,String numberOfPeriodocity){
		this.title = title;
		this.numberOfPeriodocity = numberOfPeriodocity;
		this.paidOrFree = paidOrFree;	
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPaidOrFree() {
		return paidOrFree;
	}
	public void setPaidOrFree(String paidOrFree) {
		this.paidOrFree = paidOrFree;
	}
	public String getNumberOfPeriodocity() {
		return numberOfPeriodocity;
	}
	public void setNumberOfPeriodocity(String numberOfPeriodocity) {
		this.numberOfPeriodocity = numberOfPeriodocity;
	}

}
