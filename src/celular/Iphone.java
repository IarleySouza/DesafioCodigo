package celular;

import internet.NavegadorInternet;
import reprodutor.ReprodutoMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutoMusical, AparelhoTelefonico {
    public void ligar(String numero) {
        System.out.println("ligando para " + numero + "pelo Iphone.");
    }
    public void atender() {
        System.out.println("Atendendo ligação pelo Iphone.");
    }
    public void iniciarCorreioDeVoz() {
        System.out.println("iniciando correio de voz pelo ligação pelo Iphone.");
    }
    public void tocar() {
        System.out.println("tocando musica pelo Iphone.");
    }
    public void pausar() {
        System.out.println("Pausando musica pelo Iphone.");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando " + musica + " pelo Iphone.");
    } 
    public void adicionarNovaAba() {
        System.out.println("Adicionanco nova aba pelo Iphone.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina pelo Iphone.");
    }
    public void exibirPagina(String url) {
        System.out.println("exibindo " + url + " pelo Iphone.");
    }
}