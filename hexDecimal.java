public class hexDecimal {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
        String result = "";
        if (decimalNumber <= 0){
            return "";
        }
        else {
            while (decimalNumber >0){
                int index = decimalNumber % 16;
                result += HEX.charAt(index) ;
                decimalNumber = decimalNumber / 16;
            }
            return new StringBuilder(result).reverse().toString();
        }
    }

    public static int toDecimal(String hexNumber) {
        //напишите тут ваш код
        int result = 0;
        if (hexNumber == null) {
            return 0;
        }
        if (hexNumber.equals("")){
            return 0;
        }
        else {
            char[] charArray = hexNumber.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--){
                System.out.println(charArray[i] + " " + HEX.indexOf(charArray[i]) + " " + (charArray.length - i - 1));
                result += HEX.indexOf(charArray[i]) * Math.pow(16, charArray.length - i - 1);
                System.out.println(result);
            }
            return result;
        }
    }
}
