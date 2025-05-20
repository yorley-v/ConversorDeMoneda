import conversor.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BIENVENIDOS AL CONVERSOR DE DIVISAS ===");

        boolean continuar = true;

        while (continuar) {
            String origen = MenuMonedas.seleccionarMoneda("de ORIGEN", scanner);
            String destino = MenuMonedas.seleccionarMoneda("de DESTINO", scanner);

            System.out.print("Introduce la cantidad a convertir: ");
            double cantidad;
            try {
                cantidad = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Cantidad inválida. Intenta de nuevo.");
                continue;
            }

            double resultado = Conversor.convertir(origen, destino, cantidad);

            if (resultado != -1) {
                System.out.printf("\n%.2f %s = %.2f %s\n", cantidad, origen, resultado, destino);
            }

            System.out.print("\n¿Deseas hacer otra conversión? (s/n): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            if (!respuesta.equals("s")) {
                continuar = false;
            }
        }

        scanner.close();
        System.out.println("¡Gracias por utilizar la app de conversion Vera!");
        System.out.println("¡Hasta pronto!");
    }
}

