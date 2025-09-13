public class IntDesc {
    public static void main(String[] args) {
        // a.
        int bitSize = Integer.SIZE;
        System.out.println("Number of bits used to represent integer value: " + bitSize);

        // b.
        int byteSize = Integer.BYTES;
        System.out.println("Number of bytes used to represent integer value: " + byteSize);

        // c.
        int minValue = Integer.MIN_VALUE;
        System.out.println("Minimum value of a integer: " + minValue);

        // d.
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Maximum value of a integer: " + maxValue);
    }
}
