
package dados;


public abstract class Animal {
    private String nome;
    private int idade;
    private boolean adotado;
   

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.adotado = false;
    }

    public abstract String getDescricao();
    
    public abstract int getPrioridadeAdocao();

    public boolean isAdotado() {
        return adotado;
    }

    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
