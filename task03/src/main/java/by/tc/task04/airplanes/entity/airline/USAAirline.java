package by.tc.task04.airplanes.entity.airline;

public class USAAirline extends AbstractAirline {
	/*	
	 * This is a list of airline codes.
	 * The table lists IATA's two-character airline designators
	 * */
	private String IATA;

	public String getIATA() {
		return IATA;
	}

	public void setIATA(String iATA) {
		IATA = iATA;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result*prime + IATA.hashCode();
		result = result*prime + super.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if (obj == this ) return true;
		if (!(obj instanceof USAAirline)) return false;
		
		USAAirline airline = (USAAirline) obj;
		return this.getIATA().equals(airline.getIATA()) && super.equals(airline);
		
	}

	@Override
	public String toString() {
		return super.toString() + "IATA : " + IATA;
	}  
	
	
}
