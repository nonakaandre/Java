/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author nonak
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Digite quantas pernas:");
        int pernas = t.nextInt();
        System.out.print("Isso é um(a) ");
        String tipo;
        tipo = switch (pernas) {  // FORMA COMPLETA SEM REDUÇÃO ESTÁ NO FINAL
            case 1 -> "Saci";
            case 2 -> "Bípede";
            case 4 -> "Quadrúpede";
            case 6, 8 -> "Aranha";
            default -> "ET";
        };
        System.out.println(tipo);
    }
    
}
        /*switch (pernas) {   
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4: 
                tipo = "Quadrúpede";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }*/