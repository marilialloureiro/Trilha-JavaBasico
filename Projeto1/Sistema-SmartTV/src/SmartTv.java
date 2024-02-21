public class SmartTv {
    
    /*PROJETO - Criar uma classe para representar uma Smart TV, onde:
     * 1. Ela tenha caracteristicas: ligada (boolean), canal (int) e volume (int)
     * 2. A TV poderá lugar e desligar mudando seu estado
     * 3. A TV poderá aumentar e dominuir o volume sempre +1 ou -1
     * 4. A TV poderá mudar de candal de 1 em 1, ou definindo o numero correspondente*/

    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    //Criando métodos

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal ++;
    } 
    public void diminuirCanal(){
        canal --;
    } 
}
