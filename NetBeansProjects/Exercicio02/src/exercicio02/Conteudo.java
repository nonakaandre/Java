
package exercicio02;

public class Conteudo {
    private String titulo;
    private double duracaoMinutos;
    
    public Conteudo(String ti, double dM){ // CRIANDO MÉTODOS 
        this.setTitulo(ti);                //MÉTODO CONSTRUTOR
        this.setDuracaoMinutos(dM);
        
    }
    
    public void exibirDetalhes() {
        System.out.println(titulo);
        System.out.println(duracaoMinutos);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(double duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
    
}
