public class parkeradFordon { //Skapar klassen parkeradeFordon
    
    //Definerar attributen för klassen
    String fordonsModell;
    int fordonsVikt;
    String lastBrygga;
    
    //Definerar konstruktorn med inparametrar String lastBrygga, String fordonsModell, int fordonsVikt.
    public parkeradFordon(String lastBrygga, String fordonsModell, int fordonsVikt){ //Klassens Konstruktor,det måste vara samma namn som klassen dvs parkeradFordon
        this.lastBrygga=lastBrygga; //this. står för det nuvarande objektets klassvariabel. 
        this.fordonsModell=fordonsModell;
        this.fordonsVikt=fordonsVikt;
    }
    public String toString(){
        return lastBrygga+"\t\t" +"Fordon " + fordonsModell + "\t\t"+"Vikt:[" + fordonsVikt +" kg]";
    }
}

