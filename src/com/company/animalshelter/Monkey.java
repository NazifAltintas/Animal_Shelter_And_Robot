package com.company.animalshelter;

public class Monkey extends Animal{
    private boolean isHyperactive;

    public Monkey() {
        this.isHyperactive = false;
    }

    public Monkey(boolean isClean, int age, String name, int animalNumber, boolean isHyperactive) {
        super(isClean, age, name, animalNumber);
        this.isHyperactive = isHyperactive;
    }

    @Override
    public void treatAnimal() {
        setClean(true);
        isHyperactive = false;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "isHyperactive=" + isHyperactive +
                "} " + super.toString();
    }
}
