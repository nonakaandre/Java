
package dados;


public abstract class Animal {
    private String nome;
    private int idade;
    private String historicoSaude;
    private boolean adotado;
    private static int aguardandoAdocao = 0;

    public Animal(String nome, int idade, String hSaude) {
        this.nome = nome;
        this.idade = idade;
        this.historicoSaude = hSaude;
        this.adotado = false;
        aguardandoAdocao++;
    }

    public abstract String emitirSom();

    public void adotar() {
        if (!adotado) {
            adotado = true;
            aguardandoAdocao--;
        }
    }

    public boolean isAdotado() {
        return adotado;
    }

    public static int getAguardandoAdocao() {
        return aguardandoAdocao;
    }

    public String getNome() {
        return nome;
    }
}