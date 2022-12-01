package com.company.robot;

public class RobotApp {
    public static void main(String[] args) {
        LiftingRobot liftingRobot = new LiftingRobot(100, "Lifty");
        BendingRobot bendingRobot = new BendingRobot(100, "Bendy");
        CrazyRobot crazyRobot = new CrazyRobot("Wendy");

        liftingRobot.lift(50);
        liftingRobot.lift(5555);

        bendingRobot.bend(380);
        bendingRobot.bend(300);


    }
}
