import java.util.ArrayList;
import java.util.Scanner;

public class GameCode {

    //Static gör så att den här klassen äger array listan,
    // och jag kan med static använda array listan i dem andra klasser.
    static ArrayList<String> matchList = new ArrayList<>();

    public void matchHistory(){

        System.out.println("_______________");
        System.out.println("Match historik:");

        //Skrivs ut om array listan är tom.
        if(matchList.isEmpty()){
            System.out.println("Inga matcher spelade ännu!");
        }

        //Skriver ut lista med match historik.
        for (String i : matchList) {
            System.out.println(i);
        }
        System.out.println("_______________");
    }

    public void playerMenu(){

        //Objekt för alla klasser.
        GameCode gamecode = new GameCode();
        MainMenu mainmenu = new MainMenu();
        AfterMatchMenu menu = new AfterMatchMenu();

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
                int input = scan.nextInt();

                //Datorn väljer en random från 1 till 3 (Sten, Sax eller Påse).
                int random = (int) (Math.random() * 3);

                //Skickar ett String till array listan om man har vunnit, förlorat eller att det blev oavgjort.
                if (input == 1 && random == 0 || input == 2 && random == 1 || input == 3 && random == 2) {
                    matchList.add("Oavgjort");
                } else if (input == 1 && random == 1 || input == 2 && random == 2 || input == 3 && random == 0) {
                    matchList.add("Vann");
                } else if (input == 1 && random == 2 || input == 2 && random == 0 || input == 3 && random == 1) {
                    matchList.add("Förlorade");
                }

                switch (input) {

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
                            menu.afterMatch();
                        } else if (random == 1) {
                            System.out.println("________________");
                            System.out.println("Grattis du vann!");
                            System.out.println("✊ -> ✌");
                            System.out.println("________________");
                            menu.afterMatch();
                        } else if (random == 2) {
                            System.out.println("_____________");
                            System.out.println("du förlorade!");
                            System.out.println("✋ <- ✊");
                            System.out.println("_____________");
                            menu.afterMatch();
                        }
                        break;

                    case 2: //Sax.
                        if (random == 1) {
                            System.out.println("__________________");
                            System.out.println("Det blev oavgjort.");
                            System.out.println("✌ >< ✌");
                            System.out.println("__________________");
                            menu.afterMatch();
                        } else if (random == 2) {
                            System.out.println("________________");
                            System.out.println("Grattis du vann!");
                            System.out.println("✌ -> ✋");
                            System.out.println("________________");
                            menu.afterMatch();
                        } else if (random == 0) {
                            System.out.println("_____________");
                            System.out.println("du förlorade!");
                            System.out.println("✌ <- ✊");
                            System.out.println("_____________");
                            menu.afterMatch();
                        }
                        break;

                    case 3: //Påse.
                        if (random == 2) {
                            System.out.println("__________________");
                            System.out.println("Det blev oavgjort.");
                            System.out.println("✋ >< ✋");
                            System.out.println("__________________");
                            menu.afterMatch();
                        } else if (random == 0) {
                            System.out.println("________________");
                            System.out.println("Grattis du vann!");
                            System.out.println("✋ -> ✊");
                            System.out.println("________________");
                            menu.afterMatch();
                        } else if (random == 1) {
                            System.out.println("_____________");
                            System.out.println("du förlorade!");
                            System.out.println("✋ <- ✌");
                            System.out.println("_____________");
                            menu.afterMatch();
                        }
                        break;

                    case 4: //Skriver ut huvud menyn när man väljer 4.
                        mainmenu.game();
                        break;

                    default: //Error ges om ett annat siffra ges.
                        System.out.println("ERROR " + input + " finns inte!");
                        gamecode.playerMenu();
                        break;
                }
            }
            //Error om något annat än en siffra anges.
            catch (Exception e) {
                System.out.println("ERROR var snäll och ange rätt värde.");
                gamecode.playerMenu();
            }
    }
}
