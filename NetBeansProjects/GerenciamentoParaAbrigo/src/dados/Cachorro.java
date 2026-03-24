
package dados;


public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String hSaude, String raca) {
        super(nome, idade, hSaude);
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "Latido";
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
    
    
