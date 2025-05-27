package controller;

import model.*;
import service.AdocaoService;

import java.util.Scanner;

public class AdocaoController {

    private AdocaoService service = new AdocaoService();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        while (true) {

            System.out.println("\n૮₍ \uD834\uDC7Dܫ\uD834\uDC7D ₎ა - ADOCÃO - ૮₍ \uD834\uDC7Dܫ\uD834\uDC7D ₎ა");
            System.out.println("\n ------- CADASTRO -------\n");
            System.out.println("1 -> Cadastrar Adotantes");
            System.out.println("2 -> Cadastrar Protetores");
            System.out.println("3 -> Cadastrar Animais");
            System.out.println("4 -> Realizar Adoção");
            System.out.println("5 -> Listar Adotantes");
            System.out.println("6 -> Listar Protetores");
            System.out.println("7 -> Listar Animais");
            System.out.println("8 -> Listar Adoções");
            System.out.println("0 >> Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir o Enter

            switch (opcao) {
                case 1 -> cadastrarAdotante();
                case 2 -> cadastrarProtetor();
                case 3 -> cadastrarAnimal();
                case 4 -> realizarAdocao();
                case 5 -> listarAdotantes();
                case 6 -> listarProtetores();
                case 7 -> listarAnimais();
                case 8 -> listarAdocoes();
                case 0 -> {
                    System.out.println("Encerrando programa.");
                    return;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    private void cadastrarAdotante() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();

        CadastroAdotante adotante = new CadastroAdotante(nome, cpf, telefone, email, 0, id);
        service.cadastrarAdotante(adotante);
        System.out.println("Adotante cadastrado(a) com sucesso!");
    }

    private void cadastrarProtetor() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();

        CadastroProtetor protetor = new CadastroProtetor(nome, cpf, telefone, email, 0, id);
        service.cadastrarProtetor(protetor);
        System.out.println("Protetor(a) cadastrado(a) com sucesso!");
    }

    private void cadastrarAnimal() {
        System.out.print("ID do Animal: ");
        String id = scanner.nextLine();
        System.out.print("Nome do Animal: ");
        String nome = scanner.nextLine();
        System.out.print("Raça do Animal: ");
        String raca = scanner.nextLine();
        System.out.print("ID do Protetor Responsável (deixe vazio se não houver): ");
        String idProtetor = scanner.nextLine();

        CadastroAnimal animal = new CadastroAnimal(id, nome, raca);

        if (!idProtetor.isBlank()) {
            CadastroProtetor protetor = service.buscarProtetorPorId(idProtetor);
            if (protetor != null) {
                animal.setProtetorResponsavel(protetor);
            } else {
                System.out.println("Protetor(a) não encontrado(a)! Animal será cadastrado sem protetor(a).");
            }
        }

        service.cadastrarAnimal(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }


    private void realizarAdocao() {
        System.out.print("ID do(a) Adotante: ");
        String idAdotante = scanner.nextLine();
        System.out.print("ID do Animal: ");
        String idAnimal = scanner.nextLine();

        CadastroAdotante adotante = service.buscarAdotantePorId(idAdotante);
        CadastroAnimal animal = service.buscarAnimalPorId(idAnimal);

        if (adotante == null) {
            System.out.println("Adotante não encontrado!");
            return;
        }
        if (animal == null) {
            System.out.println("Animal não encontrado!");
            return;
        }
        if (animal.isAdotado()) {
            System.out.println("Animal já foi adotado.");
            return;
        }

        boolean sucesso = service.realizarAdocao(adotante, animal);
        if (sucesso) {
            System.out.println("Adoção realizada com sucesso!");
        } else {
            System.out.println("Falha na adoção.");
        }
    }

    private void listarAdotantes() {
        System.out.println("\n--- Lista de Adotantes ---");
        if (service.getAdotantes().isEmpty()) {
            System.out.println("Nenhum(a) adotante cadastrado(a).");
        }
        for (CadastroAdotante adotante : service.getAdotantes()) {
            System.out.println("Nome: " + adotante.getNome() + " | ID: " + adotante.getId());
        }
    }

    private void listarProtetores() {
        System.out.println("\n--- Lista de Protetores ---");
        if (service.getProtetores().isEmpty()) {
            System.out.println("Nenhum(a) protetor(a) cadastrado(a).");
        }
        for (CadastroProtetor protetor : service.getProtetores()) {
            System.out.println("Nome: " + protetor.getNome() + " | ID: " + protetor.getId());
        }
    }

    private void listarAnimais() {
        System.out.println("\n--- Lista de Animais ---");
        if (service.getAnimais().isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        }
        for (CadastroAnimal animal : service.getAnimais()) {
            String status = animal.isAdotado() ? "Adotado" : "Disponível";
            System.out.println("Nome: " + animal.getNome() + " | ID: " + animal.getId() + " | Situação: " + status);
        }
    }

    private void listarAdocoes() {
        System.out.println("\n--- Lista de Adoções ---");
        if (service.getAdocoes().isEmpty()) {
            System.out.println("Nenhuma adoção registrada.");
        }
        for (Adocao adocao : service.getAdocoes()) {
            adocao.registroCadastro();
        }
    }
}
