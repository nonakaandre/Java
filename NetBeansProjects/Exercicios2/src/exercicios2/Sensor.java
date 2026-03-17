
package exercicios2;


public class Sensor {
    private String id;
    private String  tipo;
    private double leituraAtual;
    
    public void verificarStatus() {
        if(leituraAtual > 100) {
            System.out.println("Alerta!");
        }else {
            System.out.println("Normal");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(double leituraAtual) {
        if(leituraAtual < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo");
        }
        this.leituraAtual = leituraAtual;
        
    }
}
