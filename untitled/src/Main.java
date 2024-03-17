// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

             {

                System.out.println("Podaj liczbę:");
                Scanner scanner = new Scanner(System.in);
                int liczba = scanner.nextInt();

                if (liczba > 0) {
                    System.out.println("number: " + liczba + " The number is positive" );
                }
                else if (liczba < 0) {
                    System.out.println("number: " + liczba + " The number is negative" );
                }
                else {System.out.println("The value equals 0");}

        }
    }
}