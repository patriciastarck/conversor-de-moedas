import java.util.ArrayList;
import java.util.List;

public class HistoricoConversoes {

    private static final List<String> historico = new ArrayList<>();

    public static void salvarConversao(double valor, String origem, double convertido, String destino) {
        String registro = String.format("%.2f %s -> %.2f %s", valor, origem,convertido,destino);
        historico.add(registro);
    }

    public static void exibirHistorico() {
        System.out.println("----------------------------");
        System.out.println("  HISTÓRICO DE CONVERSÕES:  ");
        System.out.println("----------------------------");

        if (historico.isEmpty()) {
            System.out.println("Não há conversão registrada.");
        } else {
            for (String item : historico) {
                System.out.println(" - "+ item);
            }
            SaidaFormatada.imprimirMensagemEncerramento();
        }
    }
}
