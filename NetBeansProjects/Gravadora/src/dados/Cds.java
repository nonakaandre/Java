
package dados;


public class Cds {
    private String artista;
    private String titulo;
    private String categoria;
    private float duracao;
    
    public Cds(String artista, String titulo, String categoria, float duracao ) {
        this.artista = artista;
        this.categoria = categoria;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }
    
    @Override
    public String toString(){
        String retorno = this.getArtista();
        retorno = retorno + " - " + this.titulo;
        retorno = retorno + " - " + this.categoria;
        retorno = retorno + " - " + this.duracao+ " min " ;
        return retorno;
    }
    
    
}
