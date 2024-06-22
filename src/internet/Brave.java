package internet;

public class Brave implements NavegadorInternet{
    public void adicionarNovaAba(){
        System.out.println("Adicionando aba.");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando Pagina.");    
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo a Pagina: " + url);
    }
    
}
