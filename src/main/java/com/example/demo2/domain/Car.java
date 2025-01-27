package com.example.demo2.domain;

public class Car {
private int speed;
private int gas;
private String name;


public Car(int speed, int gas, String name) {
    this.speed = speed;
    this.gas = gas;
    this.name = name;
}

public Car() {
}



public int getSpeed() {
    return speed;
}
public void setSpeed(int speed) {
    this.speed = speed;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

public int getGas() {
    return gas;
}




}
