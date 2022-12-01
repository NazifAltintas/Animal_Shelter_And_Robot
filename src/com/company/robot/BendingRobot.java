package com.company.robot;

public class BendingRobot extends Robot{
    private double maxBendAngle;

    public BendingRobot(double maxBendAngle, String unitName) {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double angle){
        if (angle % 360 <= maxBendAngle) {
            System.out.println("Bending succesful: " + angle%360 + " degree angle");
        } else {
            System.out.println("Robot couldn't bend.");
        }
    }

    @Override
    public String toString() {
        return "BendingRobot{" +
                "maxBendAngle=" + maxBendAngle +
                "} " + super.toString();
    }
}
