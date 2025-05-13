import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class ApiCliente {

    private static final String API_KEY = "a733795f7594130fac06e77d";

    public String buscarTaxasDeCambio(String moedaOrigem) throws IOException, InterruptedException {
        String apiUrl = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + moedaOrigem;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new IOException("Erro ao acessar a API. Código HTTP: " + response.statusCode());
        }

        return response.body();
    }
}
