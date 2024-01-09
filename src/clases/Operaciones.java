package clases;

/**
 * Clase para realizar diversas operaciones
 */
public class Operaciones {

	/**
	 * Atributo que guarda el valor de un n�mero
	 */
	double num1;
	/**
	 * Atributo que guarda el valor de otro n�mero
	 */
	double num2;

	/**
	 * Constructor sin par�metros
	 */
	public Operaciones() {
		
	}

	/**
	 * Constructor con par�metros 
	 * @param num1 un n�mero
	 * @param num2 otro n�mero
	 */
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	/**
	 * Funci�n que suma dos n�meros
	 * @return la suma de los dos n�meros
	 */
	public double suma() {
		return num1+num2;
	}
	
	/**
	 * Funci�n que resta dos n�meros
	 * @return la resta de los dos n�meros
	 */
	public double resta() {
		return num1-num2;
	}
	
	/**
	 * Funci�n que multiplica dos n�meros
	 * @return la multipicaci�n de los dos n�meros
	 */
	public double multiplicacion() {
		return num1*num2;
	}
	
	/**
	 * Funci�n que divide dos n�meros solo si el divisor no es cero
	 * @return la divisi�n de los dos n�meros
	 */
	public double division() {
		double res = 0;
		
		if(num2 != 0) {
			res = num1/num2;
		} 
		return res;
	}

	/**
	 * Funci�n que proporciona el mayor de dos n�meros
	 * @return el mayor de dos n�meros de los dos n�meros
	 */
	public double max() {
		return num1>num2 ? num1 : num2; 
	}
	
	/**
	 * Funci�n que proporciona el menor de dos n�meros
	 * @return el menor de dos n�meros de los dos n�meros
	 */
	public double min() {
		return num1<num2 ? num1 : num2; 
	}
}
