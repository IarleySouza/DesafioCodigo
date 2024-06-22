package usuario;

import celular.Iphone;
import internet.Brave;
import internet.NavegadorInternet;
import reprodutor.ReprodutoMusical;
import reprodutor.Spotify;
import telefone.AparelhoTelefonico;
import telefone.Telefone;

public class Usuario {
    public static void main(String[] args) {
        Iphone celular = new Iphone();
        NavegadorInternet brave = new Brave();
        AparelhoTelefonico fone = new Telefone();
        ReprodutoMusical musica = new Spotify();

        brave.adicionarNovaAba();
		musica.selecionarMusica(" Darkside - Bring Me The Horizon");
		fone.ligar("(11) 99876-5432\n");
		
		System.out.println("10 segundos depois\n");
		
		brave.atualizarPagina();
		musica.pausar();
		fone.atender();
		


    }
    
}
