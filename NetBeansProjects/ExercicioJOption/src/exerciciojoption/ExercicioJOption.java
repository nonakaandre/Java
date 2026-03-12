/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojoption;
import javax.swing.JOptionPane;
/**
 *
 * @author nonak
 */
public class ExercicioJOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,c = 0, s = 0, par = 0, impar = 0, maior = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
            if (n % 2 == 0 && n>0) {
                par++;
            } else {
                impar++;
            } 
            if (n >= 100){
                maior++;
            }
            c++;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr><br>"
                + "Total de valores " + (c - 1) + "<br>"
                        + "Total de Pares: " + par + "<br>"
                                + "Total de Impares: " + (impar - 1) + "<br>"
                                        + "Acima de 100: " + maior + "<br>"
                                                + "Média dos Valores: "+ (s / (c - 1)) + "<html>");
        
    }
    
}
