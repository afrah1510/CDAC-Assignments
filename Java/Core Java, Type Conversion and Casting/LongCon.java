public class LongCon {
    public static void main(String[] args) {
        Long longIns = 152604578l;

        // Byte
        byte byteVar = longIns.byteValue();
        System.out.println("Long Instance to Byte: " + byteVar);

        // Short
        short longInsToShort = longIns.shortValue();
        System.out.println("Long Instance to Short: " + longInsToShort);

        // Int
        int longInsToInt = longIns.intValue();
        System.out.println("Long Instance to Int: " + longInsToInt);

        // Long Instance to Long
        long longInsToLong = longIns.longValue();
        System.out.println("Long Instance to Long: " + longInsToLong);

        // Float
        float longInsToFloat = longIns.floatValue();
        System.out.println("Long Instance to Float: " + longInsToFloat);

        // Double
        double longInsToDouble = longIns.doubleValue();
        System.out.println("Long Instance to Double: " + longInsToDouble);
    }
}
