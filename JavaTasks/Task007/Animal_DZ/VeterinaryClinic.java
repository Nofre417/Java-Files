package Animal_DZ;

import java.util.List;
import java.util.Scanner;

public class VeterinaryClinic {
    static Scanner scanner = new Scanner(System.in);

    static void PrintCommandList(){
        System.out.println("1 - Command list");
        System.out.println("2 - Workers list");
        System.out.println("3 - Animal  list");
        System.out.println("4 - Animal by type list");
        System.out.println("5 - Heal  animal");
        System.out.println("6 - Feed  animal");
        System.out.println("0 - Finish");
    }

    static int PrintIDOfAnimal(){
        System.out.print("Enter ID of animal: ");
        int input = scanner.nextInt();
        return input;
    }

    static Animal CkechIDOfAnimal(List<Animal> animalLis, int input){
        boolean isAnimalFound = false;
        Animal animal = null;
        for(int i = 0; i < animalLis.size(); i++){
            if((input - 1) == i){
                animal = animalLis.get(input - 1);
                isAnimalFound = true;
            }
        }
        if(!isAnimalFound){
            System.out.println("Entered ID is wrong !");
            PrintIDOfAnimal();
        }
        return animal;
    }

    static int GetInput(){
        System.out.print("Command: ");
        int input = scanner.nextInt();
        CheckInput(input);
        return input;
    }
    static int CheckInput(int input){
        int[] refArray = {0, 1, 2, 3, 4, 5, 6};
        boolean isInArray = false;
        for(int i = 0; i < refArray.length; i++){
            if(input == refArray[i]){
                isInArray = true;
            }
        }
        if(!isInArray) {
            System.out.println("Entered wrong number !");
            GetInput();
        }
        return input;
    }


    static void PrintGreeting(){
        System.out.println("\u001B[32m" + "WELCOME" + "\u001B[0m");
    }

    public static void PrintSpliter(){
        System.out.println("\u001B[33m" + "-----------------------------" + "\u001B[0m");
    }

    public static void PrintAnimals(List<Animal> animalList){
        System.out.println("CLINIC ANIMALS");
        System.out.println("\u001B[33m" + "-----------------------------" + "\u001B[0m");
        int index = 1;
        for(Animal animal : animalList){
            System.out.println("ID: " + index + " - " + "Name: " + animal.name + " Health: " + animal.health + " Food: " + animal.food + " Drugs: " + animal.drugs);
            index++;
        }
        System.out.println("\u001B[33m" + "-----------------------------" + "\u001B[0m");
    }

    public static void PrintAnimalsByType(List<Animal> animalList){
        System.out.println("CLINIC ANIMALS");
        System.out.println("\u001B[33m" + "-----------------------------" + "\u001B[0m");
        System.out.println("Goable animals:");
        for(Animal animal: animalList){
            if(animal instanceof Goable){
                System.out.println(animal.name);
            }
        }
        System.out.println("\u001B[33m" + "-----------------------------" + "\u001B[0m");
        System.out.println("Swimable animals:");
        for(Animal animal: animalList){
            if(animal instanceof Swimable){
                System.out.println(animal.name);
            }
        }
        System.out.println("\u001B[33m" + "-----------------------------" + "\u001B[0m");
        System.out.println("Flyable animals:");
        for(Animal animal: animalList){
            if(animal instanceof Flyable){
                System.out.println(animal.name);
            }
        }
        System.out.println("\u001B[33m" + "-----------------------------" + "\u001B[0m");
    }

    public static void PrintWorkers(List<Doctor> doctorsList, List<Nurse> nurseList){
        System.out.println("CLINIC WORKERS");
        System.out.println("\u001B[33m" + "-----------------------------" + "\u001B[0m");
        System.out.println("Doctors:");
        for(Doctor doctor: doctorsList){
            System.out.println("Name: " + doctor.name);
            System.out.println("Contact: " + doctor.contact);
        }
        System.out.println("\u001B[33m" + "-----------------------------" + "\u001B[0m");
        System.out.println("Nurses:");
        for(Nurse nurse : nurseList){
            System.out.println("Name: " + nurse.name);
        }
        System.out.println("\u001B[33m" + "-----------------------------" + "\u001B[0m");
    }

}
