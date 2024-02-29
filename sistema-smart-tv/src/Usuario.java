public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual " + smartTv.canal);
        System.out.println("Volume atual " + smartTv.volume);

        System.out.println("");
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        System.out.println("");
        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        System.out.println("");
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume atual " + smartTv.volume);
        
        System.out.println("");
        smartTv.dimimuirVolume();
        System.out.println("Novo Status -> Volume atual " + smartTv.volume);

        System.out.println("");
        smartTv.mudarCanal(12);
        System.out.println("Novo Status -> Canal atual " + smartTv.canal);

        System.out.println("");
        smartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal atual " + smartTv.canal);

        System.out.println("");
        smartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal atual " + smartTv.canal);
        
    }
    
}
