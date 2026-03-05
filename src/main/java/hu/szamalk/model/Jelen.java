package hu.szamalk.model;

import java.util.Objects;
import java.util.UUID;

public class Jelen {
    UUID esemeny;
    UUID szereplo;

    public Jelen(UUID esemeny, UUID szereplo) {
        this.esemeny = esemeny;
        this.szereplo = szereplo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jelen jelen = (Jelen) o;
        return Objects.equals(esemeny, jelen.esemeny) && Objects.equals(szereplo, jelen.szereplo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(esemeny, szereplo);
    }

    public UUID getEsemeny() {
        return esemeny;
    }

    public UUID getSzereplo() {
        return szereplo;
    }
}
