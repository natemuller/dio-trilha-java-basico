import java.util.Scanner;

public class ContaTerminal {
    int numero = 0;
    String agencia;
    String nome_cliente;
    double saldo = 0;

    public void pegaInformacoes() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        System.out.println(" ");
    
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        System.out.println(" ");
    
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome!");
        System.out.println(" ");
    
        nome_cliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo!");
        System.out.println(" ");
    
        saldo = scanner.nextDouble();

        scanner.close();
    }

    public void exibirDadosConta() {
    System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }

    public static void main(String[] args) {
            ContaTerminal conta = new ContaTerminal();
            conta.pegaInformacoes();
            conta.exibirDadosConta();
    }
}
