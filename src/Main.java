import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        /*
         ****************************
         Projeto criado por @Jovi445
         ****************************
        */

        // Criando as Variáveis Básicas

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String jogarNovamente;

        do {
            // Entrada

            System.out.println("Pedra, Papel, Tesoura!!");
            System.out.println("Digite [0] para Pedra, [1] para Papel ou [2] para Tesoura..");
            System.out.print("$: ");
            int resposta = teclado.nextInt();
            if (resposta < 0 || resposta > 2) {
                System.out.println("Escolha inválida, tente novamente!!");
                return;
            }

            // Saída

            int numero_aleatorio = random.nextInt(3);
            System.out.println("Você escolheu: " + opcoes[resposta]);
            System.out.println("O Java escolheu: " + opcoes[numero_aleatorio]);
            if (resposta == numero_aleatorio) {
                System.out.println("Empate!!");
            } else {
                if (resposta == 0 && numero_aleatorio == 2 || resposta == 1 && numero_aleatorio == 0 || resposta == 2 && numero_aleatorio == 1) {
                    System.out.println("Você Ganhou!!");
                } else {
                    System.out.println("Você perdeu!!");
                }
            }

            // Repetição

            System.out.println("Deseja jogar novamente? (s/n)");
            jogarNovamente = teclado.next();
        } while (jogarNovamente.equalsIgnoreCase("s"));

        System.out.println("Fim");
    }
}
