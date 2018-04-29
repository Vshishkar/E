package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public final class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria){
		
		Set<E> keys = criteria.keySet();
		
		for(E key : keys){	
			if(criteria.getValue(key) == null){
				return false;
			}
		}
		 return true;				
	}
	
	private Validator(){}
}
