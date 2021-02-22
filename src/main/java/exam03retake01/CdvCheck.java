package exam03retake01;

public class CdvCheck {
    public boolean check(String taxNumber) {
        int sum = 0;
        int number = 0;
        if (isValidTaxNumber(taxNumber)) {
            for (int i = 0; i < taxNumber.length() - 1; i++) {
                number = (i + 1) * Integer.parseInt(taxNumber.substring(i, i + 1));
                sum += number;
            }
        }
        return (Integer.parseInt(taxNumber.substring(9, 10)) == sum % 11);
    }

    private boolean isValidTaxNumber(String taxNumber) {
        boolean result = true;
        if (taxNumber.length() != 10) {
            throw new IllegalArgumentException("Wrong number");
        }else{
            for (int i = 0; i < taxNumber.length(); i++) {
                if (!Character.isDigit(taxNumber.charAt(i))) {
                    throw new IllegalArgumentException("Wrong Number");
                }
            }
        }
        return result;
    }
}
