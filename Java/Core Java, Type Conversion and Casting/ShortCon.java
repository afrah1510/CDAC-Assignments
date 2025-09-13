public class ShortCon {
    public static void main(String[] args) {
        Short shortIns = 15;

        // Byte
        byte byteVar = shortIns.byteValue();
        System.out.println("Short Instance to Byte: " + byteVar);

        // Short Instance to Short
        short shortInsToShort = shortIns.shortValue();
        System.out.println("Short Instance to Short: " + shortInsToShort);

        // Int
        int shortInsToInt = shortIns.intValue();
        System.out.println("Short Instance to Int: " + shortInsToInt);

        // Long
        long shortInsToLong = shortIns.longValue();
        System.out.println("Short Instance to Long: " + shortInsToLong);

        // Float
        float shortInsToFloat = shortIns.floatValue();
        System.out.println("Short Instance to Float: " + shortInsToFloat);

        // Double
        double shortInsToDouble = shortIns.doubleValue();
        System.out.println("Short Instance to Double: " + shortInsToDouble);
    }
}
