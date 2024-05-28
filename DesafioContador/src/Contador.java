import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        // Lê o teclado do usuário
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int p1 = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int p2 = terminal.nextInt();

        try {
            // Chamada método Contar
            ParametrosInvalidosException cont = new ParametrosInvalidosException();
            cont.contar(p1, p2);

        } catch (Exception ParametrosInvalidosException) {
            // TODO: handle exception
        }
    }

}
