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
                System.out.println("Bem Vindo ao Abrigo 'Patas Felizes'");
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

                        System.out.println("Histórico de saúde:");
                        String hSaude = sc.nextLine();

                        Animal pet = null;

                        switch (tipo) {
                            case 1 -> {
                                System.out.println("Raça:");
                                String raca = sc.nextLine();
                                pet = new Cachorro(nome, idade, hSaude, raca);
                            }

                            case 2 -> {
                                System.out.println("Tipo de pelo:");
                                String tipoPelo = sc.nextLine();
                                pet = new Gato(nome, idade, hSaude, tipoPelo);
                            }

                            case 3 -> {
                                System.out.println("Cor:");
                                String cor = sc.nextLine();
                                pet = new Passaro(nome, idade, hSaude, cor);
                            }

                            default -> System.out.println("Tipo inválido.");
                        }

                        if (pet != null) {
                            abr.addAnimal(pet);
                            System.out.println("Animal cadastrado com sucesso!");
                        }
                    }

                    case 2 -> System.out.println(abr.imprimirDisponivel());

                    case 3 -> System.out.println("Total aguardando adoção: " + Animal.getAguardandoAdocao());

                    case 4 -> {
                        System.out.println(abr.imprimirDisponivel());

                        System.out.println("Digite o número do animal que deseja adotar4:");
                        int idx = Integer.parseInt(sc.nextLine());

                        abr.adotarAnimal(idx);
                        System.out.println("Animal adotado!");
                    }

                    case 0 -> System.out.println("Encerrando...");

                    default -> System.out.println("Opção inválida.");
                }
            }
        }
    }
}