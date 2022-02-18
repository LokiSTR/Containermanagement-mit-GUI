package controller;

import java.util.Scanner;

import model.Gueter.Gueter;
import model.Transport.Route;
import model.Transport.Schiff;

public class MenuController {

    MainController mc;
    public Scanner scanner;

    public MenuController(MainController mc) {
        setMc(mc);
    }

    public void startMenu(){
        //Auswahlmöglichkeiten
        sendOutput("(1) Neues Gut");
        sendOutput("(2) Neue Verschiffung");
        sendOutput("(3) Etwas ausgeben");
    
        String auswahl = "2"; //getMc().getOutput()

        sendOutput("Ihre Auswahl ist: " + auswahl);


        if(auswahl.equals("1")){
            createGutMenu();
        }   
        else if(auswahl.equals("2")){
            createVerschiffung();
        }
        else if(auswahl.equals("3")){
            showMenu();
        }
        else{
            sendOutput("Falsche Eingabe");
        }
    }

    //Für neue eingaben von Gütern
    public void createGutMenu() {
        sendOutput("Sie wollen ein neues Gut erstellen, bitte Wählen sie den Typ");
        sendOutput("(1) Frischware");
        sendOutput("(2) Gefahrengut");
        sendOutput("(3) Normalgut");
        sendOutput("(4) Tiere");
        sendOutput("(5) Wertgegenstände");

       String auswahl = "1"; //getMc().getOutput()

       sendOutput("Ihre Auswahl ist: " + auswahl);


       if(auswahl.equals("1")){
           createFrischware();
       }   
       else if(auswahl.equals("2")){
           createGefahrengut();
       }
       else if(auswahl.equals("3")){
           createNormalgut();
       }
       else if(auswahl.equals("4")){
           createTiere();
       }
       else if(auswahl.equals("5")){
            createWertgegenstaende();
       }
       else{
           sendOutput("Falsche Eingabe");
       }
    }
    

    //Eine neue Verschiffung erstellen
    public void createVerschiffung() {

        sendOutput("Preis: ");
        String preis = "2000";

        sendOutput("Bitte bei den Folgenden abfragen jeweils die vorangestellte Nummer des gewünschten Objekts angeben.\n");
        //Schiff auswählen
        sendOutput("Schiff wählen: \n");
        getMc().getSc().printAllObjects();
        String schiff_choice = "1";
        //Schiff raussuchen
        Schiff schiff = getMc().getSc().getSchiffe().get(Integer.valueOf(schiff_choice));

        //Route auswählen
        sendOutput("Route wählen: ");
        getMc().getRc().printAllObjects();
        String route_choice = "3";
        Route route = getMc().getRc().getRouten().get(Integer.valueOf(route_choice));

        //Gut auswählen
        //Wenn möglich nach erstellen von neuem Gut dieses direkt in die Verschiffung übergeben...
        sendOutput("Gut wählen: ");
        getMc().getGc().printAllObjects();
        String gut_choice = "3";
        //Schiff raussuchen
        Gueter gut = getMc().getGc().getGueterAr().get(Integer.valueOf(gut_choice)-1);

        getMc().getVc().addNewVerschiffung(schiff, route, gut, preis);
        
    }

    //Dinge ausgeben lassen
    public void showMenu() {

        sendOutput("Sie wollen etwas ausgeben lassen, bitte wählen sie genauer");
        sendOutput("(1) alles");
        sendOutput("(2) Güter");
        sendOutput("(3) Personen");
        sendOutput("(4) Routen");
        sendOutput("(5) Schiffe");
        sendOutput("(6) Verschiffungen");

        String auswahl = "1"; //getMc().getOutput()

        sendOutput("Ihre Auswahl ist: " + auswahl);


        if(auswahl.equals("1")){
            getMc().printEveryObject();
        }   
        else if(auswahl.equals("2")){
            getMc().getGc().printAllObjects();
        }
        else if(auswahl.equals("3")){
            getMc().getPc().printAllObjects();
        }
        else if(auswahl.equals("4")){
            getMc().getRc().printAllObjects();
        }
        else if(auswahl.equals("5")){
            getMc().getSc().printAllObjects();
        }
        else if(auswahl.equals("6")){
            getMc().getVc().printAllObjects();
        }
        else{
            sendOutput("Falsche Eingabe");
        }
    }

    /**
     * 
     * 
     * Create Methoden:
     * 
     * 
     */

     public void createFrischware() {

        sendOutput("Gewicht: ");
        String gewicht = "250";
        sendOutput("Inhalt: ");
        String inhalt = "Tomaten";
        sendOutput("Haltbarkeit (dd.MM.yyyy): ");
        String haltbarkeit = "22.03.2022";
         getMc().getGc().addNewFrischware(gewicht, inhalt, haltbarkeit);
     }

     public void createGefahrengut() {
         
        sendOutput("Benötigtes Sichterheitslevel: ");
        String sicherheitslevel = "25";
        sendOutput("Inhalt: ");
        String inhalt = "Tomaten";
        getMc().getGc().addNewGefahrengut(sicherheitslevel, inhalt);
     }

     public void createNormalgut() {
         
        sendOutput("Gewicht: ");
        String gewicht = "250";
        sendOutput("Inhalt: ");
        String inhalt = "Tomaten";
        getMc().getGc().addNewNormalgut(gewicht, inhalt);
     }

     public void createTiere() {
         
        sendOutput("Gewicht: ");
        String gewicht = "250";
        sendOutput("Inhalt: ");
        String inhalt = "5";
        sendOutput("Tierart: ");
        String tierart = "Hund";
        getMc().getGc().addNewTiere(gewicht, inhalt, tierart);
     }

     public void createWertgegenstaende() {
            
        sendOutput("Benötigtes Sichterheitslevel: ");
        String sicherheitslevel = "25";
        sendOutput("Gewicht: ");
        String gewicht = "250";
        sendOutput("Inhalt: ");
        String inhalt = "5";
        sendOutput("Wert: ");
        String wert = "2000";
        getMc().getGc().addNewWertgegenstaende(sicherheitslevel, gewicht, inhalt, wert);
     }

     

    public void sendOutput(String data) {
        getMc().getOutput().printData(data);
    }

    /**
     * 
     * 
     * SETTER UND GETTER 
     */

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public Scanner getScanner() {
        return scanner;
    }
    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }


}
