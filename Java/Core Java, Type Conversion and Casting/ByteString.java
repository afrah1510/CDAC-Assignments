public class ByteString {
    public static void main(String[] args) {
        byte byteVar = 12;

        // a.
        String byteToString = Byte.toString(byteVar);
        System.out.println("Byte to String: " + byteToString);

        // b.
        Byte byteIns = Byte.valueOf(byteVar);
        System.out.println("Byte to Byte Instance: " + byteIns);

        // c.
        String str = "20";
        Byte stringToByteIns = Byte.valueOf(str);
        System.out.println("String Instance to Byte Instance: " + stringToByteIns);
    }
}
