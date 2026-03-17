
package dados;


public class FuncionarioPorHora extends Funcionarios{
    
    private int horasTrabalhadas;
    private double salarioPorHora;

    @Override
    public double calcularSalario() {
        return getHorasTrabalhadas() * getSalarioPorHora();
        
    }
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    
    
}
