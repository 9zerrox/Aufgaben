import java.util.Scanner;

public class VierGewinnt {
    Boolean winner;
    Boolean loser;
    Boolean state;
    Scanner readIn = new Scanner(System.in);


    public static void main(String[] args) {
        welcomePlayer();
        result();
    }

    public static void result(boolean winner, boolean loser)
        {
        if (winner) {
            System.out.println("Herrzlichen Glückwunsch, du hast gewonnen!");
        }
        else if (loser) {
            System.out.println("Schade, vielleicht beim nächsten mal!");
        }
        else {
            System.out.println("Es scheint sich um ein unentschieden zu handeln.");
        }
    }

    public void welcomePlayer(){
        while (state)
        {
            System.out.println("Willkommen bei 4Gewinnt, (yes) um fortzufahren.");
            String input = readIn.nextLine();
            if (input == "yes") {
                state = false;
            } else if (input == "Yes") {
                state = false;
            }
        }
        System.out.println("Bitte gebe deine Daten an: ");

    }

    public static void registration(){
        String username = "";
        String password = "";

        
    }



}
