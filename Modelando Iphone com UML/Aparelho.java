// iPhone.java
public class Aparelho implements Player, Telefone, Navegador {

    @Override
    public void tocarMusica(String songName) {
        System.out.println("Tocando Musica: " + nomeMusica);
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void parar() {
        System.out.println("Musica parada.");
    }

    @Override
    public void chamarContato(String numeroTelefone) {
        System.out.println("Chamando: " + numeroTelefone);
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void navegador(String url) {
        System.out.println("navegador: " + url);
    }

    @Override
    public void atualizar() {
        System.out.println("Pagina atualizada.");
    }

    @Override
    public void parar() {
        System.out.println("Navegador parado.");
    }

    public static void main(String[] args) {
        Aparelho myaparelho = new Aparelho();

        // Test MusicPlayer functionality
        myaparelho.tocarMusica("Song A");
        myaparelho.pausar();
        myaparelho.parar();

        // Test Phone functionality
        myaparelho.chamarContato("654312354");
        myaparelho.atenderChamada();
        myaparelho.encerrarChamada();

        // Test InternetBrowser functionality
        myaparelho.navegador("http://teste.com");
        myaparelho.atualizar();
        myaparelho.parar();
    }
}
