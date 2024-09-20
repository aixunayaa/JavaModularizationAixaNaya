package eje_09;

public class Persona {
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	private String dni;
	
	public Persona(String nombre, String apellido, Domicilio miDomicilio, String dni) {
		this.setApellido(apellido);
		this.setDni(dni);
		this.setNombre(nombre);
		this.setDomicilio(miDomicilio);
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public String getDni() {
		return dni;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	private void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	private void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", dni=" + dni
				+ "]";
	}
	
	}
	
	

