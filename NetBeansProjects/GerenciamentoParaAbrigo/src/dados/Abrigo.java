
package dados;

import java.util.LinkedList;


public class Abrigo {
    
    private LinkedList<Animal> pets;

    public Abrigo() {
        this.pets = new LinkedList<>();
    }
    
    public void addAnimal(Animal a) {
        this.pets.add(a);
    }
    
    public Animal getAnimal(int idx) {
        return this.pets.get(idx);
    }
    
    public void adotarAnimal(int idx) {
        Animal a = this.pets.get(idx);
        a.adotar();
    }
    
    public String imprimirDisponivel() {
    String retorno = "Pets Disponíveis\n";
    
    for (int i = 0; i < pets.size(); i++) {
        Animal a = pets.get(i);
        if (!a.isAdotado()) {
            retorno += i + " - " + a.getNome() + "\n";
        }
    }

    retorno += "Total aguardando adoção: " + Animal.getAguardandoAdocao();
    return retorno;
}
}
