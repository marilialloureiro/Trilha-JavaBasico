package Pilhas;
public class Pilhas {

        private No refNoEntradaPilha;

        public Pilhas() {
            this.refNoEntradaPilha = null;
        }
        
        public No top(){
            return refNoEntradaPilha;

        }

        public void push(No novoNo){
            No refAuxiliar = refNoEntradaPilha;
            refNoEntradaPilha = novoNo;
            refNoEntradaPilha.setNoref(refAuxiliar);
        }

        public No pop(){
            if(!this.isEmpty()){
              No noPoped = refNoEntradaPilha;  
              refNoEntradaPilha = refNoEntradaPilha.getNoref();
              return noPoped;
            }
            return null;
        }

        public boolean isEmpty(){
            // if(refNoEntradaPilha == null){
            //     return true;
            // }
            // return false;
            return refNoEntradaPilha == null ? true : false; //esse retorno é o mesmo do if acima
        }

        @Override
         public String toString() {
            String stringRetorno = "   Pilha\n";
            stringRetorno += "------------\n";
            No noAuxiliar = refNoEntradaPilha;
            while(true){
                if(noAuxiliar != null){
                    stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                    noAuxiliar = noAuxiliar.getNoref();
                }else{
                    break;
                }
            }
            stringRetorno += "============";
            return stringRetorno;
        }
    }    

