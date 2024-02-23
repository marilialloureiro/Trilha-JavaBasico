package Arrays;
/*Crie um vetor de 6 números inteiros e mostre-os em ordem inversa */
public class Ex1 {
    public static void main(String[] args) {
        
        int [] vetor = {0, 1, 10, 20, 30, 40};
        /* vetor [0] = 0 /1
         * vetor [1] = 1 /2 
         * vetor [2] = 10 /3 
         * vetor [3] = 20 /4
         * vetor [4] = 30 /5
         * vetor [5] = 40 /6
         */
        System.out.println("Vetor de tamanho: " + vetor.length);

        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }
        
    }
    
}
