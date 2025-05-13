import java.text.SimpleDateFormat;
import java.util.Date;

public class SaidaFormatada {

    private static final String nome_app = "\uD83D\uDCB1 CONVERSOR DE MOEDAS";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BOLD = "\u001B[1m";

    public static void imprimirCabecalho(String cabecalho) {
        SimpleDateFormat formatoDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataHora = formatoDataHora.format(new Date());
        System.out.println("   " + nome_app);
        System.out.println("   \uD83D\uDCC5 " + dataHora);
    }

    public static void imprimirLinhaDivisoria() {
        System.out.println("=================================================================");
    }

    public static void imprimirMensagem(String mensagem) {
        imprimirLinhaDivisoria();
        System.out.println(mensagem);
    }

    public static void imprimirBoasVindas(String nome) {
        imprimirMensagem("\n****  Olá " + nome + ", seja bem vindo(a)! \uD83D\uDE03  ****");
    }

    public static void imprimirResultadoConversao(double valor, String moedaOrigem, double valorConvertido, String moedaDestino) {
        System.out.printf("Valor convertido: %.2f " + moedaOrigem + " = %.2f " + moedaDestino + "%n", valor, valorConvertido);

    }

    public static void imprimirErro(String mensagem) {
        System.out.println("Erro: " + ANSI_RED + mensagem + ANSI_RESET);
    }

    public static void imprimirMensagemEncerramento() {
        imprimirMensagem(ANSI_BOLD + "Sessão finalizada com sucesso. Volte sempre!" + ANSI_RESET);
    }
}
