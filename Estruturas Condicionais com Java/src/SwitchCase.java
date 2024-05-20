/**
 * Controle de Fluxo com Switch Case
 * 
 */

public class SwitchCase {
    public static void main(String[] args) {
        
        String tamanho = "M";

        switch (tamanho) {
            case "P":
                System.out.println("Pequeno");
                break;
            
            case "M":
                System.out.println("Medio.");
                break;

            case "G":
                System.out.println("Grande.");
                break;
        
            default:
                System.err.println("Indefinido.");
                break;
        }

    }
}
