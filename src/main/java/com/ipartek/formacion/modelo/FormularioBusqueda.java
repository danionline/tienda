package com.ipartek.formacion.modelo;

public class FormularioBusqueda {
	
	private String nombre;
	private float precioMin;
	private float precioMax;
	private int idFabricante;
	
	public FormularioBusqueda() {
		super();
		this.nombre = "";
		this.precioMin = 0;
		this.precioMax = 0;
		this.idFabricante = 0;
	}
	
	

	public FormularioBusqueda(String nombre, String precioMin, String precioMax, String idFabricante) {
		this();
		this.setNombre(nombre);
		this.setPrecioMin(precioMin);
		this.setPrecioMax(precioMax);
		this.setIdFabricante(idFabricante);
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if( nombre == null ) {
			this.nombre = "";
		}else {
			this.nombre = nombre.trim();
		}	
	}

	public float getPrecioMin() {
		return precioMin;
	}

	public void setPrecioMin(float precioMin) {
		this.precioMin = precioMin;
	}
	
	public void setPrecioMin(String precioMin) {
		if ( precioMin == null  ) {
			this.precioMin = 0;
			
		}else if ( "".equals(precioMin.trim()) ) {			
			this.precioMin = 0;
			
		}else {	
			
			this.precioMin = Float.parseFloat(precioMin);
		}	
	}

	public float getPrecioMax() {
		return precioMax;
	}

	public void setPrecioMax(float precioMax) {
		this.precioMax = precioMax;
	}
	
	public void setPrecioMax(String precioMax) {
		if ( precioMax == null  ) {
			this.precioMax = 0;
			
		}else if ( "".equals(precioMax.trim()) ) {			
			this.precioMax = 0;
			
		}else {	
			
			this.precioMax = Float.parseFloat(precioMax);
		}	
	}

	public int getIdFabricante() {
		return idFabricante;
	}

	public void setIdFabricante(int idFabricante) {
		this.idFabricante = idFabricante;
	}
	
	public void setIdFabricante(String idFabricante) {
		if ( idFabricante == null ) {
			this.idFabricante = 0;
			
		}else if ( "".equals(idFabricante.trim())  ) {
			this.idFabricante = 0;
			
		}else {	
			this.idFabricante = Integer.parseInt(idFabricante);
		}
		
	}

	@Override
	public String toString() {
		return "FormularioBusqueda [nombre=" + nombre + ", precioMin=" + precioMin + ", precioMax=" + precioMax
				+ ", idFabricante=" + idFabricante + "]";
	}
	

}
