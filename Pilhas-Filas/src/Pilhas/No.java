package Pilhas;
public class No {
    
   
    int dado;
    No noref = null;

    public No() {
    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado(){
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getNoref() {
        return noref;
    }

    public void setNoref(No noref) {
        this.noref = noref;
    }

    @Override
    public String toString() {
        return "No [dado=" + dado + "]";
    }

    


}
