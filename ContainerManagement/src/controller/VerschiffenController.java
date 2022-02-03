package controller;

import java.util.ArrayList;

import model.Verschiffung;
import model.Gueter.Gueter;
import model.Transport.Route;
import model.Transport.Schiff;

public class VerschiffenController extends ClassController{

    ArrayList<Verschiffung> verschiffungen;

    public VerschiffenController(MainController mc) {
        super(mc);
        setVerschiffungen(new ArrayList<Verschiffung>());
    }

    //Neue Verschiffung, Datum ist in der Eingabe in Strings und wird anschließend umgewandelt.
    public void addNewVerschiffung(Schiff schiff, Route route, Gueter gut, String preis) {

        Verschiffung vs = new Verschiffung(schiff ,route,  gut, Double.parseDouble(preis));
        getVerschiffungen().add(vs);
        
    }

    @Override
    public void createDemodata() {
        getVerschiffungen().add(new Verschiffung(getMc().getSc().getSchiffe().get(0), getMc().getRc().getRouten().get(1), getMc().getGc().getGueterAr().get(1), 2345.3)); 
    }

    @Override
    public void printAllObjects() {
        sendOutput("Alle Verschiffungen:\n");
        for (Verschiffung v : verschiffungen) {
            sendOutput("Schiff: "+v.getSchiff().getName()+"\nVon: "+v.getRoute().getStart()+"\nnach: "+v.getRoute().getZiel()+"\nAnkunft: "+v.getAnkunft()+"\nPreis: "+v.getPreis()+"\n");
        }
    }

    //Kontrollmethode: Prüft ob das Gut auf dem Schiff transportiert werden darf.
    public void controllZulassung(Verschiffung v) {
        if (v.getSchiff().getGut_zulassungen().contains(v.getGut().getGutTyp())) {
            sendOutput("Verschiffung kann stattfinden.");
        } else {
            sendOutput("das Gut darf nicht auf dem Schiff transportiert werden!");
        }
    }
    

    /**
     * 
     * 
     * SETTER UND GETTER
     */

     public void setVerschiffungen(ArrayList<Verschiffung> verschiffungen) {
         this.verschiffungen = verschiffungen;
     }
     public ArrayList<Verschiffung> getVerschiffungen() {
         return verschiffungen;
     }

    
}
