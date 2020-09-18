package Homework1.Builder_Director;

abstract class CarBuilder {
    Car car;
    public void createCar(){
        car = new Car();
    }

    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar(){
        return car;
    }
}
