import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Declarar o scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Declarar as variáveis após a mensagem solicitada
        System.out.println("Digite seu NOME!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua AGÊNCIA!");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Agora, digite o número da sua CONTA!");
        String numeroConta = scanner.next();

        System.out.println("Por último, digite seu SALDO!");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                        + ", conta " + numeroConta + " e seu saldo de R$" + saldo
                        + " já está disponível para saque.");

    }
}
