public class HelloApp {
    public static void main(String[] args) {

        String message;

        // Check if no arguments are passed
        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            // Join names with comma and space
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        }

        // Print result
        System.out.println(message);
    }
}