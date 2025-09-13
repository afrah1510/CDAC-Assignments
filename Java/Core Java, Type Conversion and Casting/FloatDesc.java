public class FloatDesc {
    public static void main(String[] args) {
        // a.
        float bitSize = Float.SIZE;
        System.out.println("Number of bits used to represent float value: " + bitSize);

        // b.
        float byteSize = Float.BYTES;
        System.out.println("Number of bytes used to represent float value: " + byteSize);

        // c.
        float minValue = Float.MIN_VALUE;
        System.out.println("Minimum value of a float: " + minValue);

        // d.
        float maxValue = Float.MAX_VALUE;
        System.out.println("Maximum value of a float: " + maxValue);
    }
}
