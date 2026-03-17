package dados;

public class FolhaDePagamento {

    public void imprimirSalario(Funcionarios funcionario) {
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.calcularSalario());
    }

}