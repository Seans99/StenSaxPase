import java.util.Scanner;

public class AfterMatchMenu {

    public void afterMatch() {

        //Objekt för alla klasser.
        GameCode gamecode = new GameCode();
        MainMenu mainmenu = new MainMenu();
        AfterMatchMenu menu = new AfterMatchMenu();

            try {
                //After match meny.
                System.out.println("____________________________________________");
                System.out.println("|              Vad vill du göra?           |");
                System.out.println("|                 1.Försök igen            |");
                System.out.println("|                 2.Main meny              |");
                System.out.println("|                 3.Avsluta spel           |");
                System.out.println("|__________________________________________|");
                System.out.print("Ange val: ");

                //Spelarens input
                Scanner scan = new Scanner(System.in);
                int input = scan.nextInt();

                switch (input) {

                    case 1: //Skriver ut PlayerMenu metoden i GameCode klassen.

                        gamecode.playerMenu();
                        break;

                    case 2: //Skriver ut Game metoden i MainMenu klassen.

                        mainmenu.game();
                        break;

                    case 3: //Stänger av spelet.
                        System.out.println("Tack för att du spelade!");
                        System.exit(0);
                        break;

                    //Error ges om ett annat siffra ges.
                    default:
                        System.out.println("ERROR " + input + " finns inte!");

                        menu.afterMatch();
                        break;
                }
            }
            //Error om något annat än en siffra anges.
            catch (Exception e) {
                System.out.println("ERROR var snäll och ange rätt värde.");
                menu.afterMatch();
            }
    }
}
