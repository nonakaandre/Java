
package aula2poo;


public class Aula2Poo {
  
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); 
        c1.setModelo("BIC cristal");
        c1.setCor("Azul");
         c1.setPonta(0.5f);
        c1.setCarga(80);
        c1.setTampada(false); 
        
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
    
}
