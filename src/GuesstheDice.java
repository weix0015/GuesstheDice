import java.util.Random;
import java.util.Scanner;

public class GuesstheDice {
    public static void main(String[] args) {

        Random ran= new Random();
        Scanner sc = new Scanner(System.in);
        String gæt;
        int number;
        String lige;
        String ulig;

        System.out.println("Gæt om du tror det er lige eller ulig ");
        gæt = sc.nextLine();
        number = ran.nextInt(6) + 1;
        System.out.println("Svaret er: " + number + " ");

        if (gæt.equals("lige")) {

            if (number == 2 || number == 4 || number == 6) {
                System.out.println("Dette er: " + number + " er korrekt");
            }
            else if (number == 1 || number == 3 || number == 5) {
                System.out.println("Your Guess " + gæt + " er forkert");
            }
        }
        else if (gæt.equals("ulig")) {
            if (number == 1 || number == 3 || number == 5) {
                System.out.println("Your Guess " + gæt + " er korrekt");
            } else if (number == 2 || number == 4 || number == 6) {
                System.out.println("Your Guess " + gæt + " er forkert");
            }
        }
                else {
                System.out.println("forstår ikke");
            }

        }

    }