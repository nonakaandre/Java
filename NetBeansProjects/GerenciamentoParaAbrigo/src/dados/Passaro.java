
package dados;


public class Passaro extends Animal{
    private String cor;

    public Passaro(String nome, int idade, String hSaude, String cor) {
        super(nome, idade, hSaude);
        this.cor = cor;
    }
    
    @Override
        public String emitirSom() {
            return "Pia";
        }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
        
    
}
