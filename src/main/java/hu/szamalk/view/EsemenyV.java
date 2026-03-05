package hu.szamalk.view;

import java.util.Scanner;

public class EsemenyV {
    static Scanner sc = new Scanner(System.in);


    public String scInp(){
        System.out.print("Művelet száma: ");
        return sc.nextLine();
    }


    public void doKezdolap(){
        String out = "A használható parancsok a help parancs segítségével heleníthetőek meg.";
        System.out.println(out);

    }

    public void doHelp(String[] parancsok){
        String out = "";
        for(int i = 0; i < parancsok.length; i+=2){
            out += parancsok[i] + ": " + parancsok[i+1] + "\n";
        }
        System.out.println(out);
    }

    public void doError(){

    }
}
