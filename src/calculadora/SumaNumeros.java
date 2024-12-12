package calculadora;

import java.util.Scanner;

/**
 * Esta clase permite sumar 2 numeros solicitados por el usuario.
 * 
 * @version 1.0
 * @author AroaPonsMartínez
 */

// El programa hace la suma de dos numeros
public class SumaNumeros {
	
	/**
	 * Función principal donde se solicitan 2 numeros y se muestra la suma.
	 * 
	 * @param args Argumentos de la línea de comandos (no se usan en este programa).
	 */
	
	public static void main(String[] args) {
		
		// Instanciar el escanner
		Scanner scanner = new Scanner(System.in);
		
		// Pedir el primer numero y guardarlo en la variable numero1
		System.out.print("Ingresa el primer número: ");
		int numero1 = scanner.nextInt();
		
		// Pedir el primer numero y guardarlo en la variable numero2
		System.out.print("Ingresa el segundo número: ");
		int numero2 = scanner.nextInt();
		
		// Hacer la suma y guardarla en la variable suma
		int suma = numero1 + numero2;
		
		// Imprimir el resultado de la suma
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
	}
}

// Cambio realizado desde rama feature-suma
// Comentario después de realizar fusión entre ramas
