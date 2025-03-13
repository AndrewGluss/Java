public class BinarDecimal {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишите тут ваш код
        String result = "";
        if (decimalNumber <= 0){
            return "";
        }
        else {
            while (decimalNumber >0){
                int ost = decimalNumber % 2;
                result += String.valueOf(ost);
                decimalNumber = decimalNumber / 2;
            }
            return new StringBuilder(result).reverse().toString();
        }
    }

    public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        int result = 0;
        if (binaryNumber == null) {
            return 0;
        }
        if (binaryNumber.equals("")){
            return 0;
        }
        else {
            char[] charArray = binaryNumber.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--){
                result += Character.getNumericValue(charArray[i]) * Math.pow(2, charArray.length - i - 1);
            }
            return result;
        }
    }
}
