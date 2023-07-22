import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое сообщение: ");
        String message1 = scanner.next();
        Textmassage textMessage1 = new Textmassage(message1);

        System.out.print("Введите второе сообщение: ");
        String message2 = scanner.next();
        Textmassage textMessage2 = new Textmassage(message2);

        System.out.print("Введите третье сообщение: ");
        String message3 = scanner.next();

        Textmassage textMessage3 = new Textmassage(message3);

    }
}