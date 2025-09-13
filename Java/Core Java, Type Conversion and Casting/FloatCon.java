public class FloatCon {
    public static void main(String[] args) {
        Float floatIns = 152604578f;

        // Byte
        byte byteVar = floatIns.byteValue();
        System.out.println("Float Instance to Byte: " + byteVar);

        // Short
        short floatInsToShort = floatIns.shortValue();
        System.out.println("Float Instance to Short: " + floatInsToShort);

        // Int
        int floatInsToInt = floatIns.intValue();
        System.out.println("Float Instance to Int: " + floatInsToInt);

        // Long
        long floatInsToLong = floatIns.longValue();
        System.out.println("Float Instance to Long: " + floatInsToLong);

        // Float Instance to Float
        float floatInsToFloat = floatIns.floatValue();
        System.out.println("Float Instance to Float: " + floatInsToFloat);

        // Double
        double floatInsToDouble = floatIns.doubleValue();
        System.out.println("Float Instance to Double: " + floatInsToDouble);
    }
}
