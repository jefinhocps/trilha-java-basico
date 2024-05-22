import java.util.Random;

public class Telefone {
    public static void main(String[] args) throws Exception {
        System.out.println("Discando...");
        int qtdToque = 0;

        do {
            System.out.println("Chamando...");
            qtdToque++;
        } while (chamando());

        System.out.println("Atendeu no: " + qtdToque + "º toque.");
    }

    private static boolean chamando(){
        
        boolean atendeu = new Random().nextInt(10) == 1;
        System.out.println("Atendeu: " + atendeu);
        
        return !atendeu;
    }
}
