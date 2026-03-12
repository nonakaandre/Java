/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testelogicofinal;

import java.util.Scanner;

/**
 *
 * @author nonak
 */
public class TesteLogicoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N]");
            resp = teclado.next();
        }while (resp.equals("s"));
        System.out.println("A soma de os números é " + s2);
    }
    
}
