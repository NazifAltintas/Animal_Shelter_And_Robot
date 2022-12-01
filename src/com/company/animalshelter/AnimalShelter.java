package com.company.animalshelter;

import java.util.*;

public class AnimalShelter {
    private List<Animal> animals;
    private int animalID;

    public AnimalShelter() {
        this(100);
    }

    public AnimalShelter(int animalID) {
        this.animalID = animalID;
        animals = new ArrayList<>();
    }

    public void printAnimals(){
        animals.forEach(System.out::println);
    }

    public void sortAnimals() {
        animals.sort(Comparator.comparingInt(Animal::getAnimalNumber));
    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortAnimalsByAge() {
        animals.sort(Comparator.comparingInt(Animal::getAge));
    }

    public void printAnimalsNotVaccinated(Disease disease){
        System.out.println("Animals that are not vaccinated for " + disease.name().toLowerCase() + ":");
        animals.stream()
                .filter(animal -> !animal.getIsVaccinated().get(disease))
                .forEach(System.out::println);
    }

    public Animal findAnimal(int animalID) {
        Optional<Animal> optionalAnimal = animals.stream()
                .filter(animal -> animal.getAnimalNumber() == animalID)
                .findFirst();

        return optionalAnimal.orElse(null);
    }

    public Animal findAnimal(String name) {
        Optional<Animal> optionalAnimal = animals.stream()
                .filter(animal -> animal.getName().equals(name))
                .findFirst();

        return optionalAnimal.orElse(null);
    }

    public void treatAnimal(int animalID) {
        Animal animal = findAnimal(animalID);
        if (animal != null) {
            animal.treatAnimal();
        }
    }

    public void treatAnimal(String name){
        Animal animal = findAnimal(name);
        if (animal != null) {
            animal.treatAnimal();
        }
    }

    public void treatAllAnimals() {
        animals.forEach(Animal::treatAnimal);
    }

    public Animal findOldestAnimal() {
        sortAnimalsByAge();
        return animals.get(animals.size() - 1);
    }

    public int countAnimals() {
        return animals.size();
    }

    public void addAnimal(Animal animal) {
        animal.setAnimalNumber(animalID++);
        animals.add(animal);
    }
}
