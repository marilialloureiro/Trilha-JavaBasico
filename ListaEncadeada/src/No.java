public class No <T>{
    private T conteudo;
    private No proximNo;

    public No(){
        this.proximNo= null;
    }

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximNo = null;
    }

    public No(T conteudo, No proximNo) {
        this.proximNo = proximNo; 
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximNo() {
        return proximNo;
    }

    public void setProximNo(No proximNo) {
        this.proximNo = proximNo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }
    

}
