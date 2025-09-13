public class ArithmeticOp {
    public static void main(String[] args) {
        int intVal = Integer.parseInt(args[0]);
        float floatVal = Float.parseFloat(args[1]);
        double doubleVal = Double.parseDouble(args[2]);
        String operation = args[3].trim();

        switch (operation) {
            case "+":
                System.out.println("Addition: " + (intVal + floatVal + doubleVal));
                break;
            case "-":
                System.out.println("Subtraction: " + (intVal - floatVal - doubleVal));
                break;
            case "x":
                System.out.println("Multiplication: " + (intVal * floatVal * doubleVal));
                break;
            case "/":
                if (floatVal != 0 && doubleVal != 0) {
                    System.out.println("Result (Division): " + ((intVal / floatVal) / doubleVal));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Use +, -, *, or /.");
        }
    }
}