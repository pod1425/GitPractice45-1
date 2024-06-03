import java.util.Scanner;

public class EqualsExample {

    public static void main(String[] args) {
        //pala securizata
        //se intreaba parola, si daca se potriveste, atunci se scrie inform pe ecran

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String correctPassword = "qwerty";
        if (password.equals(correctPassword)) {
            System.out.println("Dostup razreson");
        }


    }
}
