public class parkeradFordon {

    String fordonsModell;

    int fordonsVikt;
    String lastBrygga;


    public parkeradFordon(String lastBrygga, String fordonsModell, int fordonsVikt){
        this.fordonsModell=fordonsModell;
        this.fordonsVikt=fordonsVikt;
        this.lastBrygga=lastBrygga;
    }
    public String toString(){
        return lastBrygga+"\t\t" +"Fordon " + fordonsModell + "\t\t"+"Vikt:[" + fordonsVikt +" kg]";
    }
}
