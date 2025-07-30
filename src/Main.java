import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine(); 
    public static void main(String[] args) {
        int option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1. Dar banho no pet;");
            System.out.println("2. Abastecer a máquina com água;");
            System.out.println("3. Abastecer a máquina com shampoo;");
            System.out.println("4. Verificar água da máquina;");
            System.out.println("5. Verificar shampoo da máquina;");
            System.out.println("6. Verificar se tem pet no banho;");
            System.out.println("7. Colocar pet na máquina;");
            System.out.println("8. Retirar pet da máquina;");
            System.out.println("9. Limpar a máquina");
            System.out.println("0. Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> verifyPet(); 
                case 7 -> setPetInPetMachine(); 
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }

        } while (option != 0);


        scanner.close();
    }

    private static void setWater() {
        System.out.println("Tentando adicionar água à maquina");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando adicionar shampoo à maquina");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        int waterAmount = petMachine.getWater();
        System.out.printf("A máquina está com %s litros de água%n", waterAmount);
    }

    private static void verifyShampoo() {
        int shampooAmount = petMachine.getShampoo();
        System.out.printf("A máquina está com %s litros de shampoo%n", shampooAmount);
    }
    
    private static void verifyPet() {
        boolean hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInPetMachine() {
        String name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }
        Pet pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.printf("O pet %s foi colocado na máquina%n",pet.getName());
    }
}