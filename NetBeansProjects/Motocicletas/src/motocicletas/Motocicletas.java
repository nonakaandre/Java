/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motocicletas;

/**
 *
 * @author nonak
 */
public class Motocicletas {

    public static void main(String[] args) {
        Motos m1 = new Motos();

        m1.setFabricante("Yamaha");
        m1.setModelo("Nmax");
        m1.setAno(2017);
        m1.setCilindrada(160);
        m1.setCor("Vermelha");
        
         Motos m2 = new Motos();

        m2.setFabricante("Honda");
        m2.setModelo("Titan");
        m2.setAno(2025);
        m2.setCilindrada(160);
        m2.setCor("Prata");

        System.out.println(m1);
        System.out.println(m2);
        
        m1.desligada();
        m1.dirigir();
        
        m2.ligada();
        m2.dirigir();
    }

}
