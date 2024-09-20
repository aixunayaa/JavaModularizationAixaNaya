package eje_13;

public class SuperHeroe {
	private static final int MIN_VALOR_SUPERPODER = 0;
	private static final int MAX_VALOR_SUPERPODER = 100;
	private String nombre;
	private int fuerza;

	private int resistencia;
	private int poderes;

	public SuperHeroe(String nombre, int fuerza, int resistencia, int poderes) {
		setNombre(nombre);
		setFuerza(fuerza);
		setResistencia(resistencia);
		setPoderes(poderes);
	}

	public Resultado competir(SuperHeroe contrincante) {
		Resultado resultado = Resultado.EMPATE;
		int won_points = 0, lost_points = 0;

		if (fuerza > contrincante.getFuerza()) {
			won_points++;
		} else if (fuerza < contrincante.getFuerza()) {
			lost_points++;
		}

		if (resistencia > contrincante.getResistencia()) {
			won_points++;
		} else if (resistencia < contrincante.getResistencia()) {
			lost_points++;
		}

		if (poderes > contrincante.getPoderes()) {
			won_points++;
		} else if (poderes < contrincante.getPoderes()) {
			lost_points++;
		}

		if (won_points >= 2) {
			resultado = Resultado.TRIUNFO;
		} else if (lost_points >= 2) {
			resultado = Resultado.DERROTA;
		}

		return resultado;
	}

	public int getFuerza() {
		return fuerza;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPoderes() {
		return poderes;
	}

	public int getResistencia() {
		return resistencia;
	}

	private void setFuerza(int fuerza) {
		this.fuerza = this.setValue(fuerza);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setPoderes(int poderes) {
		this.poderes = this.setValue(poderes);
	}

	private void setResistencia(int resistencia) {
		this.resistencia = this.setValue(resistencia);
	}

	private int setValue(int value) {
		int ret = value;
		if (value < MIN_VALOR_SUPERPODER) {
			ret = MIN_VALOR_SUPERPODER;
		} else if (value > MAX_VALOR_SUPERPODER) {
			ret = MAX_VALOR_SUPERPODER;
		}
		return ret;
	}

	@Override
	public String toString() {
		return "SuperHeroe [nombre=" + this.nombre + ", fuerza=" + this.fuerza + ", resistencia=" + this.resistencia
				+ ", poderes=" + this.poderes + "]";
	}

}