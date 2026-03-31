package dados;

import java.util.Collections;
import java.util.Comparator;
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

    public void listarAnimais() {
        String retorno = "Pets Disponíveis\n";

        for (int i = 0; i < pets.size(); i++) {
            Animal a = pets.get(i);
            if (!a.isAdotado()) {
                System.out.println(i + " - " + a.getDescricao());
            }
        }
    }

    public int getTotalAguardando() {
        int count = 0;
        for (Animal a : pets) {
            if (!a.isAdotado()) {
                count++;
            }
        }
        return count;
    }

    public String imprimirDisponivel() {
        String texto = "";

        for (int i = 0; i < pets.size(); i++) {
            Animal a = pets.get(i);

            if (!a.isAdotado()) {
                texto += i + " - " + a.getDescricao() + "\n";
            }
        }

        return texto;
    }

    public void adotarAnimal(int idx) {
        if (idx >= 0 && idx < pets.size()) {
            Animal a = pets.get(idx);

            if (a.isAdotado()) {
                System.out.println("Animal já foi adotado.");
            } else {
                a.setAdotado(true);
            }
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public int getTotal() {
        return pets.size();
    }

    public void ordenarPorPrioridade() {
        Collections.sort(pets,
                Comparator.comparing(Animal::getPrioridadeAdocao).reversed()
        );
    }
}
