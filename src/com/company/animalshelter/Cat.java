package com.company.animalshelter;

public class Cat extends Animal{
    private boolean hasLongNails;

    public Cat() {
        this.hasLongNails = false;
    }

    public Cat(boolean isClean, int age, String name, int animalNumber, boolean hasLongNails) {
        super(isClean, age, name, animalNumber);
        this.hasLongNails = hasLongNails;
    }

    @Override
    public void treatAnimal() {
        setClean(true);
        hasLongNails = false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hasLongNails=" + hasLongNails +
                "} " + super.toString();
    }
}
