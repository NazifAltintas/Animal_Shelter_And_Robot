package com.company.robot;

public class CrazyRobot extends Robot{
    public CrazyRobot() {}

    public CrazyRobot(String unitName) {
        super(unitName);
    }

    @Override
    public void boot() {
        String name = getUnitName();
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        String reversedName = sb.toString();
        setUnitName(reversedName);

        super.boot();
    }


}
