public class ConvertBooleanString {
    public static void main(String[] args) {
        boolean booleanVar = true;

        // a.
        String stringCon = Boolean.toString(booleanVar);
        System.out.println("Boolean to String: " + stringCon);

        // b.
        Boolean booleanIns = Boolean.valueOf(booleanVar);
        System.out.println("Boolean to Boolean Instance: " + booleanIns);

        String stringVar = "abc";

        // c.
        Boolean boolCon = Boolean.parseBoolean(stringVar);
        System.out.println("String to Boolean: " + boolCon);

        // d.
        Boolean boolIns = Boolean.valueOf(stringVar);
        System.out.println("String to Boolean Instance: " + boolIns);
    }
}
