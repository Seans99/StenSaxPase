import java.util.Scanner;

public class MainMenu {

    public void game() {

    boolean runGame = true;
        while(runGame) {
            try {
                //Huvud Meny.
                System.out.println("____________________________________________");
                System.out.println("|              STEN SAX PÅSE               |");
                System.out.println("|               ✊    ✌   ✋                |");
                System.out.println("|__________________________________________|");
                System.out.println("|                1.Ny Match                |");
                System.out.println("|                2.Historik                |");
                System.out.println("|                3.Avsluta                 |");
                System.out.println("|__________________________________________|");
                System.out.print("Ange val: ");

                    //Spelarens input.
                    Scanner scan = new Scanner(System.in);
                    int input = scan.nextInt();

                    //Objekt för klassen GameCode.
                    GameCode gamecode = new GameCode();

                switch (input) {

                    case 1: //Skriver ut PlayerMenu metoden i GameCode klassen.
                        gamecode.playerMenu();
                        break;

                    case 2: //Skriver ut MatchHistory metoden i GameCode klassen.
                        gamecode.matchHistory();
                        break;

                    case 3: //Avsluta spel.
                        System.out.println("Tack för att du spelade!!!");
                        runGame = false;
                        System.exit(0);
                        break;

                    //Error om ett annat siffra ges.
                    default:
                        System.out.println("ERROR " + input + " finns inte!");
                        break;
                }
            }
            //Error om något annat än en siffra anges.
            catch (Exception e) {
                System.out.println("ERROR var snäll och ange rätt värde.");
            }
        }
    }

    public static void main(String[] args) {

        //Skriver ut Game metoden.
        MainMenu mainmenu = new MainMenu();
        mainmenu.game();

    }
}
