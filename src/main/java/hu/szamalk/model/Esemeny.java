package hu.szamalk.model;

import jdk.jfr.Timestamp;

import java.util.HashSet;
import java.util.UUID;

public class Esemeny implements Cloneable{
    private UUID id;
    private String nev;
    private String leiras;
    private Timestamp idopont;
    private HashSet<Szereplo> szereplok;

    public Esemeny(String nev, String leiras, Timestamp idopont) {
        this.nev = nev;
        this.leiras = leiras;
        this.idopont = idopont;
        id = UUID.randomUUID();
        szereplok = new HashSet<>();
    }
}
