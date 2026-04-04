package dados;

import java.util.Objects;

public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private static int totalRegistrados = 0;

    public Livro(String isbn, String titulo, String autor, int anoPublicacao) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
    }
    public static void incrementarTotal() {
        setTotalRegistrados(getTotalRegistrados()+1);

    }


    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass()== Livro.class) {
            Livro livro2 = (Livro) obj;
            return this.getIsbn().equals(livro2.getIsbn()) ;
        }
        return false;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public static int getTotalRegistrados() {
        return totalRegistrados;
    }

    private static void setTotalRegistrados(int totalRegistrados) {
        Livro.totalRegistrados = totalRegistrados;
    }
}
