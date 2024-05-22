import java.util.Scanner;

public class SimulaConta {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        double valorDeposito = 0;
        double valorSaque = 0;

        System.out.println("Menu de opçoes... Digite uma opçao: \n");
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Sair \n");

            int opcao = scanner.nextInt(); 
            
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch (opcao){
              case 1:
                System.out.println("Menu Depositar...");
                System.out.println("Informe o valor a depositar: ");
                valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                System.out.println("Saldo atual: " + saldo);
                break;
              case 2:
                System.out.println("Menu Sacar...");
                System.out.println("Informe o valor a ser sacado: ");
                valorSaque = scanner.nextDouble();

                if (valorSaque > saldo) {
                    System.out.println("Saldo Insuficiente");
                }else {
                    saldo -= valorSaque;
                    System.out.println("Saldo atual: " + saldo);
                }               
                
                break;
              case 3:
                System.out.println("Consultar saldo...");
                System.out.println("Saldo atual: " + saldo);
                break;

              case 0:
                System.out.println("Saindo...");
                System.exit(0);
                break;

                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }        
        
        
            }
        }
}
