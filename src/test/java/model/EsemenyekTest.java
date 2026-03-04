package model;

import hu.szamalk.model.Esemeny;
import hu.szamalk.model.Esemenyek;

import hu.szamalk.model.Szereplo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

public class EsemenyekTest {
    Esemenyek esemenyek;
    @BeforeEach
    public void kezd(){
        esemenyek = new Esemenyek();
    }

    @Test
    public void notAddSameEsemeny(){
        Esemeny es = new Esemeny("Any", "AnyEn", new Timestamp(2222));
        Assertions.assertTrue(esemenyek.add(es));
        Assertions.assertFalse(esemenyek.add(es));
    }

    @Test
    public void notAddSameSzereplo(){
        Esemeny es = new Esemeny("Any", "AnyEn", new Timestamp(2222));
        esemenyek.add(es);
        Szereplo sz = new Szereplo("Rol", 13);
        Assertions.assertTrue(es.add(sz));
        Assertions.assertFalse(es.add(sz));
    }
}
//Kész
