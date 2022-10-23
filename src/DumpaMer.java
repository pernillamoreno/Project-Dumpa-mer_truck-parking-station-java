import java.util.Scanner; //Mina ambitioner för denna uppgift visar inte detta resultat. Men nu kan det bara bli bättre. 

import static java.lang.System.out;

public class DumpaMer { //metoden DumpaMer
    Scanner scanner = new Scanner(System.in); //Scanner tar in värdet från en användare

    String fordonsModell;
    int fordonsVikt;
    String lastBrygga;
    int makeChoises;
    int avLastBryggaA = 0;//tilldeling datatypen int, på dom olika avlastningsplatserna
    int avLastBryggaB = 0;
    int avLastBryggaC = 0;
    int avLastBryggaD = 0;
    int avlastBryggaE = 0;


    public void choise() { //metod choise
        while (makeChoises != 3) {//whileloop som kör så länge det inte är 3. Vid val av 3 avslutas programmet.
            out.println("Välkommen till Dumpa mer!\n" + //meny som visas när använvaden anländer till stationen
                    "~~~~~~~~~~~~~~~~~~~~~~~~~    \n" +
                    "Välj i menyn:                \n" +
                    "1. Se parkerade fordon       \n" +
                    "2. Registra nytt fordon.     \n" +
                    "3.  Exit  ");
            makeChoises = scanner.nextInt();

            switch (makeChoises) { //Switch till att välja i huvudmenyn. 

                case 1 -> parkeringsLista(); //listan som lagrar fordonen
                case 2 -> {
                    out.println("Dina Val: \n" + "1. Van  \n" + "2. Lätt lastbil \n" + "3. Tung lastbil \n");//Meny för fordon.
                    Scanner options = new Scanner(System.in);
                    fordonsModell = options.nextLine();
                    if (fordonsModell.equals("1")) { //Ifsats för att välja fordon.fordonsmodellerna tilldelas med equals tex värdet 1 är Van. 
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
                    fordonsVikt = options.nextInt(); //Värdet av vikten sparas i variabeln som heter fordonsvikt. 
                    out.println("Den angivna vikten är" + fordonsVikt);
                    String[] lastBryggaPlats = {"lastBrygga A",//Lista kajplatserna där fordonen lastar av.
                                                "lastBrygga B",
                                                "lastBrygga C",
                                                "lastBrygga D",
                                                "lastBrygga E"};
                  //if : avlast på samma lastbrygga om det Van ELLER Lättlastbil som är sant || . Då lastar fordonet av på samma kaj eftersom vikten tillåter
                  //detta tex A är det under 5 ton. 
                  //När Van OCH lastbrygga A är sant && (när kajen är ledig)lastar vanen av. Är villkoret falskt, dvs lastkaj full blir Vanen dirgerad till B [1]
                   //om villkoret är är sant dvs ledig. 
                    if ((fordonsModell.equals("Van") && avLastBryggaA <= 4) || (fordonsModell.equals("Lätt lastbil") && fordonsVikt < 5000)) {
                        lastBrygga = lastBryggaPlats[0]; //utgångsvärde av lastbryggorna 0
                        avLastBryggaA++; //++ visar att variabeln ökar ett fordon på denna lastbrygga.
                        out.println("Du kan parkera på " + lastBrygga);
                    //else if om villkoret är sant av någon av valen nedan  
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
                      //else om villkoret är falskt och det är fullt på Dumpa mer.
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


