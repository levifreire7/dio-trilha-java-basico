import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.nextLine();

        System.out.println("Agora digite o número da Conta");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome do Cliente");
        nomeCliente = sc.nextLine();

        System.out.println("Qual o valor do saldo?");
        saldo = sc.nextDouble();

        String mensagem = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo ").concat(String.valueOf(saldo)).concat(" já está disponível para saque.");

        System.out.println(mensagem);

        sc.close();

    }
}
