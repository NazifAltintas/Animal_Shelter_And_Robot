package com.company.robot;

public class LiftingRobot extends Robot{
    private double maxLiftHeight;

    public LiftingRobot(double maxLiftHeight, String unitName) {
        super(unitName);
        this.maxLiftHeight = maxLiftHeight;
    }

    public void lift(double height) {
        if (height <= maxLiftHeight) {
            System.out.println("Robot lifted: " + height);
        } else {
            System.out.println("Robot couldn't lift");
        }
    }

    @Override
    public String toString() {
        return "LiftingRobot{" +
                "maxLiftHeight=" + maxLiftHeight +
                "} " + super.toString();
    }
}
