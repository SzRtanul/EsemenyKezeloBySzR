package hu.szamalk.model;



import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class Esemeny implements Cloneable{
    private UUID id;
    private String nev;
    private String leiras;
    private Timestamp idopont;
    private Szereplo szervezo;
    private int status = 0;

    public Esemeny(Szereplo szervezo, String nev, String leiras, Timestamp idopont) {
        this.nev = nev;
        this.leiras = leiras;
        this.idopont = idopont;
        this.id = UUID.randomUUID();
        this.szervezo = szervezo;

    }

    public boolean setNev(String nev) {
        boolean both = status < 1;
        if(both) this.nev = nev;
        return both;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    public boolean setIdopont(Timestamp idopont) {
        boolean both = status < 2;
        if(both) this.idopont = idopont;
        return both;
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

    public int getStatus(){
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Esemeny esemeny = (Esemeny) o;
        return Objects.equals(id, esemeny.id) && Objects.equals(nev, esemeny.nev) && Objects.equals(leiras, esemeny.leiras) && Objects.equals(idopont, esemeny.idopont) && Objects.equals(szervezo, esemeny.szervezo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
//Kész
