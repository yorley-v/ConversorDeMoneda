package conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.*;
import java.util.stream.Collectors;

public class MenuMonedas {

    // Lista fija con monedas populares
    private static final List<Moneda> listaMonedasFijas = Arrays.asList(
            new Moneda("USD", "Dólar Estadounidense"),
            new Moneda("EUR", "Euro"),
            new Moneda("GBP", "Libra Esterlina"),
            new Moneda("JPY", "Yen Japonés"),
            new Moneda("MXN", "Peso Mexicano"),
            new Moneda("CAD", "Dólar Canadiense"),
            new Moneda("BRL", "Real Brasileño"),
            new Moneda("CLP", "Peso Chileno"),
            new Moneda("ARS", "Peso Argentino"),
            new Moneda("COP", "Peso Colombiano"),
            new Moneda("PEN", "Sol Peruano")
    );

    private static List<Moneda> listaMonedas = new ArrayList<>();

    public static void cargarMonedas() {
        try {
            String json = ApiService.obtenerTasas("USD");
            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

            String resultado = jsonObject.get("result").getAsString();
            if (!"success".equalsIgnoreCase(resultado)) {
                System.out.println("Error al obtener tasas: " + json);
                return;
            }

            JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");
            listaMonedas.clear();

            for (Map.Entry<String, JsonElement> entry : rates.entrySet()) {
                String codigo = entry.getKey();

                String nombre = codigo;
                for (Moneda m : listaMonedasFijas) {
                    if (m.codigo.equals(codigo)) {
                        nombre = m.nombre;
                        break;
                    }
                }

                listaMonedas.add(new Moneda(codigo, nombre));
            }

            listaMonedas.sort(Comparator.comparing(m -> m.codigo));

        } catch (Exception e) {
            System.out.println("Error al cargar monedas: " + e.getMessage());
        }
    }

    public static void mostrarMenu() {
        System.out.println("Monedas disponibles:");
        for (int i = 0; i < listaMonedasFijas.size(); i++) {
            Moneda m = listaMonedasFijas.get(i);
            System.out.printf("%d. %s (%s)\n", i + 1, m.nombre, m.codigo);
        }
    }

    public static String seleccionarMoneda(String tipo, Scanner scanner) {
        while (true) {
            mostrarMenu();
            System.out.print("Selecciona el número de la moneda " + tipo + ": ");
            String entrada = scanner.nextLine().trim();
            try {
                int opcion = Integer.parseInt(entrada);
                if (opcion >= 1 && opcion <= listaMonedasFijas.size()) {
                    return listaMonedasFijas.get(opcion - 1).codigo;
                }
            } catch (NumberFormatException e) {
                // Entrada no es un número
            }

            System.out.println("Entrada inválida. Intenta de nuevo.");
        }
    }

}



