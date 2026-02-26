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

    public boolean add(){
        return false;
    }

    public boolean change(){
        return false;
    }

    public boolean delete(){
        return false;
    }

    public UUID getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public Timestamp getIdopont() {
        return idopont;
    }

    public HashSet<Szereplo> getSzereplok() {
        return szereplok;
    }
}
