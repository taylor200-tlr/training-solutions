package ioreadwritebytes;

public class Temperatures {
    private byte[] data;

    public byte[] getData() {
        return data;
    }

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public double getYearAverage() {
        double result = 0.0;
        for (double i : data) {
            result += i;
        }
        return result / data.length;
    }

    public double getMonthAverage() {
        double result = 0.0;
        int j = 0;
        if (data.length < 30){
            j = data.length;
        }else {
            j = data.length - 30;
        }
        for (int i = j; i < data.length; i++){
            result += data[i];
        }
        return result / j;
    }
}
