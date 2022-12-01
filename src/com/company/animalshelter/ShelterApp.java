package com.company.animalshelter;

public class ShelterApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat(false, 10, "Noodles", 0, true);
        Cat cat2 = new Cat(true, 10, "Poodles", 0, true);
        Cat cat3 = new Cat(false, 10, "Roodles", 0, true);
        Cat cat4 = new Cat(true, 10, "Bob", 0, true);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();

        Monkey monkey = new Monkey();
        Monkey monkey2 = new Monkey(false, 15, "Mankey", 1, true);

        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.addAnimal(cat1);
        animalShelter.addAnimal(cat2);
        animalShelter.addAnimal(cat3);
        animalShelter.addAnimal(cat4);
        animalShelter.addAnimal(dog1);
        animalShelter.addAnimal(dog2);
        animalShelter.addAnimal(dog3);
        animalShelter.addAnimal(dog4);
        animalShelter.addAnimal(monkey);
        animalShelter.addAnimal(monkey2);
    }
}
