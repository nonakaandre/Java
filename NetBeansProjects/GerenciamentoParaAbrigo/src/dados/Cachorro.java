
package dados;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
        
    }

    @Override
    public String getDescricao() {
        return "Cachorro | Nome: " + getNome() + " | Idade: " + getIdade();
    }
    
    @Override
    public int getPrioridadeAdocao(){
        if(getIdade() >= 10) return 1;
        if(getIdade() <= 2) return 2;
        return 3;
    }
}
    
    
