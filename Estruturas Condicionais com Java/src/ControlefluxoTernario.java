/**
 * Controle de Fluxo Ternário
 * Abaixo temos um exemplo de como utilizar
 * 
 */

public class ControlefluxoTernario {
    public static void main(String[] args) {
        
        int nota = 7;
         // resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
         //                 IF                  :        ELSE IF                       :   ELSE
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
