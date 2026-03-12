/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livrosfatec;

/**
 *
 * @author nonak
 */
public class LivrosFatec {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livro meuLivro = new Livro ("Java Básico", "Guanabara", 300);
        Livro autor = new Livro ("Idiota", "Dostoiévski");
        
        meuLivro.exibirInformacoes();
        autor.exibirAutor();
    }
    
}
