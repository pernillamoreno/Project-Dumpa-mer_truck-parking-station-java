public class parkeradFordon { //klassen som håller brygga modeller och vikt

    String fordonsModell;

    int fordonsVikt;
    String lastBrygga;

    public parkeradFordon(String lastBrygga, String fordonsModell, int fordonsVikt){
        this.lastBrygga=lastBrygga;
        this.fordonsModell=fordonsModell;
        this.fordonsVikt=fordonsVikt;
    }
    public String toString(){
        return lastBrygga+"\t\t" +"Fordon " + fordonsModell + "\t\t"+"Vikt:[" + fordonsVikt +" kg]";
    }
}

