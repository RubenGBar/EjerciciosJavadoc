package clases;
/**
 * Clase para calcular el volumen y superficie de una esfera
 */
public class Esfera {
	
	/**
	 * Atributo que guarda el valor del radio de una esféra
	 */
	double radio = 1.0;
	
	/**
	 * Constructor vacío
	 */
	public Esfera() {
		super();
	}


	/**
	 * Constructor con parámetros
	 * @param radio Parámetro con el valor del radio de la esféra
	 */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}
	
	/**
	 * Función que calcula la superficie de una esfera
	 * @return resultado de calcular la superficie de una esfera
	 */
	public double superficie() {
		double superficie = 4 * Math.PI * Math.pow(radio, 2);
		return superficie;
	}
	
	/**
	 * Función que calcula el volúmen de una esfera
	 * @return resultado de calcular el volúmen de una esfera
	 */
	public double volumen() {
		double volumen = (4*Math.PI/3) * Math.pow(radio, 3);
		return volumen;
	}
}
