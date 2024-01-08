package clases;
/**
 * Clase para calcular el volumen y superficie de una esfera
 */
public class Esfera {
	
	/**
	 * Atributo que guarda el valor del radio de una esf�ra
	 */
	double radio = 1.0;
	
	/**
	 * Constructor vac�o
	 */
	public Esfera() {
		super();
	}


	/**
	 * Constructor con par�metros
	 * @param radio Par�metro con el valor del radio de la esf�ra
	 */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}
	

	public double superficie() {
		double superficie = 4*Math.PI*Math.pow(radio, 2);		
		return superficie;
	}
	
	public double volumen() {
		double volumen = (4*Math.PI/3) * Math.pow(radio, 3);
		return volumen;
	}
}
