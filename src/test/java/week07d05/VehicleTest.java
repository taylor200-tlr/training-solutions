package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void testVehicle(){
        Vehicle truck = new Truck(4, TransmissionType.MANUAL);
        System.out.println(truck.getNumberOfGears());
        System.out.println(truck.getTransmissionType());
    }

}