package controller;

// import NewFrischwareController;
import view.Output;


public class MainController {
    
    Output output;
    GueterController gc;
    MenuController menuc;
    PersonenController pc;
    RouteController rc;
    SchiffController sc;
    VerschiffenController vc;
    // NewVerschiffungController nvc;
    // NewFrischwareController fc;    



    public MainController() {
        setGc(new GueterController(this));
        // setFc(new NewFrischwareController(this));
        setPc(new PersonenController(this));
        setMenuc(new MenuController(this));
        setVc(new VerschiffenController(this));
        setSc(new SchiffController(this));
        setRc(new RouteController(this));
        setOutput(new Output(this));

        createAllDemodata();
        getMenuc().startMenu();

    }

    //Erstellen aller Demodaten aus allen Controllern
    public void createAllDemodata() {
        getGc().createDemodata();
        getPc().createDemodata();
        getRc().createDemodata();
        getSc().createDemodata();
        getVc().createDemodata();
    }

    //Methode zum ausgeben aller Objekte
    public void printEveryObject() {
        getGc().printAllObjects();
        getPc().printAllObjects();
        getRc().printAllObjects();
        getSc().printAllObjects();
        getVc().printAllObjects();
    }


    /**
     * 
     * SETTER UND GETTER
     */

     public void setOutput(Output output) {
         this.output = output;
     }
     public Output getOutput() {
         return output;
     }
     public void setGc(GueterController gc) {
         this.gc = gc;
     }
     public GueterController getGc() {
         return gc;
     }
     public void setMenuc(MenuController menuc) {
         this.menuc = menuc;
     }
     public MenuController getMenuc() {
         return menuc;
     }
    /* public NewFrischwareController getFc() {
         return fc;
     }
     public void setFc(NewFrischwareController fc) {
         this.fc = fc;
     }      */
     public void setPc(PersonenController pc) {
         this.pc = pc;
     }
     public PersonenController getPc() {
         return pc;
     }
     public void setVc(VerschiffenController vc) {
         this.vc = vc;
     }
     public VerschiffenController getVc() {
         return vc;
     }
     public void setRc(RouteController rc) {
         this.rc = rc;
     }
     public RouteController getRc() {
         return rc;
     }
     public void setSc(SchiffController sc) {
         this.sc = sc;
     }
     public SchiffController getSc() {
         return sc;
     }
}
