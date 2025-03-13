import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class HexBinar {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишите тут ваш код
        Boolean isValid = Pattern.matches("[10]+", binaryNumber == null ? "" : binaryNumber);
        String result = "";
        if (binaryNumber == null) {
            return "";
        }
        if (binaryNumber.equals("")) {
            return "";
        }
        if (!isValid) {
            return "";
        }
        else {
            while (binaryNumber.length() % 4 != 0) {
                binaryNumber = "0" + binaryNumber;
            }

            char[] charArray = binaryNumber.toCharArray();
            for (int i = 0; i < charArray.length; i += 4) {
                int x = 0;
                int pow = 0;
                for (int j = i + 4 - 1; j >= i; j--) {
                    x += Character.getNumericValue(charArray[j]) * Math.pow(2, pow++);
                }
                result += HEX.charAt(x);
            }
            return result;
        }
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        Boolean isValid = Pattern.matches("[0-9a-f]+", hexNumber == null ? "" : hexNumber);
        String result1 = "";
        if (hexNumber == null) {
            return "";
        }
        if (hexNumber.equals("")) {
            return "";
        }
        if (!isValid) {
            return "";
        }
        else {
            long result = 0;
            char[] charArray = hexNumber.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--) {
                result += HEX.indexOf(charArray[i]) * Math.pow(16, charArray.length - i - 1);
            }
            while (result >0){
                long ost = result % 2;
                result1 += String.valueOf(ost);
                result = result / 2;
            }
            return new StringBuilder(result1).reverse().toString();
        }
    }
}
