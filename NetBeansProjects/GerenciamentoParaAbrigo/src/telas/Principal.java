//Tive bastante dificuldade em criar a classe "Principal e Abrigo", acabei precisando de ajuda para entender como montar todas estrutura.

package telas;

import dados.Abrigo;
import dados.Animal;
import dados.Cachorro;
import dados.Gato;
import dados.Passaro;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int opt = 1;

        try (Scanner sc = new Scanner(System.in)) {
            Abrigo abr = new Abrigo();

            while (opt != 0) {
                System.out.println("\nBem Vindo ao Abrigo 'Patas Felizes'");
                System.out.println("1 - Cadastrar um animal");
                System.out.println("2 - Listar animais disponíveis");
                System.out.println("3 - Total aguardando adoção");
                System.out.println("4 - Adotar animal");
                System.out.println("0 - Sair");

                opt = Integer.parseInt(sc.nextLine());

                switch (opt) {

                    case 1 -> {
                        System.out.println("1 - Cachorro");
                        System.out.println("2 - Gato");
                        System.out.println("3 - Pássaro");

                        int tipo = Integer.parseInt(sc.nextLine());

                        System.out.println("Nome:");
                        String nome = sc.nextLine();

                        System.out.println("Idade:");
                        int idade = Integer.parseInt(sc.nextLine());

                        Animal pet = null;

                        switch (tipo) {
                            case 1 -> pet = new Cachorro(nome, idade);
                            case 2 -> pet = new Gato(nome, idade);
                            case 3 -> pet = new Passaro(nome, idade);
                            default -> System.out.println("Tipo inválido.");
                        }

                        if (pet != null) {
                            abr.addAnimal(pet);
                            System.out.println("Animal cadastrado com sucesso!");
                        }
                    }

                    case 2 -> {
                        abr.ordenarPorPrioridade();
                        System.out.println(abr.imprimirDisponivel());
                    }

                    case 3 -> {
                        System.out.println("Total aguardando adoção: " + abr.getTotalAguardando());
                    }

                    case 4 -> {
                        System.out.println(abr.imprimirDisponivel());

                        System.out.println("Digite o número do animal que deseja adotar:");
                        int idx = Integer.parseInt(sc.nextLine());

                        if (idx >= 0 && idx < abr.getTotal()) {
                            abr.adotarAnimal(idx);
                            System.out.println("Animal adotado!");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }

                    case 0 -> System.out.println("Encerrando...");

                    default -> System.out.println("Opção inválida.");
                }
            }
        }
    }
}
