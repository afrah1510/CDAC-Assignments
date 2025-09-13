public class LongDesc {
    public static void main(String[] args) {
        // a.
        long bitSize = Long.SIZE;
        System.out.println("Number of bits used to represent long value: " + bitSize);

        // b.
        long byteSize = Long.BYTES;
        System.out.println("Number of bytes used to represent long value: " + byteSize);

        // c.
        long minValue = Long.MIN_VALUE;
        System.out.println("Minimum value of a long: " + minValue);

        // d.
        long maxValue = Long.MAX_VALUE;
        System.out.println("Maximum value of a long: " + maxValue);
    }
}
