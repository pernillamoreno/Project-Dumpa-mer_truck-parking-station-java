public class parkeradFordon { //Klassen parkeradeFordon
    
    //Definerar attributen för klassen
    String fordonsModell;
    int fordonsVikt;
    String lastBrygga;
    
    //Definerar attributen för klassen, String lastBrygga, String fordonsModell, int fordonsVikt.
    public parkeradFordon(String lastBrygga, String fordonsModell, int fordonsVikt){ 
        this.lastBrygga=lastBrygga; //this. står för det nuvarande objektets klassvariabel. (Lite osäker här om jag gjort rätt i min beskrivning)
        this.fordonsModell=fordonsModell;
        this.fordonsVikt=fordonsVikt;
    }
    public String toString(){
        return lastBrygga+"\t\t" +"Fordon " + fordonsModell + "\t\t"+"Vikt:[" + fordonsVikt +" kg]";
    }
}

