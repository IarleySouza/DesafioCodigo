package reprodutor;

public class Spotify implements ReprodutoMusical {
    public void tocar(){
        System.out.println("Tocando Musica.");
    
    }
    public void pausar(){
        System.out.println("Pausando Música.");
    
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando Música: " + musica);
    }

    
}