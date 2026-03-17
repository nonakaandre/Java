
package dados;


public class FuncionarioComissionado extends Funcionarios {
    private double vendas;
    private double percentualComissao;
    
    @Override
        public double calcularSalario() {
            return (getVendas() * getPercentualComissao())/ 100;
        }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
}
