public class DoubleDesc {
    public static void main(String[] args) {
        // a.
        double bitSize = Double.SIZE;
        System.out.println("Number of bits used to represent double value: " + bitSize);

        // b.
        double byteSize = Double.BYTES;
        System.out.println("Number of bytes used to represent double value: " + byteSize);

        // c.
        double minValue = Double.MIN_VALUE;
        System.out.println("Minimum value of a double: " + minValue);

        // d.
        double maxValue = Double.MAX_VALUE;
        System.out.println("Maximum value of a double: " + maxValue);
    }
}
