
package dados;


public class FuncionarioPorHora extends Funcionarios{
    
    private int horasTrabalhadas;
    private double salarioPorHora;

    //É PRECISO ADICIONAR O CONSTRUTOR
    
    
    @Override
    public double calcularSalario() {
        return getHorasTrabalhadas() * getSalarioPorHora(); //TENHO QUE ADICIONAR O this.get...
        
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
