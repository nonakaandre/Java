
package dados;


public class FuncionarioAssalariado extends Funcionarios{

  
    
    private double salarioFixo;
    

    @Override
    public double calcularSalario(){
       return getSalarioFixo();  
    }
    
    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    
    
}
