import java.util.Scanner;

public class EntradaUsuario {
    private Scanner scanner;

    public EntradaUsuario(Scanner scanner) {
        this.scanner = scanner;
    }

    public String obterNome() {
        String nome;
        while (true) {
            SaidaFormatada.imprimirMensagem("Digite o seu nome: ");
            nome = scanner.nextLine().trim();
            if (nome.isEmpty()) {
                SaidaFormatada.imprimirErro("O campo 'Nome' não pode ser vazio.");

            } else if (nome.length() < 3) {
                SaidaFormatada.imprimirErro(" O campo 'Nome' não pode ter menos de 3 caracteres. Digite novamente.");

            } else {
                return nome.toUpperCase();
            }
        }
    }

    public String obterMoedaOrigem() {
        SaidaFormatada.imprimirMensagem("Digite a moeda para conversão: (ex: BRL, USD, EUR, GBP, ARS, JPY) ");
        return scanner.nextLine().trim().toUpperCase();
    }

    public double obterValor() {
        SaidaFormatada.imprimirMensagem("Digite o valor: ");
        try {
            return Double.parseDouble(scanner.nextLine().replace(",", "."));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Valor inválido. Digite um número, por exemplo: 100.50");
        }
    }
    public String obterMoedaDestino() {
        SaidaFormatada.imprimirMensagem("Digite a moeda de destino (ex: BRL, USD, EUR, GBP, ARS, JPY)");
        return scanner.nextLine().trim().toUpperCase();
    }

    public String obterOpcaoMenu() {
        SaidaFormatada.imprimirMensagem("Digite uma opção:\n1 - Nova conversão\n2 - Ver histórico\n3 - Sair");

        return scanner.nextLine();
    }
}


