package controller;

import java.util.ArrayList;

import model.Transport.Route;

public class RouteController extends ClassController{

    ArrayList<Route> routen;

    public RouteController(MainController mc) {
        super(mc);
        setRouten(new ArrayList<Route>());
    }

    @Override
    public void createDemodata() {
        
        
        getRouten().add(new Route("Hamburg", "New York", 18, 7000));
        getRouten().add(new Route("Hamburg", "Shanghai", 38, 12079));
        getRouten().add(new Route("Hamburg", "Dubai", 15, 5000));
        getRouten().add(new Route("Hamburg", "Tromsö", 8, 2300));
        getRouten().add(new Route("Hamburg", "Bankok", 45, 13614));
        
    }

    public void printAllObjects() {
        int i=0;
        sendOutput("Alle Routen:");
        for (Route r : routen) {
            sendOutput(i+". Start: "+r.getStart()+"\nZiel: "+ r.getZiel()+"\nFahrtszeit: "+ r.getZeitDays()+" Tage\nStrecke: "+ r.getKilometer()+" km\n");
            i++;
        }    
    }

    /**
     * 
     * SETTER UND GETTER
     */

     public void setRouten(ArrayList<Route> routen) {
         this.routen = routen;
     }
     public ArrayList<Route> getRouten() {
         return routen;
     }
    
}
