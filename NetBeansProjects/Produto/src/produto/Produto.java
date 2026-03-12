/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package produto;

import java.util.Scanner;

/**
 *
 * @author nonak
 */
public class Produto { //ATRIBUTO
    String nome;
    double preco;
    int quantidade;
    
    public Produto(String nome, double preco, int quantidade){ // CONSTRUTOR
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //modificador  tipoRetorno  nomeMetodo (parametros) { código
       public         void       apresentar     ()      { 
        System.out.println("Olá, o preço do " + nome + " é " + preco + " e temos "
        + quantidade + " no estoque.");
    }
       public void venda(int qtdVendida) { //Método para reduzir a quantidade 
           
           if(qtdVendida <= quantidade){
               quantidade -= qtdVendida;
               System.out.println("Venda realizada.");
           }else {
               System.out.println("Estoque insuficiente.");
           }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); // Permite a entrada de dados
        
        Produto p1 = new Produto("Notebook", 2500, 2); // EXECUTA 
        
        System.out.println(p1.nome);
        System.out.println(p1.preco);
        System.out.println(p1.quantidade);
        
        p1.apresentar(); //CHAMA O MÉTODO 
        
        System.out.println("Digite a quantidade vendida: ");
        int qtd = teclado.nextInt();
        
        p1.venda(qtd);
        p1.apresentar();
        
    }
    
    
}
