public class CharDesc {
    public static void main(String[] args) {
        // a.
        int bitSize = Character.SIZE;
        System.out.println("Number of bits used to represent char value: " + bitSize);

        // b.
        int byteSize = Character.BYTES;
        System.out.println("Number of bytes used to represent char value: " + byteSize);

        // c.
        int minValue = Character.MIN_VALUE;
        System.out.println("Minimum value of a character: " + minValue);

        // d.
        int maxValue = Character.MAX_VALUE;
        System.out.println("Maximum value of a character: " + maxValue);
    }
}
