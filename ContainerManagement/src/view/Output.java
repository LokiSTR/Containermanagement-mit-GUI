package view;

import java.util.Scanner;

import controller.MainController;

public class Output {

    public Scanner scanner;
    MainController mc;
    

    public Output(MainController mc){
        setMc(mc);
    }

    public void printData(String data){
        System.out.println(data);
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
