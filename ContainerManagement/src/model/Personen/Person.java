package model.Personen;

public abstract class Person {

    String vorname;
    String nachname;
    int personalnummer;


    public Person(String vorname, String nachname, int personalnummer){
        setVorname(vorname);
        setNachname(nachname);
        setPersonalnummer(personalnummer);
    }


    public Person(String vorname, String nachname){
        setVorname(vorname);
        setNachname(nachname);
    }


    // Ausgabe ganzer Name
    public String getName() {
        return getVorname() + " "+ getNachname();
    }


    /**
     * 
     * SETTER UND GETTER
     */

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public int getPersonalnummer() {
        return personalnummer;
    }
    public String getVorname() {
        return vorname;
    }
}
