import java.util.Scanner;

public class challange5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;

        System.out.println("Type h to say Hello, anything else to stop:");
        answer = input.next();

        while (answer.equals("h")) {
            System.out.println("Hello");
            answer = input.next();
        }

        System.out.println("Goodbye!");
    }
}
