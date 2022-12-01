package com.company.animalshelter;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Vaccinateable, Treatable{
    private Map<Disease, Boolean> isVaccinated;
    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;

    {
        isVaccinated = new HashMap<>();
        Disease[] diseases = Disease.values();
        for (Disease disease : diseases) {
            isVaccinated.put(disease, false);
        }
    }

    public Animal() {
        this.name = "No name";
    }

    public Animal(boolean isClean, int age, String name, int animalNumber) {
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.replace(disease, true);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "isVaccinated=" + isVaccinated +
                ", isClean=" + isClean +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", animalNumber=" + animalNumber +
                '}';
    }
}
