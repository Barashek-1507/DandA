package Homework1.Builder_Director;

class Car {
    String make;
    Transmission  transmission;
    int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String toString(){
        return " Car [make = " + make + ", transmission= " + transmission + ", maxSpeed= " + maxSpeed + "]";
    }
}