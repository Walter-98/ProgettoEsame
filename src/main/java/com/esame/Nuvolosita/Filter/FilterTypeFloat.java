package com.esame.Nuvolosita.Filter;

public class FilterTypeFloat {
		protected float parametroFiltro;
	
	
	/** Costruttore 
	 * @param parametroFiltro deve essere un float.
	 * @throws IllegalArgumentException parametri non è del tipo richiesto. 
	*/
	public FilterTypeFloat(Object parametroFiltro){
		
		if(parametroFiltro instanceof Float ) { 
			this.parametroFiltro =(Float)parametroFiltro;
		}else {
			throw new IllegalArgumentException("Type: Interger ");
		}
		
	}
		
	/** Set
	 * @param parametroFiltro deve essere un float.
	 * @throws IllegalArgumentException parametri non è del tipo richiesto. 
	*/
	public void setParametroFiltro(Object parametroFiltro) {
		
		if(parametroFiltro instanceof Float ) { 
			this.parametroFiltro =(Float)parametroFiltro;
		}else {
			throw new IllegalArgumentException("Type: Interger ");
		}
	}

	/** Set Overloading
	 *  
	*/
	public void setParametroFiltro(float parametroFiltro) {
		this.parametroFiltro = parametroFiltro;
	}

	public float getParametroFiltro() {
		return parametroFiltro;
	}
}

