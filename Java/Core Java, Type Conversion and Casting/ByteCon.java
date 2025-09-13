public class ByteCon {
    public static void main(String[] args) {
        Byte byteIns = 15;

        // Byte Instance to byte
        byte byteVar = Byte.valueOf(byteIns);
        System.out.println("Byte Instance to Byte: " + byteVar);

        // Short
        short byteInsToShort = byteIns.shortValue();
        System.out.println("Byte Instance to Short: " + byteInsToShort);

        // Int
        int byteInsToInt = byteIns.intValue();
        System.out.println("Byte Instance to Int: " + byteInsToInt);

        // Long
        long byteInsToLong = byteIns.longValue();
        System.out.println("Byte Instance to Long: " + byteInsToLong);

        // Float
        float byteInsToFloat = byteIns.floatValue();
        System.out.println("Byte Instance to Float: " + byteInsToFloat);

        // Byte to Double
        double byteInsToDouble = byteIns.doubleValue();
        System.out.println("Byte Instance to Double: " + byteInsToDouble);
    }
}
