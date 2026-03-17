package fatecempresa;

import dados.FolhaDePagamento;
import dados.FuncionarioAssalariado;
import dados.FuncionarioComissionado;
import dados.FuncionarioPorHora;

public class FatecEmpresa {

    public static void main(String[] args) {

        FuncionarioAssalariado f1 = new FuncionarioAssalariado();
        f1.setIdFunc(001);
        f1.setNome("Roberto Marinho");
        f1.setSalarioFixo(6000.0);

        FuncionarioPorHora f2 = new FuncionarioPorHora();
        f2.setIdFunc(002);
        f2.setNome("Carlos Silva");
        f2.setHorasTrabalhadas(160);
        f2.setSalarioPorHora(25);
        
        FuncionarioComissionado f3 = new FuncionarioComissionado();
        f3.setIdFunc(003);
        f3.setNome("Pedro Bial");
        f3.setPercentualComissao(12);
        f3.setVendas(100000);

        FolhaDePagamento folha = new FolhaDePagamento();

        folha.imprimirSalario(f1);
        folha.imprimirSalario(f2);
        folha.imprimirSalario(f3);
    }
}