package hu.szamalk.controller;

import hu.szamalk.model.Esemenyek;
import hu.szamalk.view.EsemenyV;

public class EsemenyC {
    private final String[] prs = new String[]{
       "help", "Elérhető parancsok kiírása",
       "exit", "Kilépés a programból",
       "addEsemeny", "Esemény hozzáadása",
       "addSzereplo", "Szereplő hozzáadása adott event-hez",
       "deleteEsemeny", "Esemény törlése",
       "deleteSzereplo", "Szereplő törlése"
    };
    public EsemenyC(Esemenyek model, EsemenyV view){
        boolean exit = false;
        view.doKezdolap();
        while(!exit){
            switch (view.scInp()){
                case "":

                    break;
                case "exit":
                    exit = true;
                    break;
            }
        }

    }
}
