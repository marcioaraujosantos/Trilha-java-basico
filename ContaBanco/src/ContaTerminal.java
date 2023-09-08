import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        /*
         * String nome = args[0];
         * String sobrenome = args[1];
         * int conta = Integer.valueOf(args[2]);
         * String agencia = args[3];
         * Double saldo = Double.valueOf(args[4]);
         * 
         * System.out.println("Olá, me chamo " + nome + " " + sobrenome);
         * System.out.println("Minha conta é " + conta);
         * System.out.println("Minha agência é " + agencia);
         * System.out.println("Meu salddo é " + saldo);
         */
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o numero da conta");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da agência");
        String agencia = scanner.next();

        String valor = "Saldo";
        System.out.println(valor);

        Double saldo = 237.48;
        System.out.println(saldo);

        System.out.println("Olá, " + nome + " " + sobrenome + " Parabens por abrir uma conta em nosso banco sua conta é "
        + conta + " e agência " + agencia + " seu saldo é " + saldo + " e já está diponivel para saque.");
    }
}
