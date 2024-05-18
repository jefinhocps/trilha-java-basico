/**
     * Classe responsavel por controlar a TV
     * Ligar e desligar TV
     * Trocar Canal
     * Aumentar e Diminuir Volume
     */
public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Ligar TV
    public void ligar(){
        ligada = true;
    }
    // Desligar TV
    public void desligar(){
        ligada = false;
    }

    // Aumentar o volume da TV
    public void aumentarVolume(){
        volume++;
    }

    // Diminuir o volume da TV
    public void diminuirVolume(){
        volume--;
    }

    // Mudar Canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    // Aumentar Canal
    public void aumentarCanal(){
        canal++;
    }
    // Diminuir Canal
    public void diminuirCanal(){
        canal--;
    }


}
