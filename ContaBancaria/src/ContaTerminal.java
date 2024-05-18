import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá seja Bem-vindo(a) ao nosso sistema de Contas.");

        Scanner sc = new Scanner(System.in);

        double Saldo = 237.48;

        System.out.println("Digite o numero da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Informe o numero da agencia: ");
        String agencia = sc.nextLine();
        
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        //System.out.println(nome);

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é:" + agencia + " Conta: " + numeroConta + " e seu saldo: " + Saldo + " já esta disponivel para saque.");
        

        
    }
}
