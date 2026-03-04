package hu.szamalk.view;

import java.util.Scanner;

public class EsemenyV {
    static Scanner sc = new Scanner(System.in);


    public String scInp(){
        return sc.nextLine();
    }


    public String kezdolap(){
        String out = "";
        System.out.println(this.help());
        System.out.print("Művelet száma: ");
        return scInp();
    }

    public String help(){
        return "";
    }

    public String error(){
        return "";
    }
}
