import java.util.Scanner;

// Definição da exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class controleDeFluxo {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Vamos começar!");
            System.out.println("Digite o primeiro número:");
            int primeiroNumero = terminal.nextInt();

            System.out.println("Digite o segundo número:");
            int segundoNumero = terminal.nextInt();

            try {
                contar(primeiroNumero, segundoNumero);
            } catch (ParametrosInvalidosException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Por favor, insira os números corretamente e tente novamente.");
            }

            System.out.println("Deseja digitar mais alguns números para nova contagem? (Sim/Não)");
            String resposta = terminal.next();

            if (resposta.equalsIgnoreCase("Não") || resposta.equalsIgnoreCase("Nao") || resposta.equalsIgnoreCase("N")) {
                System.out.println("Programa finalizado. Obrigado pelo acesso!");
                continuar = false;
            } else if (!resposta.equalsIgnoreCase("Sim") && !resposta.equalsIgnoreCase("S")) {
                System.out.println("Resposta inválida. Programa finalizado. Obrigado pelo acesso!");
                continuar = false;
            }
        }

        terminal.close(); // Fechar o scanner após o uso
    }

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");
        }

        System.out.println("Contando...");

        // Utilizando um loop for para a contagem
        for (int i = 1; i <= (segundoNumero - primeiroNumero); i++) {
            System.out.println("Imprimindo o número " + i);
        }

        System.out.println("Contagem concluída.");
    }
}


