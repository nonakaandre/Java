package Tela;

import dados.Conta;
import java.util.Scanner;

public class Gerenciador {
    
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in); 
       Conta ct = new Conta (0001,"CC", "Andre",0, true);
        
      ct.abrirConta("CC");
        System.out.println("Quer fazer um deposito de quanto?");
        float deposito = scanner.nextFloat();
      ct.depositar(deposito);
      ct.sacar(400);
        System.out.println(ct.estadoAtual());
         
    }
    
}
