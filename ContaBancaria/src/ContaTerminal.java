import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá seja Bem-vindo(a) ao nosso sistema de Contas.");

        // Cria Nova Conta    
        Conta novaConta = new Conta();
        // Lê o teclado do usuário
        Scanner sc = new Scanner(System.in);  
        
        System.err.println("Informe o seu nome: ");
        novaConta.titular = sc.nextLine();

        System.out.println("Informe o numero da agencia: ");
        novaConta.agencia = sc.nextInt();

        System.out.println("Informe o numero da conta: ");
        novaConta.numeroConta = sc.nextInt();

        System.out.println("Informe o valor do depósito: ");
        novaConta.saldo = sc.nextInt();

        novaConta.ExibirDadosDaConta();

        novaConta.RealizarSaque(15);

    }
}
    

