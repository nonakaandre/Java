
package dados;


public class Passaro extends Animal{

    public Passaro(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
        public String getDescricao() {
            return "Passaro | Nome: " + getNome() + " | Idade: " + getIdade();
        }
    
    @Override
        public int getPrioridadeAdocao() {
            if (getIdade() >= 10) return 1;
            if (getIdade() <= 1) return 2;
            return 3;
        }
    
}
