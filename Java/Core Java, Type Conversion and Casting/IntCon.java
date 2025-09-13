public class IntCon {
    public static void main(String[] args) {
        Integer intIns = 15260;

        // Byte
        byte byteVar = intIns.byteValue();
        System.out.println("Int Instance to Byte: " + byteVar);

        // Short
        short intInsToShort = intIns.shortValue();
        System.out.println("Int Instance to Short: " + intInsToShort);

        // Int Instance to Int
        int intInsToInt = intIns.intValue();
        System.out.println("Int Instance to Int: " + intInsToInt);

        // Long
        long intInsToLong = intIns.longValue();
        System.out.println("Int Instance to Long: " + intInsToLong);

        // Float
        float intInsToFloat = intIns.floatValue();
        System.out.println("Int Instance to Float: " + intInsToFloat);

        // Double
        double intInsToDouble = intIns.doubleValue();
        System.out.println("Int Instance to Double: " + intInsToDouble);
    }
}
