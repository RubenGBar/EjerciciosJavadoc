package clases;

import java.util.Random;

/**
 * Clase paera generar n�meros aleatorios
 */
public class Aleatorios {

	/**
	 * Funci�n que genera una cantidad concreta de n�meros aleatorios
	 * @param cantidad Guarda la cantidad de n�meros aleatorios a generar
	 */
	public static void numerosAletorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}

	/**
	 * Funci�n que genera una cantidad de n�meros aleatorios con un m�ximo
	 * @param cantidad Guarda la cantidad de n�meros aleatorios a generar
	 * @param max Guarda el valor m�ximo del n�mero aleatorio a generar
	 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}

	/**
	 * Funci�n que genera una cantidad de n�meros aleatorios con un m�ximo y un m�nimo
	 * @param cantidad Guarda la cantidad de n�meros aleatorios a generar
	 * @param minimo Guarda el valor m�nimo del n�mero aleatorio a generar
	 * @param maximo Guarda el valor m�ximo del n�mero aleatorio a generar
	 */
	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		int aleatorio;
		Random rand = new Random();
		for(int i=1; i<=cantidad; i++) {
			aleatorio = rand.nextInt(minimo, maximo+1);
			System.out.println(aleatorio);
		}
	}
}
