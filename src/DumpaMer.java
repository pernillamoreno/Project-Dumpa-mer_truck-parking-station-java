import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class DumpaMer {
    List<parkeradFordon> parkeradFordonInfoList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    int makeChoises;

    int avLastBryggaA=0;
    int avLastBryggaB=0;
    int avLastBryggaC=0;
    int avLastBryggaD=0;
    int avlastBryggaE=0;

    private String fordonsModell;
    private String lastBrygga;


    public void choise() {
        while (makeChoises != 3) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~ \n"+
                    "Välkommen till Dumpa mer!\n" +
                    "~~~~~~~~~~~~~~~~~~~~~~~~~    \n" +
                    "Välj i menyn:                \n" +
                    "1. Se parkerade fordon       \n" +
                    "2. Registra nytt fordon.     \n" +
                    "3. Exit  ");
            makeChoises = scanner.nextInt();

            switch (makeChoises) {
                case 1 -> {
                    parkeringsLista();
                }
                case 2 -> {
                    System.out.println("""
                            Dina Val:\s
                            1. Van \s
                            2. Lätt Lastbil\s
                            3. Tung Lastbil\s
                            """);
                    Scanner options = new Scanner(System.in);
                    fordonsModell = options.nextLine();
                    if (fordonsModell.equals("1")) {
                        fordonsModell = "Van";
                    }
                    if (fordonsModell.equals("2")) {
                        fordonsModell = "Lätt Lastbil";
                    }
                    if (fordonsModell.equals("3")) {
                        fordonsModell = "Tung Lastbil";
                    }
                    System.out.println("Ange vikt på fordonsModell");
                    //int fordonsVikt;
                    int fordonsVikt = options.nextInt();



                    String[] lastBryggaPlats =
                            {"lastBrygga A",
                                    "lastBrygga B",
                                    "lastBrygga C",
                                    "lastBrygga D",
                                    "lastBrygga E"};


                    if ((fordonsModell.equals("Van") && avLastBryggaA <1) || ((fordonsModell.equals("Lätt Lastbil") && avLastBryggaA <1) && fordonsVikt < 5000)) {
                        lastBrygga = lastBryggaPlats[0];
                        avLastBryggaA++;
                        System.out.println("Du kan parkera på " + lastBrygga);

                    } else if (fordonsModell.equals("Van") && avLastBryggaB <1) {
                        lastBrygga = lastBryggaPlats[1];
                        avLastBryggaB++;
                        System.out.println("Du parkerar på " + lastBrygga);

                    } else if (fordonsModell.equals("Lätt Lastbil") && avLastBryggaC <1) {
                        lastBrygga = lastBryggaPlats[2];
                        avLastBryggaC++;
                       System.out.println("Du parkerar på " + lastBrygga);

                    } else if ((fordonsModell.equals("Lätt Lastbil") && avLastBryggaD <1) || ((fordonsModell.equals("Tung Lastbil") && avLastBryggaD <1) && fordonsVikt < 9000)) {
                        lastBrygga = lastBryggaPlats[3];
                        avLastBryggaD++;
                        System.out.println("Du kan parkerar på  " + lastBrygga);

                    } else if (fordonsModell.equals("Tung Lastbil") && avlastBryggaE <1) {
                        lastBrygga = lastBryggaPlats[4];
                        avlastBryggaE++;
                        System.out.println("Du parkerar på  " + lastBrygga);
                    } else {
                        System.out.println("Det är fullt på Dumpa mer. Välkommen åter!");
                      break;
                    }
                    parkeradFordon parkedTruckInfo = new parkeradFordon(fordonsModell, lastBrygga, fordonsVikt);
                    parkeradFordonInfoList.add(parkedTruckInfo);
                }
                case 3 -> System.out.println("Du lämnar nu Dumpa mer. ");//Programmet avslutas
            }
        }
    }
    public void parkeringsLista() {
        for (parkeradFordon parkeradFordonInfo : parkeradFordonInfoList) {
            System.out.println(parkeradFordonInfo);
        }
    }

}

