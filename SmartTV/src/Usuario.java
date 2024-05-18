public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        // Chama o método ligar TV
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        // Aumentando o volume da TV
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Volume Atual da TV: " + smartTv.volume);

        // Trocando o canal da TV
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual -> " + smartTv.canal);

        // Aumentando o canal
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        System.out.println("Canal atual da TV -> " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        
        System.out.println("Canal atual da TV -> " + smartTv.canal);



    }
}
