public class LongString {
    public static void main(String[] args) {
        long longVar = 1265078955;

        // a.
        String longToString = Long.toString(longVar);
        System.out.println("Long to String: " + longToString);

        // b.
        Long longIns = Long.valueOf(longVar);
        System.out.println("Long to Long Instance: " + longIns);

        // c.
        String str = "1230";
        Long stringToLongIns = Long.valueOf(str);
        System.out.println("String Instance to Long Instance: " + stringToLongIns);

        // d.
        String binString = Long.toBinaryString(longVar);
        System.out.println("Long to Binary String: " + binString);
        String octalString = Long.toOctalString(longVar);
        System.out.println("Long to Octal String: " + octalString);
        String hexString = Long.toHexString(longVar);
        System.out.println("Long to Hexadecimal String: " + hexString);
    }
}
