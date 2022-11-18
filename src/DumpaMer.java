import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class DumpaMer {
    Scanner scanner = new Scanner(System.in);

    String fordonsModell;
    int fordonsVikt;
    String lastBrygga;
    int makeChoises;
    int avLastBryggaA = 0;
    int avLastBryggaB = 0;
    int avLastBryggaC = 0;
    int avLastBryggaD = 0;
    int avlastBryggaE = 0;
    List<parkeradFordon> parkeradFordonInfoList = new ArrayList<>();


    public void choise() {
        while (makeChoises != 3) {
            out.println("Välkommen till Dumpa mer!\n" +
                    "~~~~~~~~~~~~~~~~~~~~~~~~~    \n" +
                    "Välj i menyn:                \n" +
                    "1. Se parkerade fordon       \n" +
                    "2. Registra nytt fordon.     \n" +
                    "3. Exit  ");
            makeChoises = scanner.nextInt();

            switch (makeChoises) {

                case 1 -> {
                    if (parkeradFordonInfoList.size() == 0) {}
                    parkeringsLista();
                }
                case 2 -> {
                    out.println("Dina Val: \n" + "1. Van  \n" + "2. Lätt lastbil \n" + "3. Tung lastbil \n");
                    Scanner options = new Scanner(System.in);
                    fordonsModell = options.nextLine();
                    if (fordonsModell.equals("1")) {
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
                    String[] lastBryggaPlats = {"lastBrygga A",
                            "lastBrygga B",
                            "lastBrygga C",
                            "lastBrygga D",
                            "lastBrygga E"};

                    if ((fordonsModell.equals("Van") && avLastBryggaA <1) || (fordonsModell.equals("Lätt lastbil") && fordonsVikt < 5000)) {
                        lastBrygga = lastBryggaPlats[0];
                        avLastBryggaA++;
                        out.println("Du kan parkera på " + lastBrygga);


                    } else if (fordonsModell.equals("Van") && avLastBryggaB <1) {
                        lastBrygga = lastBryggaPlats[1];
                        avLastBryggaB++;
                        out.println("Du parkerar på " + lastBrygga);


                    } else if (fordonsModell.equals("Lätt lastbil") && avLastBryggaC <1) {
                        lastBrygga = lastBryggaPlats[2];
                        avLastBryggaC++;
                        out.println("Du parkerar på " + lastBrygga);

                    } else if (fordonsModell.equals("Lätt lastbil") && avLastBryggaD <1) {
                        lastBrygga = lastBryggaPlats[3];
                        avLastBryggaD++;
                        out.println("Du kan parkerar på " + lastBrygga);

                    } else if ((fordonsModell.equals("Lätt last bil") && avLastBryggaD <1) || (fordonsModell.equals("Tung last") && fordonsVikt < 9000)) {
                        lastBrygga = lastBryggaPlats[3];
                        avLastBryggaD++;
                        out.println("Du kan parkerar på " + lastBrygga);

                    } else if (fordonsModell.equals("Tung Lasbil") && avlastBryggaE <1) {
                        lastBrygga = lastBryggaPlats[4];
                        avlastBryggaE++;
                        out.println("Du parkerar på " + lastBrygga);

                    } else {
                        out.println("Det är fullt,tack och hej leverpastej");
                    }
                    parkeradFordon parkedTruckInfo = new parkeradFordon(fordonsModell, lastBrygga, fordonsVikt);
                    parkeradFordonInfoList.add(parkedTruckInfo);


                }

                case 3 -> {
                    System.out.println("Du lämnar nu Dumpa mer. ");//Programmet avslutas

                }
            }

        }

    }

    public void parkeringsLista() {
        for (parkeradFordon parkeradFordonInfo : parkeradFordonInfoList) {
            System.out.println(parkeradFordonInfo);


        }
    }

}

