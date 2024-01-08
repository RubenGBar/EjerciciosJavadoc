package clases;

import java.util.Random;

/**
 * Clase paera generar números aleatorios
 */
public class Aleatorios {

	/**
	 * Función que genera una cantidad concreta de números aleatorios
	 * @param cantidad Guarda la cantidad de números aleatorios a generar
	 */
	public static void numerosAletorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}

	/**
	 * Función que genera una cantidad de números aleatorios con un máximo
	 * @param cantidad Guarda la cantidad de números aleatorios a generar
	 * @param max Guarda el valor máximo del número aleatorio a generar
	 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}

	/**
	 * Función que genera una cantidad de números aleatorios con un máximo y un mínimo
	 * @param cantidad Guarda la cantidad de números aleatorios a generar
	 * @param minimo Guarda el valor mínimo del número aleatorio a generar
	 * @param maximo Guarda el valor máximo del número aleatorio a generar
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
