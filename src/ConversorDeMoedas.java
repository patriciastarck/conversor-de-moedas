import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;

public class ConversorDeMoedas {
    private ApiCliente apiCliente;

    public ConversorDeMoedas(ApiCliente apiCliente) {
        this.apiCliente = apiCliente;
    }

    public double converter(String moedaOrigem, String moedaDestino, double valor) throws IOException, InterruptedException {
        String respostaApi = apiCliente.buscarTaxasDeCambio(moedaOrigem);
        JsonObject json = JsonParser.parseString(respostaApi).getAsJsonObject();
        JsonObject taxas = json.getAsJsonObject("conversion_rates");

        if (!taxas.has(moedaDestino)) {
            throw new IllegalArgumentException("Moeda de destino não encontrada.");
        }

        double taxa = taxas.get(moedaDestino).getAsDouble();
        return valor * taxa;
    }
}

