package com.company.robot;

public abstract class Robot {
    private String unitName;

    public Robot() {
        this("nameless Robot");
    }

    public Robot(String unitName){
        this.unitName = unitName;
        boot();
    }

    public void boot(){
        System.out.println("Robot starting: " + unitName);
    }

    public String getUnitName(){
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "unitName='" + unitName + '\'' +
                '}';
    }
}
