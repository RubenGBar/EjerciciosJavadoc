package clases;

/**
 * Clase para realizar diversas operaciones
 */
public class Operaciones {

	/**
	 * Atributo que guarda el valor de un número
	 */
	double num1;
	/**
	 * Atributo que guarda el valor de otro número
	 */
	double num2;

	/**
	 * Constructor sin parámetros
	 */
	public Operaciones() {
		
	}

	/**
	 * Constructor con parámetros 
	 * @param num1 un número
	 * @param num2 otro número
	 */
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	/**
	 * Función que suma dos números
	 * @return la suma de los dos números
	 */
	public double suma() {
		return num1+num2;
	}
	
	/**
	 * Función que resta dos números
	 * @return la resta de los dos números
	 */
	public double resta() {
		return num1-num2;
	}
	
	/**
	 * Función que multiplica dos números
	 * @return la multipicación de los dos números
	 */
	public double multiplicacion() {
		return num1*num2;
	}
	
	/**
	 * Función que divide dos números solo si el divisor no es cero
	 * @return la división de los dos números
	 */
	public double division() {
		double res = 0;
		
		if(num2 != 0) {
			res = num1/num2;
		} 
		return res;
	}

	/**
	 * Función que proporciona el mayor de dos números
	 * @return el mayor de dos números de los dos números
	 */
	public double max() {
		return num1>num2 ? num1 : num2; 
	}
	
	/**
	 * Función que proporciona el menor de dos números
	 * @return el menor de dos números de los dos números
	 */
	public double min() {
		return num1<num2 ? num1 : num2; 
	}
}
