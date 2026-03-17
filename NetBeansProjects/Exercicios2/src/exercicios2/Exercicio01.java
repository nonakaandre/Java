
package exercicios2;


public class Exercicio01 {

    public static void main(String[] args) {
        Sensor s = new Sensor();
        
        s.setId("001");
        s.setTipo("Detector");
        s.setLeituraAtual(100.12);
        
        s.verificarStatus();
    }
    
}
