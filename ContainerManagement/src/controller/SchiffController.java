package controller;

import java.util.ArrayList;

import model.Transport.Schiff;

public class SchiffController extends ClassController {

    ArrayList<Schiff> schiffe;

    public SchiffController(MainController mc) {
        super(mc);
        setSchiffe(new ArrayList<Schiff>());
    }

    @Override
    public void createDemodata() {
        //In der ArrayList werden die Zulassungen eingetragen und Übergeben, diese werden dann bei der Verschiffung überprüft.
        ArrayList<String> quali1 = new ArrayList<String>();
        quali1.add("Frischware");
        quali1.add("Tiere");
        getSchiffe().add(new Schiff("Frieda",12000, getMc().getPc().getKapitaene().get(0), quali1));

        
        ArrayList<String> quali2 = new ArrayList<String>();
        quali2.add("Gefahrengut");
        quali2.add("Wertgegenstände");
        getSchiffe().add(new Schiff("Crusoe", 200000, getMc().getPc().getKapitaene().get(1), quali2));

        ArrayList<String> quali3 = new ArrayList<String>();
        quali3.add("Frischware");
        quali3.add("Tiere");
        quali3.add("Wertgegenstände");
        getSchiffe().add(new Schiff("Eugen", 158600, getMc().getPc().getKapitaene().get(2), quali3));
        
        
        
    }

    public void printAllObjects() {
        int i=0;
        sendOutput("Alle Schiffe:");
        for (Schiff schiff : schiffe) {
            sendOutput(i+ ". Name: "+schiff.getName()+"\nKapitän: "+ schiff.getKapitaen().getName()+"\nMaximale Zuladung: "+ schiff.getMaxZuladung()+" Tonnen\nZugelassene Güter: "+ schiff.getGut_zulassungen()+"\n");
            i++;
        }
    }


    /**
     * 
     * SETTER UND GETTER
     */

     public void setSchiffe(ArrayList<Schiff> schiffe) {
         this.schiffe = schiffe;
     }
     public ArrayList<Schiff> getSchiffe() {
         return schiffe;
     }
    
}
