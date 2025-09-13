public class FloatString {
    public static void main(String[] args) {
        float floatVar = 1265078955;

        // a.
        String floatToString = Float.toString(floatVar);
        System.out.println("Float to String: " + floatToString);

        // b.
        Float floatIns = Float.valueOf(floatVar);
        System.out.println("Float to Float Instance: " + floatIns);

        // c.
        String str = "1230";
        Float stringToFloatIns = Float.valueOf(str);
        System.out.println("String Instance to Float Instance: " + stringToFloatIns);

        // d.
        String hexString = Float.toHexString(floatVar);
        System.out.println("Float to Hexadecimal String: " + hexString);
    }
}
