package conversor;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {

    private static final String API_KEY = "TU_API_KEY";
    private static final HttpClient client = HttpClient.newHttpClient();

    public static String obtenerTasas(String base) throws Exception {
        String url = String.format("https://v6.exchangerate-api.com/v6/%s/latest/%s", API_KEY, base);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
