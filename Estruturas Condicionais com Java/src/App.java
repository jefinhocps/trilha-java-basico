/**
 * COntrole de Fluxo IF, Else If, Else
 * Estrutura encadeada
 */

public class App {
    public static void main(String[] args) throws Exception {
        int nota = 9;

        // Controle de Fluxo
        if(nota >= 7){
            System.out.println("Aprovado!");
        }else if (nota >= 5 && nota < 7){
            System.out.println("Prova de Minerva.");
        }else {
            System.out.println("Reprovado!");
        }
    }
}
