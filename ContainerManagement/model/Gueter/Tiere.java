package model.Gueter;

public class Tiere extends Gueter{

    String tierart;

    public Tiere( double gewicht, String inhalt, String tierart) {
        super(gewicht, inhalt);
        setTierart(tierart);
        setGutTyp("Tiere");
    }


    /**
     * 
     * SETTER UND GETTER
     */
    
    
    public void setTierart(String tierart) {
        this.tierart = tierart;
    }
    
    public String getTierart() {
        return tierart;
    }
}
