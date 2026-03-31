
package dados;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getDescricao() {
        return "Gato | Nome: " + getNome() + " | Idade: " + getIdade();
    }
  
    @Override 
    public int getPrioridadeAdocao() {
        if(getIdade() >= 10) return 1;
        if(getIdade() <= 2) return 2;
        return 3;
    }
}