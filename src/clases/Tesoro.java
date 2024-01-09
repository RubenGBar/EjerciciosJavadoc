package clases;

import java.util.Random;

/**
 * Clase que recrea el juego de buscar el tesoro
 */
public class Tesoro {
	
	/**
	 * Constante para el tamaño del tablero
	 */
	public static final int TAM_TABLERO = 5;

	/**
	 * Atributo que controla la posición x del tesoro
	 */
	static int xTesoro;

	/**
	 * Atributo que controla la posición y del tesoro
	 */
	static int yTesoro;

	/**
	 * Atributo que controla la posición x del jugador
	 */
	int xJugador = 1;

	/**
	 * Atributo que controla la posición y del jugador
	 */
	int yJugador = 1;

	/**
	 * Clase que genera la posición del tesoro aleatoriamente mediante el tamaño del tablero
	 */
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}

	/**
	 * Función que pinta el tablero
	 */
	void pintaTablero() {
		// Imprimimos la primera lÃ­nea de nÃºmeros
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print("\t" + i);
		}

		// Salto de lÃ­nea para comenzar con los nÃºmeros de la izquierda
		System.out.println();

		// Bucle para imprimir las lÃ­neas
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el nÃºmero de lÃ­nea
			System.out.print(i);
			// Si la lÃ­nea coincide con la posiciÃ³n X del jugador
			if (xJugador == i) {
				/// Imprimimos tantos tabuladores como posiciÃ³n Y del jugador
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				// Imprimimos la ficha del jugador
				System.out.print("J");
			}
			// Salto de lÃ­nea para pasar a la siguiente lÃ­nea
			System.out.println();
		}
	}

	/**
	 * Función que cambia la posición del jugador según la orden introducida por teclado sin salirse de los límites del tablero
	 * @param movimiento variable para saber si el jugador se mueve arriba, abajo, izquierda o derecha
	 * @return
	 */
	int mueveJugador(String movimiento) {
		int res = 0;
		String movMinuscula = movimiento.toLowerCase();

		switch (movMinuscula) {
		case "arriba":
			if (xJugador - 1 < 1) {
				res = -1;
			} else {
				xJugador--;
			}
			break;
		case "abajo":
			if (xJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				xJugador++;
			}
			break;
		case "izquierda":
			if (yJugador - 1 < 1) {
				res = -1;
			} else {
				yJugador--;
			}
			break;
		case "derecha":
			if (yJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				yJugador++;
			}
			break;
		default:
			res = -2;
			break;
		}		
		
		return res;
	}

	/**
	 * Función para que el juego acabe si la posición del jugador y el tesoro son iguales
	 * @return devuelve true si la posición del jugador y el tesoro son iguales
	 */
	boolean buscaTesoro(){
		boolean res = false;
		if(xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}
