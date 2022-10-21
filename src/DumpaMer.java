import java.util.Scanner; //Det blev inte mycket. Har verklgen lagt ned mycket tid. Men dom projekten som jag hade föreställt mig att
                          //jag skulle lämnat in som uppgift blev helt enkelt inte bra. Men jag har lärt mig en hel del under tiden.
                          //På något kostigt sätt är det väldigt roligt trots att jag blir galen av alla fel jag gör.
                          //Antar att det är någon slags självplågeri :)

import static java.lang.System.out;

public class DumpaMer {
    Scanner scanner = new Scanner(System.in);

    String fordonsModell;
    int fordonsVikt;
    String lastBrygga;
    int makeChoises;
    int avLastBryggaA = 0;//tilldeling int, dom olika avlastningsplatserna
    int avLastBryggaB = 0;
    int avLastBryggaC = 0;
    int avLastBryggaD = 0;
    int avlastBryggaE = 0;


    public void choise() {
        while (makeChoises != 3) {
            out.println("Välkommen till Dumpa mer!\n" + //meny som visas när använvaden anländer till stationen
                    "~~~~~~~~~~~~~~~~~~~~~~~~~    \n" +
                    "Välj i menyn:                \n" +
                    "1. Se parkerade fordon       \n" +
                    "2. Registra nytt fordon.     \n" +
                    "3.  Exit  ");
            makeChoises = scanner.nextInt();

            switch (makeChoises) { //Switch till att välja i huvudmenyn. If else till valen av vikt, registrering osv

                case 1 -> parkeringsLista(); //listan som lagrar fordonen
                case 2 -> {
                    out.println("Dina Val: \n" + "1. Van  \n" + "2. Lätt lastbil \n" + "3. Tung lastbil \n");
                    Scanner options = new Scanner(System.in);
                    fordonsModell = options.nextLine();
                    if (fordonsModell.equals("1")) { //fordonsmodellerna tilldelas med equals
                        fordonsModell = "Van";
                    }
                    if (fordonsModell.equals("2")) {
                        fordonsModell = "Lätt lastbil";
                    }
                    if (fordonsModell.equals("3")) {
                        fordonsModell = "Tung Lastbil";
                    }
                    out.println("Ange vikt");
                    fordonsVikt = 0;
                    fordonsVikt = options.nextInt();
                    out.println("Den angivna vikten är" + fordonsVikt);
                    String[] lastBryggaPlats = {"lastBrygga A",//dom olika kajplatserna där fordonen lastar av.
                                                "lastBrygga B",
                                                "lastBrygga C",
                                                "lastBrygga D",
                                                "lastBrygga E"};
                    if ((fordonsModell.equals("Van") && avLastBryggaA <= 4) || (fordonsModell.equals("Lätt lastbil") && fordonsVikt < 5000)) {
                        lastBrygga = lastBryggaPlats[0]; //utgångsvärde av lastbryggorna 0
                        avLastBryggaA++;
                        out.println("Du kan parkera på " + lastBrygga);

                    } else if (fordonsModell.equals("Van") && avLastBryggaA > 4 && avLastBryggaB <= 4) {
                        lastBrygga = lastBryggaPlats[1];
                        avLastBryggaB++;
                        out.println("Du parkerar på " + lastBrygga);

                    } else if (fordonsModell.equals("Lätt lastbil") && avLastBryggaC <= 4) {
                        lastBrygga = lastBryggaPlats[2];
                        avLastBryggaC++;
                        out.println("Du parkerar på " + lastBrygga);

                    } else if (fordonsModell.equals("Lätt lastbil")&& avLastBryggaC > 4 && avLastBryggaD <= 4) {
                        lastBrygga = lastBryggaPlats[3];
                        avLastBryggaD++;
                        out.println("Du kan parkerar på " + lastBrygga);

                    } else if ((fordonsModell.equals("Lätt last bil") && avLastBryggaD <= 4) || (fordonsModell.equals("Tung last") && fordonsVikt < 9000)) {
                        lastBrygga = lastBryggaPlats[3];
                        avLastBryggaD++;
                        out.println("Du kan parkerar på " + lastBrygga);

                    } else if (fordonsModell.equals("Tung Lasbil") && avlastBryggaE >= 4) {
                        lastBrygga = lastBryggaPlats[4];
                        avlastBryggaE++;
                        out.println("Du parkerar på " + lastBrygga);

                    } else {
                        out.println("Det är fullt,tack och hej leverpastej");
                    }
                    parkeradFordon parkeradeFordonInfo = new parkeradFordon(fordonsModell, lastBrygga, fordonsVikt);
                }

                case 3 -> System.out.println("Du lämnar nu Dumpa mer. ");//Programmet avslutas
            }

        }

    }

    public void parkeringsLista() {


    }
}


