package MetodoCriacao;
public class Ex2Criacao {
    // 2. A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde ou Boa noite.
    public static void obterMensagem(int hora) {
        switch (hora) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                mensagemBomDia();
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Dado incorreto.");
                break;
        }
        
}

public static void mensagemBoaNoite() {
        System.out.println("Boa noite!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Bom tarde!");
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void main(String[] args) {
        Ex2Criacao.obterMensagem(9);
    }
}    