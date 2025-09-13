public class DoubleCon {
    public static void main(String[] args) {
        Double doubleIns = 152600.4578;

        // Byte
        byte byteVar = doubleIns.byteValue();
        System.out.println("Double Instance to Byte: " + byteVar);

        // Short
        short doubleInsToShort = doubleIns.shortValue();
        System.out.println("Double Instance to Short: " + doubleInsToShort);

        // Int
        int doubleInsToInt = doubleIns.intValue();
        System.out.println("Double Instance to Int: " + doubleInsToInt);

        // Long
        long doubleInsToLong = doubleIns.longValue();
        System.out.println("Double Instance to Long: " + doubleInsToLong);

        // Float
        float doubleInsToFloat = doubleIns.floatValue();
        System.out.println("Double Instance to Float: " + doubleInsToFloat);

        // Double Instance to Double
        double doubleInsToDouble = doubleIns.doubleValue();
        System.out.println("Double Instance to Double: " + doubleInsToDouble);
    }
}
