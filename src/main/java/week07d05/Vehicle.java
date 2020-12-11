package week07d05;


public abstract class Vehicle {

    private int numberOfGears;
    private TransmissionType transmissionType;

    public Vehicle(int numberOfGears, TransmissionType transmissionType) {
        this.numberOfGears = 5;
        this.transmissionType = TransmissionType.MANUAL;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }
}
