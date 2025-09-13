public class IntString {
    public static void main(String[] args) {
        int intVar = 12650;

        // a.
        String intToString = Integer.toString(intVar);
        System.out.println("Int to String: " + intToString);

        // b.
        Integer shortIns = Integer.valueOf(intVar);
        System.out.println("Int to Int Instance: " + shortIns);

        // c.
        String str = "200";
        Integer stringToIntIns = Integer.valueOf(str);
        System.out.println("String Instance to Int Instance: " + stringToIntIns);

        // d.
        String binString = Integer.toBinaryString(intVar);
        System.out.println("Int to Binary String: " + binString);
        String octalString = Integer.toOctalString(intVar);
        System.out.println("Int to Octal String: " + octalString);
        String hexString = Integer.toHexString(intVar);
        System.out.println("Int to Hexadecimal String: " + hexString);
    }
}
