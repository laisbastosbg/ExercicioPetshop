package View;

import java.util.Scanner;

import Controller.BanhoController;
import Model.Pet;

public class Menu {

    private static Menu shared = new Menu();

    private Scanner scanner = new Scanner(System.in);

    private BanhoController banhoController = new BanhoController();

    private Boolean isRunning = true;

    private Menu() {

    }

    public static Menu getInstance() {
        return shared;
    }

    public void displayOptions() {
        while (isRunning) {
            System.out.println("========================================");
            System.out.println("\tBem-vindo ao Pet Wash!");
            System.out.println("Selecione uma opção do menu abaixo:");
            System.out.println("----------------------------------------");
            System.out.println("[1] - Dar banho no pet");
            System.out.println("[2] - Abastecer com água");
            System.out.println("[3] - Abastecer com shampoo");
            System.out.println("[4] - Verificar nível de água");
            System.out.println("[5] - Verificar nível de shampoo");
            System.out.println("[6] - Verificar se tem pet no banho");
            System.out.println("[7] - Colocar pet na máquina");
            System.out.println("[8] - Retirar pet da máquina");
            System.out.println("[9] - Limpar máquina");
            System.out.println("[0] - Sair");
            System.out.println("========================================");
            System.out.print("Digite sua opção: ");
            this.getInput();
        }
    }

    public void getInput() {
        int option = scanner.nextInt();
        scanner.nextLine(); 

        switch (option) {
            case 1:
                banhoController.darBanho();
                break;
            case 2:
                banhoController.abastecerTanqueDeAgua();
                break;
            case 3:
                banhoController.abastecerTanqueDeShampoo();
                break;
            case 4:
                banhoController.verificarNivelDeAgua();
                break;
            case 5:
                banhoController.verificarNivelDeShampoo();
                break;
            case 6:
                banhoController.verificarSeHaPetNaMaquina();
                break;
            case 7:
                System.out.printf("Nome do pet: ");
                String nomePet = scanner.nextLine();
                System.out.printf("Nome do tutor: ");
                String nomeTutor = scanner.nextLine();
                Pet pet = new Pet(nomePet, nomeTutor);
                banhoController.botarPetNaMaquina(pet);
                break;
            case 8:
                banhoController.tirarPetDaMaquina();
                break;
            case 9:
                banhoController.limpar();
                break;
            case 0:
                System.out.println("Obrigado por usar o Pet Wash!");
                isRunning = false;
                scanner.close();
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
        }
    }
}
