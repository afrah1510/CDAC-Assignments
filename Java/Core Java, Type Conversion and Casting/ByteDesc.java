public class ByteDesc {
    public static void main(String[] args) {
        // a.
        byte bitSize = Byte.SIZE;
        System.out.println("Number of bits used to represent byte value: " + bitSize);

        // b.
        byte byteSize = Byte.BYTES;
        System.out.println("Number of bytes used to represent byte value: " + byteSize);

        // c.
        byte minValue = Byte.MIN_VALUE;
        System.out.println("Minimum value of a byte: " + minValue);

        // d.
        byte maxValue = Byte.MAX_VALUE;
        System.out.println("Maximum value of a byte: " + maxValue);

    }
}
