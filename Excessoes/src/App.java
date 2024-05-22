import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try{
              
            Scanner sc = new Scanner(System.in);

            System.out.println("Informe seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Informe sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Informe sua altura: ");
            double altura = sc.nextDouble();

            sc.close();

            System.out.println("Nome: " + nome + " Idade: " + idade);
        
        }  catch (InputMismatchException e){
            
            System.out.println("Os Campos Idade e altura precisam ser numéricos.");
        }
    }
}
