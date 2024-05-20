import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        double mesada = 50.0;
        int qtdDoce = 0;
        

        while(mesada > 0){
            double rand = new Random().nextDouble(2,8);
            Double valorDoce = rand;

            if(valorDoce > mesada){
                mesada = 0;
            }else {
                System.out.println("Doce do Valor: " + valorDoce + " adicionado no carrinho.");
                mesada = mesada - valorDoce;
                qtdDoce++;
            }  
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Você gastou toda sua mesada...");
        System.out.println("Doces adicionados ao carrinho: " + qtdDoce);
    }   
}
