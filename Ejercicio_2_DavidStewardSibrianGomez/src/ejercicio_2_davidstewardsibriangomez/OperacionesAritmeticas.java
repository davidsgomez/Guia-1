package ejercicio_2_davidstewardsibriangomez;

import java.util.Scanner;

public class OperacionesAritmeticas {
    
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        // Prompt the user to enter the first value
        System.out.print("Ingrese el primer valor: ");
        double valor1 = scanner.nextDouble();

        // Prompt the user to enter the second value
        System.out.print("Ingrese el segundo valor: ");
        double valor2 = scanner.nextDouble();

        // Prompt the user to enter the third value
        System.out.print("Ingrese el tercer valor: ");
        double valor3 = scanner.nextDouble();

        // Perform operations
        double suma = valor1 + valor2 + valor3;
        double resta = valor1 - valor2 - valor3;
        double multiplicacion = valor1 * valor2 * valor3;

        // Display results
        System.out.println("La suma de los valores es: " + suma);
        System.out.println("La resta de los valores es: " + resta);
        System.out.println("La multiplicacion de los valores es: " + multiplicacion);

        // Close the Scanner
        scanner.close();
    }
}
