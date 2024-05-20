public class App {
    public static void main(String[] args) throws Exception {
        // Controle FOR
        System.out.println("********** Controle for **********");
        for(int x=1; x<=5; x++){
            System.out.println("Valor: " + x);
        }

        // Controle for sobre arrays
        System.out.println("********** Controle for sobre arrays **********");
        // Array alunos
        String alunos[] = {
            "Felipe", "Jeferson", "Jonas", "Julia", "Marcos"
        };

        for(int pessoa=0; pessoa<alunos.length; pessoa++){
            System.out.println("Indice -> " + pessoa + " Aluno: " + alunos[pessoa]);
        }

        // 2ª forma de percorrer um array
        System.out.println("******** 2ª forma de percorrer um array ********");
        // variavel = aluno : array<alunos>
        for(String aluno : alunos){
            System.out.println("Nome do Aluno é: " + aluno);
        }
    }
}
