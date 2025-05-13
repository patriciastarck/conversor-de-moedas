import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        SaidaFormatada.imprimirLinhaDivisoria();
        SaidaFormatada.imprimirCabecalho("");
        SaidaFormatada.imprimirLinhaDivisoria();

        Scanner scanner = new Scanner(System.in);
        ApiCliente apiCliente = new ApiCliente();
        ConversorMoedas conversorMoedas = new ConversorMoedas(apiCliente);
        EntradaUsuario entradaUsuario = new EntradaUsuario(scanner);

        String nome = entradaUsuario.obterNome();
        SaidaFormatada.imprimirBoasVindas(nome);

        while (true) {
            try {

                String moedaOrigem = entradaUsuario.obterMoedaOrigem();
                double valor = entradaUsuario.obterValor();
                String moedaDestino = entradaUsuario.obterMoedaDestino();

                double valorConvertido = conversorMoedas.converter(moedaOrigem, moedaDestino, valor);
                SaidaFormatada.imprimirResultadoConversao(valor, moedaOrigem, valorConvertido, moedaDestino);

                HistoricoConversoes.salvarConversao(valor, moedaOrigem, valorConvertido, moedaDestino);

            } catch (IOException | InterruptedException e) {
                SaidaFormatada.imprimirErro("Erro na conexão com a API: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                SaidaFormatada.imprimirErro(e.getMessage());
            }

            String opcao;
            while (true) {
                opcao = entradaUsuario.obterOpcaoMenu();
                if (opcao.equals("1") || opcao.equals("2") || opcao.equals("3")) {
                    break;
                } else {
                    SaidaFormatada.imprimirErro("Opção inválida. Digite 1, 2 ou 3.");
                }
            }

            if (opcao.equals("2")) {
                HistoricoConversoes.exibirHistorico(); // ➕ Exibe histórico

                break;

            } else if(opcao.equals("3")) {
                SaidaFormatada.imprimirMensagemEncerramento();
                break;
            }
        }
        scanner.close();
    }
}


