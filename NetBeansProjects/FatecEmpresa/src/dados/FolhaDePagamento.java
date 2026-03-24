package dados;

public class FolhaDePagamento {

    public void imprimirSalario(Funcionarios funcionario) { // TIPO: Funcionarios  NOME DA VARIÁVEL: funcionarios
        System.out.println("idFunc: " + funcionario.getIdFunc());
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.calcularSalario());
    }

}