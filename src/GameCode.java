import java.util.ArrayList;
import java.util.Scanner;

public class GameCode {

    public static ArrayList<String> gameList = new ArrayList<>();

    public static void MatchHistory(){

        System.out.println("_______________");
        System.out.println("Match historik:");

        //Skrivs ut om array listan är tom.
        if(gameList.isEmpty()){
            System.out.println("Inga matcher spelade ännu!");
        }

        //Skriver ut lista med match historik.
        for (String i : gameList) {
            System.out.println(i);
        }
        System.out.println("_______________");
    }

    public static void PlayerMenu(){

            try {
                //Spelarens val meny.
                System.out.println("____________________________________________");
                System.out.println("|              Vad väljer du?              |");
                System.out.println("|                  1.Sten                  |");
                System.out.println("|                  2.Sax                   |");
                System.out.println("|                  3.Påse                  |");
                System.out.println("|                  4.Huvud meny            |");
                System.out.println("|__________________________________________|");
                System.out.print("Ange val: ");

                //Spelarens input.
                Scanner scan = new Scanner(System.in);
                int val = scan.nextInt();

                //Datorn väljer en random från 1 till 3 (Sten, Sax eller Påse).
                int random = (int) (Math.random() * 3);

                //Skickar ett String till array listan om man har vunnit, förlorat eller att det blev oavgjort.
                if (val == 1 && random == 0 || val == 2 && random == 1 || val == 3 && random == 2) {
                    gameList.add("Oavgjort");
                } else if (val == 1 && random == 1 || val == 2 && random == 2 || val == 3 && random == 0) {
                    gameList.add("Vann");
                } else if (val == 1 && random == 2 || val == 2 && random == 0 || val == 3 && random == 1) {
                    gameList.add("Förlorade");
                }

                switch (val) {

                        /*Skriver ut om man vunnit, förlorat eller att det blev lika
                        efter man har valt antingen sten, sax eller påse.
                        Och skriver sedan ut afterMatch menyn.
                         */

                    case 1: //Sten.

                        if (random == 0) {
                            System.out.println("__________________");
                            System.out.println("Det blev oavgjort.");
                            System.out.println("✊ >< ✊");
                            System.out.println("__________________");
                            AfterMatchMenu.afterMatch();
                        } else if (random == 1) {
                            System.out.println("________________");
                            System.out.println("Grattis du vann!");
                            System.out.println("✊ -> ✌");
                            System.out.println("________________");
                            AfterMatchMenu.afterMatch();
                        } else if (random == 2) {
                            System.out.println("_____________");
                            System.out.println("du förlorade!");
                            System.out.println("✋ <- ✊");
                            System.out.println("_____________");
                            AfterMatchMenu.afterMatch();
                        }
                        break;

                    case 2: //Sax.

                        if (random == 1) {
                            System.out.println("__________________");
                            System.out.println("Det blev oavgjort.");
                            System.out.println("✌ >< ✌");
                            System.out.println("__________________");
                            AfterMatchMenu.afterMatch();
                        } else if (random == 2) {
                            System.out.println("________________");
                            System.out.println("Grattis du vann!");
                            System.out.println("✌ -> ✋");
                            System.out.println("________________");
                            AfterMatchMenu.afterMatch();
                        } else if (random == 0) {
                            System.out.println("_____________");
                            System.out.println("du förlorade!");
                            System.out.println("✌ <- ✊");
                            System.out.println("_____________");
                            AfterMatchMenu.afterMatch();
                        }
                        break;

                    case 3: //Påse.

                        if (random == 2) {
                            System.out.println("__________________");
                            System.out.println("Det blev oavgjort.");
                            System.out.println("✋ >< ✋");
                            System.out.println("__________________");
                            AfterMatchMenu.afterMatch();
                        } else if (random == 0) {
                            System.out.println("________________");
                            System.out.println("Grattis du vann!");
                            System.out.println("✋ -> ✊");
                            System.out.println("________________");
                            AfterMatchMenu.afterMatch();
                        } else if (random == 1) {
                            System.out.println("_____________");
                            System.out.println("du förlorade!");
                            System.out.println("✋ <- ✌");
                            System.out.println("_____________");
                            AfterMatchMenu.afterMatch();
                        }
                        break;

                    case 4: //Skriver ut huvud menyn när man väljer 4.
                        MainMenu.Game();
                        break;

                    default: //Error ges om ett annat siffra ges.
                        System.out.println("ERROR " + val + " finns inte!");
                        GameCode.PlayerMenu();
                        break;
                }
            }
            //Error om något annat än en siffra anges.
            catch (Exception e) {
                System.out.println("ERROR var snäll och ange rätt värde.");
                GameCode.PlayerMenu();
            }
    }
}
