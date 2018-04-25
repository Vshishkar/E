package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria<E> {
	
	private Class<E> groupSearchName;
	private Map<E,Object> criteria = new HashMap<>();
	
	public Criteria (Class<E> groupSearchName){
		this.groupSearchName = groupSearchName;
	}
	
	
	public Class<E> getGroupSearchName() {
		return groupSearchName;
	}
	public void setGroupSearchName(Class<E> groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public void add(E searchCriteria,Object value){
		criteria.put(searchCriteria, value);
		
	}
	
	public Set<E> keySet(){
		
		return  criteria.keySet();
	}
	
	public Object getValue(E key){
		return criteria.get(key);
	}
	
	
}
