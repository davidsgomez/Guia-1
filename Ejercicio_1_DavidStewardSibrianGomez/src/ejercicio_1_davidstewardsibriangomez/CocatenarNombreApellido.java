package ejercicio_1_davidstewardsibriangomez;

import java.util.Scanner;

public class CocatenarNombreApellido {
    
    public static void main(String[] args) {
       
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        String nombreCompleto = nombre + " " + apellido;

        System.out.println("Su nombre completo es: " + nombreCompleto);

        scanner.close();
    }
}
