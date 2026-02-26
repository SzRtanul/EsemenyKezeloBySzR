package hu.szamalk.model;

import java.util.Objects;
import java.util.UUID;

public class Szereplo  implements Cloneable{
    private UUID id;
    private String nev;
    private int eletkor;

    public Szereplo(String nev, int eletkor){
        this.nev = nev;
        this.eletkor = eletkor;
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Szereplo szereplo = (Szereplo) o;
        return eletkor == szereplo.eletkor && Objects.equals(id, szereplo.id) && Objects.equals(nev, szereplo.nev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public Szereplo clone(){
        Szereplo a = null;
        try {
            a = (Szereplo)super.clone();
        }
        catch (CloneNotSupportedException ex){
            //return null;
        }
        return a;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
