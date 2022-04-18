import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        int hrs = new Date().getHours();

        if (args.length == 0 || args[0].isEmpty()) {
            System.out.println("invalid input ");
        } else {
//            System.out.println("hrs == "+hrs);
            if (hrs >= 4 && hrs <= 11) {
                System.out.println("Good morning " + args[0]);
            } else if (hrs > 11 && hrs <= 16) {
                System.out.println("Good Afternoon " + args[0]);
            } else if (hrs > 16 && hrs <= 19) {
                System.out.println("Good Evening " + args[0]);
            } else {
                System.out.println("Good Night " + args[0]);
            }
        }
    }
}
