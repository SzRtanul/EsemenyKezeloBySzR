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
    private Set<Szereplo> szereplok;

    public Esemeny(String nev, String leiras, Timestamp idopont) {
        this.nev = nev;
        this.leiras = leiras;
        this.idopont = idopont;
        id = UUID.randomUUID();
        szereplok = new HashSet<>();
    }

    public boolean add(Szereplo szereplo){
        return szereplok.add(szereplo);
    }

    public boolean delete(UUID id){
        return szereplok.removeIf(x -> x.getId() == id);
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
        return new HashSet<Szereplo>(szereplok);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Esemeny esemeny = (Esemeny) o;
        return Objects.equals(id, esemeny.id) && Objects.equals(nev, esemeny.nev) && Objects.equals(leiras, esemeny.leiras) && Objects.equals(idopont, esemeny.idopont);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nev, leiras, idopont);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
//Kész
