public class OperadoresTernarios {
    public static void main(String[] args) {
        int a, b;

        a = 6;
        b = 5;

        String resultado = "";

        if (a == b) {
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }

        System.out.println(resultado);

        // usando operadores ternarios
        resultado = a==b ? "Verdadeiro" : "Falso";

        System.out.println("Resultado operador Ternário: " + resultado);

        /**
         *  Operadores de comparação
         *  && (and) E
         *  || (or) OU
         * 
         *  Obs: Quando for comparar objetos é adequado que seja usado o (equals), para comparar a igualdade 
         *  dos valores de objetos.
         */

        int numero1 = 15;
        int numero2 = 15;

        if (numero1 > 20 && numero2 > 20) {
            System.out.println("As duas condições são Verdadeiras.");
        } else if (numero1 < 20 && numero2 < 20) {
            System.out.println("As duas condições são Falsas.");
        } else {
            System.out.println("Uma das Condições é falsa");
        }

        /**
         * Exemplo de utilização || (OU)
         * Se uma das condições de validação for verdadeira
         * então o sistema vai retornar TRUE
         */
        int num1 = 10;
        int num2 = 100;

        if (num1 > 20 || num2 > 20) {
            System.out.println("Uma das condições é Verdadeira.");
        }


    }
}
