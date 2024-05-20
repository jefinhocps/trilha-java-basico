/**
 * Controle de fluxo
 */

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.00;
        double saqueSolicitado = 17.00;

        if(saqueSolicitado < saldo){
            saldo = saldo - saqueSolicitado;
        }else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println("Saldo Atualizado: " + saldo);
    }
}
