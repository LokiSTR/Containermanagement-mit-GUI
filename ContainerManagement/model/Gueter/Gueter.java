package model.Gueter;

public abstract class Gueter {
    
    int gutnummer;
    int sicherheitslevel;
    double gewicht;
    String inhalt;
    String gutTyp;
    static int anzahlGueter;

    public Gueter(double gewicht, String inhalt){
        setGewicht(gewicht);
        setInhalt(inhalt);
        //Generator Gutnummer
        anzahlGueter ++;
        setGutnummer(anzahlGueter);

    }

    public Gueter(int sicherheitslevel, double gewicht, String inhalt){
        setsicherheitslevel(sicherheitslevel);
        setGewicht(gewicht);
        setInhalt(inhalt);
        //Generator Gutnummer
        anzahlGueter ++;
        setGutnummer(anzahlGueter);
    }


    /**
     * 
     * SETTER UND GETTER
     */

    public void setGutnummer(int gutnummer) {
        this.gutnummer = gutnummer;
    }
    public void setsicherheitslevel(int sicherheitslevel) {
        this.sicherheitslevel = sicherheitslevel;
    }
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }

    public int getGutnummer() {
        return gutnummer;
    }
    public int getSicherheitslevel() {
        return sicherheitslevel;
    }
    public double getGewicht() {
        return gewicht;
    }
    public String getInhalt() {
        return inhalt;
    }
    public static void setAnzahlGueter(int anzahlGueter) {
        Gueter.anzahlGueter = anzahlGueter;
    }
    public static int getAnzahlGueter() {
        return anzahlGueter;
    }
    public void setGutTyp(String gutTyp) {
        this.gutTyp = gutTyp;
    }
    public String getGutTyp() {
        return gutTyp;
    }
}
