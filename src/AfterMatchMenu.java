import java.util.Scanner;

public class AfterMatchMenu {

    public static void afterMatch(){

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
                int val = scan.nextInt();

                switch (val) {

                    case 1: //Skriver ut PlayerMenu metoden i GameCode klassen.
                        GameCode.PlayerMenu();
                        break;

                    case 2: //Skriver ut Game metoden i MainMenu klassen.
                        MainMenu.Game();
                        break;

                    case 3: //Stänger av spelet.
                        System.out.println("Tack för att du spelade!");
                        System.exit(0);
                        break;

                    //Error ges om ett annat siffra ges.
                    default:
                        System.out.println("ERROR " + val + " finns inte!");
                        AfterMatchMenu.afterMatch();
                        break;
                }
            }
            //Error om något annat än en siffra anges.
            catch (Exception e) {
                System.out.println("ERROR var snäll och ange rätt värde.");
                AfterMatchMenu.afterMatch();
            }
    }
}
