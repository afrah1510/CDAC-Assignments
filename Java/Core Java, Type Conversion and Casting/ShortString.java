public class ShortString {
    public static void main(String[] args) {
        short shortVar = 12;

        // a.
        String shortToString = Short.toString(shortVar);
        System.out.println("Short to String: " + shortToString);

        // b.
        Short shortIns = Short.valueOf(shortVar);
        System.out.println("Short to Short Instance: " + shortIns);

        // c.
        String str = "20";
        Short stringToShortIns = Short.valueOf(str);
        System.out.println("String Instance to Short Instance: " + stringToShortIns);
    }
}
