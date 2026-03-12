/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author nonak
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3,5,7,4,67,8,5,65};
        Arrays.sort(vet); // ORDENA PRIMEIRO
        for (int v:vet) {
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 65); // DEPOIS INDICA EM QUAL POSIÇÃO DO ARRAY O NÚMERO ESTÁ
        System.out.println("Encontrei o valor na posição " + p);
    }
    
}
