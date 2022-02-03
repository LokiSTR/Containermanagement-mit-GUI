package model.Transport;

import java.util.ArrayList;

import model.Personen.Kapitaen;


public class Schiff {
    
    int maxZuladung;
    Kapitaen kapitaen;
    String name;
    //Arraylist mit Angaben darüber, welche Güter mit diesem Schiff transportiert werden können, muss vor erzeugen einer Instanz erstellt werden.
    ArrayList<String> gut_zulassungen;

    public Schiff(String name, int maxZuladung, Kapitaen kapitaen, ArrayList<String> gut_zulassungen) {
        setKapitaen(kapitaen);
        setMaxZuladung(maxZuladung);
        setGut_zulassungen(gut_zulassungen);
        setName(name);
    }

    /**
     * 
     * SETTER UND GETTER
     */


    
     public void setKapitaen(Kapitaen kapitaen) {
         this.kapitaen = kapitaen;
     }
     public Kapitaen getKapitaen() {
         return kapitaen;
     }
     public void setMaxZuladung(int maxZuladung) {
         this.maxZuladung = maxZuladung;
     }
     public int getMaxZuladung() {
         return maxZuladung;
     }
     public void setGut_zulassungen(ArrayList<String> gut_zulassungen) {
         this.gut_zulassungen = gut_zulassungen;
     }
     public ArrayList<String> getGut_zulassungen() {
         return gut_zulassungen;
     }
     public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

}