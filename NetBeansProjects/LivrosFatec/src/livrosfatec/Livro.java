/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livrosfatec;

/**
 *
 * @author nonak
 */
public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    public Livro (String titulo,String autor, int numeroPaginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.numeroPaginas = numeroPaginas;
}
    public Livro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public void exibirInformacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
    public void exibirAutor(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
               
    }



