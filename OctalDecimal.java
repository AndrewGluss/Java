public class OctalDecimal {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        String result = "";
        if (decimalNumber <= 0){
            return 0;
        }
        else {
            while (decimalNumber >0){
                int ost = decimalNumber % 8;
                result += String.valueOf(ost);
                decimalNumber = decimalNumber / 8;
            }
            return Integer.parseInt(new StringBuilder(result).reverse().toString());
        }
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        int result = 0;
        if (octalNumber <= 0){
            return 0;
        }
        else {
            String octal = Integer.toString(octalNumber);
            char[] charArray = octal.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--){
                result += Character.getNumericValue(charArray[i]) * Math.pow(8, charArray.length - i - 1);
            }
            return result;
        }
    }
}
