
package dados;


public abstract class Funcionarios {
    private String nome;
    private int idFunc;
    
    public abstract double calcularSalario();
  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    
}
