



public class TestePoo {

   
    public static void main(String[] args) {
      
        Produtos p1 = new Produtos();
        
        p1.setId(1);
        p1.setNome("coxinha(s)");
        p1.setPreco(5.9);
        p1.setQuantidade(2);
        
        System.out.println("O valor total da compra de " + p1.getQuantidade() +" "+ p1.getNome() + " foi de " + p1.valorTotal());
        
    }
    
}
