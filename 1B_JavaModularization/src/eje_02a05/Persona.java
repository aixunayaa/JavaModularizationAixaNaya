package eje_02a05;

public class Persona {
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	
	public Persona (){
		this.ponerApellido("");
		this.ponerNombre("");
		// EJECUTO LA INSTANCIACION DE DEL OBJETO DOMICILIO
		//this.domicilio = new Domicilio();
	}
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
		//System.out.println("estoy mostrando el this: "+this);
	}
	public void ponerApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	
	public String obtenerNombreCompleto() {
		return this.getNombre()+" "+this.getApellido();
		//return this.nombre+" "+this.apellido;
	}
	public void setDomicilio(Domicilio domicilio) {
		// piso la intancia por otra instancia
		this.domicilio = domicilio;
	}
	public void setDomicilio(String calle, String ciudad, int numero) {
		//this.domicilio.setCalle(calle);
		Domicilio domicilio = new Domicilio();
		domicilio.setCalle(calle);
		domicilio.setCiudad(ciudad);
		domicilio.setNumero(numero);
		this.domicilio = domicilio;
		
	}
	public void mostrarDomicilio() {
		if(this.domicilio != null) {
			// LO PUEDO MOSTRAR POR EL TOSTRING
			System.out.println(this.domicilio);
		}else {
			System.out.println("No tiene domicilio");
		}
	}

}



