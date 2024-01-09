package clases;

import java.util.Random;

/**
 * Clase que recrea el juego de buscar el tesoro
 */
public class Tesoro {
	
	/**
	 * Constante para el tama�o del tablero
	 */
	public static final int TAM_TABLERO = 5;

	/**
	 * Atributo que controla la posici�n x del tesoro
	 */
	static int xTesoro;

	/**
	 * Atributo que controla la posici�n y del tesoro
	 */
	static int yTesoro;

	/**
	 * Atributo que controla la posici�n x del jugador
	 */
	int xJugador = 1;

	/**
	 * Atributo que controla la posici�n y del jugador
	 */
	int yJugador = 1;

	/**
	 * Clase que genera la posici�n del tesoro aleatoriamente mediante el tama�o del tablero
	 */
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}

	/**
	 * Funci�n que pinta el tablero
	 */
	void pintaTablero() {
		// Imprimimos la primera línea de números
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print("\t" + i);
		}

		// Salto de línea para comenzar con los números de la izquierda
		System.out.println();

		// Bucle para imprimir las líneas
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el número de línea
			System.out.print(i);
			// Si la línea coincide con la posición X del jugador
			if (xJugador == i) {
				/// Imprimimos tantos tabuladores como posición Y del jugador
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				// Imprimimos la ficha del jugador
				System.out.print("J");
			}
			// Salto de línea para pasar a la siguiente línea
			System.out.println();
		}
	}

	/**
	 * Funci�n que cambia la posici�n del jugador seg�n la orden introducida por teclado sin salirse de los l�mites del tablero
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
	 * Funci�n para que el juego acabe si la posici�n del jugador y el tesoro son iguales
	 * @return devuelve true si la posici�n del jugador y el tesoro son iguales
	 */
	boolean buscaTesoro(){
		boolean res = false;
		if(xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}
