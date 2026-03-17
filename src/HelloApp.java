public class HelloApp {

    public static void main(String[] args) {

        // Check if command-line argument exists
        String name;

        if (args.length > 0) {
            name = args[0];   // use the provided name
        } else {
            name = "World";   // default value
        }

        // Display greeting
        System.out.println("Hello, " + name + "!");
    }
}
