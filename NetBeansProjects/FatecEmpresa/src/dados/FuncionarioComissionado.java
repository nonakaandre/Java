
package dados;


public class FuncionarioComissionado extends Funcionarios {
    private double vendas;
    private double percentualComissao;

    //ADICIONAR O CONSTRUTOR
    //public FuncionariComissionado(int i, String n, double v, double p){
    //super(i,n)/
    //this.setVendas(v);
    //this.setPercentualComissao(c);
    
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
