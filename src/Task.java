import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int size = string.length();
        String first = string.substring(0, 1);
        String last = string.substring(size -1, size);

        System.out.println(first);
        System.out.println(last);

        String result = first + last;
        System.out.println(result);

        result = result.repeat(5);

        System.out.println(result);

        result = result.replace("a", "b");

        System.out.println(result);

        result = result.substring(result.length() - 5);

        System.out.println(result);

        char symbol = result.charAt(2);
        System.out.println(symbol);
    }

    // 1.
    // 



}
