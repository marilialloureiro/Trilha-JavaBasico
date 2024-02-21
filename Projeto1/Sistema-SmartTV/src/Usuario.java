public class Usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        //ações teste
        smartTv.diminuirVolume(); //24
        smartTv.diminuirVolume(); //23
        smartTv.diminuirVolume(); //22
        smartTv.aumentarVolume(); //23
        System.out.println("Volume atual: " + smartTv.volume);

      
        //mudando o canal
        System.out.println("Canal atual: " + smartTv.canal); //validação
        smartTv.mudarCanal(10); //mudança
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Novo canal: " + smartTv.canal);


    }
}
