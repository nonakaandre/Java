
package exercicio02;

public class Filme extends Conteudo{
     private String diretor;
    
     
    public Filme (String ti, double dM, String diretor) { //CHAMANDO CONSTRUTOR DA CLASSE PAI
        super(ti, dM); 
        this.diretor = diretor;
    }
    
    
@Override
public void exibirDetalhes(){
    super.exibirDetalhes(); 
    System.out.println(diretor);
}

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
