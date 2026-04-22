package aula04;

public class Aula04 {

    public static void main(String[] args) {
      Caneta c1 =new Caneta();
      c1.setModelo("BIC");
      c1.setPonta((float) 0.5);
      c1.status();
      
        System.out.println("Eu tenho uma caneta " + c1.getModelo() + " de ponta " +
            c1.getPonta());
    }
    
}
