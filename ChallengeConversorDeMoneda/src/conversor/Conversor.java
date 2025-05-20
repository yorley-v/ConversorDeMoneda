package conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Conversor {

    public static double convertir(String from, String to, double amount) {
        try {
            String json = ApiService.obtenerTasas(from);

            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

            String resultado = jsonObject.get("result").getAsString();
            if (!"success".equalsIgnoreCase(resultado)) {
                System.out.println("Error en la conversión: " + json);
                return -1;
            }

            JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");

            if (!rates.has(to)) {
                System.out.println("Moneda destino no encontrada.");
                return -1;
            }

            double tasa = rates.get(to).getAsDouble();
            return amount * tasa;

        } catch (Exception e) {
            System.out.println("Error durante la conversión: " + e.getMessage());
            return -1;
        }
    }
}

