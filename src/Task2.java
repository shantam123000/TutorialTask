public class Task2 {

    public static void main(String[] args) {

        if (args.length == 0 || args[0].isEmpty()) {
            System.out.println("invalid input ");
        } else {
            String input = args[0];
            for (int i = 1; i <= input.length(); i++) {
                System.out.println(input.substring(0, i));
            }
        }
    }
}
