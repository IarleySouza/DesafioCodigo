package telefone;

public class Telefone implements AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    public void atender() {
        System.out.println("Atendendo ligação.");
    }
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz.");
    }
    
    
}