public class ShortDesc {
    public static void main(String[] args) {
        // a.
        int bitSize = Short.SIZE;
        System.out.println("Number of bits used to represent short value: " + bitSize);

        // b.
        int byteSize = Short.BYTES;
        System.out.println("Number of bytes used to represent short value: " + byteSize);

        // c.
        int minValue = Short.MIN_VALUE;
        System.out.println("Minimum value of a short: " + minValue);

        // d.
        int maxValue = Short.MAX_VALUE;
        System.out.println("Maximum value of a short: " + maxValue);
    }
}
