package Animal_DZ;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        List<Animal> animalsList = new ArrayList<>();
        List<Doctor> doctorsList = new ArrayList<>();
        List<Nurse> nursesList = new ArrayList<>();

        // Doctors
        Doctor doctor1 = new Doctor();
        doctor1.name = "David Movas";
        doctor1.contact = "davidmovas@gmail.com";
        doctorsList.add(doctor1);

        // Nurses
        Nurse nurse1 = new Nurse();
        nurse1.name = "Luckas Threnter";
        nursesList.add(nurse1);

        Nurse nurse2 = new Nurse();
        nurse2.name = "Marina Volkova";
        nursesList.add(nurse2);

        // Animals
        Animal cat1 = new Cat();
        cat1.name = "Masha";
        cat1.health = 30;
        cat1.food = 15;
        cat1.drugs = "Adsorben";
        animalsList.add(cat1);

        Animal cat2 = new Cat();
        cat2.name = "Murka";
        cat2.health = 43;
        cat2.food = 70;
        cat2.drugs = "Ketofen";
        animalsList.add(cat2);

        Animal dog1 = new Dog();
        dog1.name = "Sharick";
        dog1.health = 61;
        dog1.food = 55;
        dog1.drugs = "Pharmox";
        animalsList.add(dog1);

        Animal duck1 = new Duck();
        duck1.name = "Goldman";
        duck1.health = 52;
        duck1.food = 39;
        duck1.drugs = "Dudocx";
        animalsList.add(duck1);

        // Input scanner
        VeterinaryClinic.PrintGreeting();
        VeterinaryClinic.PrintCommandList();
        while (flag) {
            int input;

            switch (VeterinaryClinic.GetInput()) {
                case (1):
                    VeterinaryClinic.PrintCommandList();
                    break;
                case (2):
                    VeterinaryClinic.PrintWorkers(doctorsList, nursesList);
                    break;
                case (3):
                    VeterinaryClinic.PrintAnimals(animalsList);
                    break;
                case (4):
                    VeterinaryClinic.PrintAnimalsByType(animalsList);
                    break;
                case (5):
                    input = VeterinaryClinic.PrintIDOfAnimal();
                    Doctor.toHeal(VeterinaryClinic.CkechIDOfAnimal(animalsList, input));
                    break;
                case (6):
                    input = VeterinaryClinic.PrintIDOfAnimal();
                    Nurse.toFeed(VeterinaryClinic.CkechIDOfAnimal(animalsList, input));
                    break;
                case (0):
                    flag = false;
            }
        }

    }
}
