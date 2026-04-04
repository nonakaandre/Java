package main;

import dados.Livro;

public class Main {
    public static void main(String[] args) {
     Livro[] acervo = new Livro[5];
     try {
         for (int i = 0; i <= 5; i++) {
             acervo[i] = new Livro("1233456", "TantoFaz", "não sei", 2055);
             Livro.incrementarTotal();
         }
     }catch (Exception e){
         System.err.println("Capacidade do acervo excedida");
     } finally {
         System.out.println(Livro.getTotalRegistrados() + " Livro registrados com sucesso.");
     }
    }
}
