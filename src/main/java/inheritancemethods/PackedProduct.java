package inheritancemethods;

import java.math.BigDecimal;

public class PackedProduct extends Product{
    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }
    public BigDecimal totalWeight(int pieces){

        return totalWeight(packingUnit);

        // Nem értem itt mit kellene kiszámolni, nem világos számomra a feladat :(




    }
}
