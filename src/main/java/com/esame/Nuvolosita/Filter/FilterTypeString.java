package com.esame.Nuvolosita.Filter;

import java.util.ArrayList;

public class FilterTypeString {
	
		protected ArrayList<String> param = new ArrayList<String>();

		
		/** Costruttore 
		 * @param parametri deve essere un ArrayList String.
		 * @throws IllegalArgumentException parametri non è del tipo richiesto. 
		*/
		public FilterTypeString(Object parametri) {
			
			if(parametri instanceof ArrayList<?>) {
				
				for(Object ele : (ArrayList<?>)parametri) {
					
					if(ele instanceof String) {
						param.add((String)ele);
					}else {
						throw new IllegalArgumentException("Type: String ");
					}
				}

			}else {			
				throw new IllegalArgumentException("Type: Array ");
			}
		}
		
		
		/** Set 
		 * @param parametri deve essere un ArrayList di stringhe
		 * @throws IllegalArgumentException parametri non è del tipo richiesto. 
		*/
		public void SetParametriFiltro(Object parametri) {
			
			
			if(parametri instanceof ArrayList<?>) {
				
				for(Object ele : (ArrayList<?>)parametri) {
					
					if(ele instanceof String) {
						param.add((String)ele);
					}else {
						throw new IllegalArgumentException("Type: String ");
					}
				}

			}else {			
				throw new IllegalArgumentException("Type: Array ");
			}
		}
		
		

}
