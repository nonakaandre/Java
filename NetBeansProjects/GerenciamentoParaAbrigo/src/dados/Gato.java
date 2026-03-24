
package dados;

public class Gato extends Animal {
    private String tipoPelo;

    public Gato(String nome, int idade, String hSaude, String tipoPelo) {
        super(nome, idade, hSaude);
        this.tipoPelo = tipoPelo;
    }

    @Override
    public String emitirSom() {
        return "Miado";
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }
}