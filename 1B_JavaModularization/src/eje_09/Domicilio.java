package eje_09;

public class Domicilio {
	
	private String calle;
	private String barrio;
	private int altura;
	
	public Domicilio(String calle,String barrio,int altura) {
		this.setAltura(altura);
		this.setBarrio(barrio);
		this.setCalle(calle);
	}
	
	public String getCalle() {
		return calle;
	}
	private void setCalle(String calle) {
		this.calle = calle;
	}
	public String getBarrio() {
		return barrio;
	}
	private void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public int getAltura() {
		return altura;
	}
	private void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", barrio=" + barrio + ", altura=" + altura + "]";
	}
}
