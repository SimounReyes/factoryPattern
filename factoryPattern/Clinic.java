package factoryPattern;

import java.util.Scanner;

public class Clinic {
   public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Integer choice = 99;

        do{
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Terminate System");
            System.out.print("\nChoose your pet number: ");
            choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;
                case 3:
                    System.out.println("\nSystem Terminated!");
                    return;
                default:
                    System.out.println("\nIncorrect Input!\n");
                    System.out.println("--------------------------------------------\n");
                    continue;
            }

            System.out.println("\nPet id is: " + petFile.getPetId());
            System.out.println("Pet name is: " + petFile.getPetName());
            System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
            switch (choice) {
                case 1:
                    System.out.println("The Breed is: " + ((Dog) petFile.getPet()).getBreed());
                    break;
                case 2:
                    System.out.println("Number of Lives: " + ((Cat) petFile.getPet()).getNoOfLives());
                    break;
            }
            System.out.println("Communication sound: " + petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play()+"\n");
            System.out.println("--------------------------------------------\n");


        }while(choice!=3);
    }
}
