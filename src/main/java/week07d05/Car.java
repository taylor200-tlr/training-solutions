package week07d05;

public abstract class Car extends Vehicle {

    public Car(int numberOfGears, TransmissionType transmissionType) {
        super(numberOfGears = 5, transmissionType = TransmissionType.AUTOMATIC);
    }

}
