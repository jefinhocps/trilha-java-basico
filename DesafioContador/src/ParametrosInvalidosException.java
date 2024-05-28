
public class ParametrosInvalidosException {

    static void contar (int p1, int p2) {
        // Verificar se o primeiro parametro é maior que o segundo
    
        if (p1 > p2) {
            System.out.println("Primeiro parametro não pode ser maior que o segundo.");
        } else {
            int contagem = 0; 
            contagem = p2 - p1;
            System.out.println("------------------------------------");        
            for(int x = p1; x < p2; x++){
                
                System.out.println(contagem);
                contagem--;                
            }
            
        }
    }
    
}
