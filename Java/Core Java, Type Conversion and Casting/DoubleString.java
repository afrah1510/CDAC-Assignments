public class DoubleString {
    public static void main(String[] args) {
        double doubleVar = 1265078.955;

        // a.
        String doubleToString = Double.toString(doubleVar);
        System.out.println("Double to String: " + doubleToString);

        // b.
        Double doubleIns = Double.valueOf(doubleVar);
        System.out.println("Double to Double Instance: " + doubleIns);

        // c.
        String str = "1230";
        Double stringToDoubleIns = Double.valueOf(str);
        System.out.println("String Instance to Double Instance: " + stringToDoubleIns);

        // d.
        long bits = Double.doubleToLongBits(doubleVar);
        String binString = Long.toBinaryString(bits);
        System.out.println("Double to Binary String: " + binString);
        String octalString = Long.toOctalString(bits);
        System.out.println("Double to Octal String: " + octalString);
        String hexString = Long.toHexString(bits);
        System.out.println("Double to Hexadecimal String: " + hexString);
    }
}
