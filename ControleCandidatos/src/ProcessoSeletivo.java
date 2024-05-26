import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    private List<String> candidatosSelecionados;

    public ProcessoSeletivo() {
        this.candidatosSelecionados = new ArrayList<>();
    }

    public static void main(String[] args) {
        ProcessoSeletivo processoSeletivo = new ProcessoSeletivo();
        processoSeletivo.selecaoCandidatos();
        processoSeletivo.listarCandidatosSelecionados();
    }

    void selecaoCandidatos() {
        String[] candidatos = {
            "Felipe","Marcia",
            "Julia","Roberto",
            "Paulo","Augusto",
            "Monica","Fabricio",
            "Mirela","Daniela",
            "Jorge","Ana",
            "Carlos","Beatriz",
            "Rafael","Fernanda",
            "Claudio","Patricia",
            "Ricardo","Larissa"            

        };

        for(String candidato:candidatos){
            entrandoEmContato(candidato);
        }

        int candidatosSelecionadosCount = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionadosCount < 7 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato " + candidato + " solicitou o valor de: R$" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                candidatosSelecionadosCount++;
                // Adiciona candidato a lista de aprovados
                adicionaSelecionado(candidato);
            }
            candidatoAtual++;
        }
    }

    // Tentativa de contato
    static void entrandoEmContato(String candidato){
        int tentativaRealizada = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {

            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativaRealizada++;
            }else {
                System.out.println("Contato realizado com sucesso!");
            }

        }while(continuarTentando && tentativaRealizada < 3);

            if (atendeu) {
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativaRealizada + " tentativa.");
            }else {
                System.out.println("Não conseguimos contato com o " + candidato + ", numero maximo de tentativas excedido.");
            }

    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    public void adicionaSelecionado(String candidato) {
        candidatosSelecionados.add(candidato);
    }

    public void listarCandidatosSelecionados() {
        System.out.println("Candidatos Selecionados:");
        System.out.println("--------------------------");
        for (String candidato : candidatosSelecionados) {
            System.out.println("Selecionado: " + candidato);
        }
        System.out.println("--------------------------");
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }
}
