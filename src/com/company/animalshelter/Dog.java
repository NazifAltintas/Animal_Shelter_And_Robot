package com.company.animalshelter;

public class Dog extends Animal{
    private boolean hasFoulBreath;

    public Dog() {
        this.hasFoulBreath = false;
    }

    public Dog(boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isClean, age, name, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public void treatAnimal() {
        setClean(true);
        hasFoulBreath = false;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "hasFoulBreath=" + hasFoulBreath +
                "} " + super.toString();
    }
}
