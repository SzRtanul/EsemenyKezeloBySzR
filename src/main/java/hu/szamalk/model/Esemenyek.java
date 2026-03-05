package hu.szamalk.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Esemenyek {
    private Set<Esemeny> esemenyek;
    private Set<Szereplo> szereplok;
    private Set<Jelen> jelens;

    public Esemenyek(){
        this.jelens = new HashSet<>();
        this.szereplok =  new HashSet<>();
        this.esemenyek = new HashSet<>();
    }

    public boolean add(Esemeny esemeny){
        return esemenyek.add(esemeny);
    }

    public boolean add(Szereplo szereplo){
        return szereplok.add(szereplo);
    }

    public HashSet<Szereplo> getSzereplok() {
        return new HashSet<Szereplo>(szereplok);
    }

    public boolean deleteEsemeny(UUID id){
        return esemenyek.removeIf(x->x.getId() == id);
    }
    
    public boolean deleteSzereplo(UUID id){
        return szereplok.removeIf(x -> x.getId() == id);
    }
    
    public Esemeny get(UUID id){
        return esemenyek.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    public Set<Esemeny> getFiltered(Predicate<Esemeny> lambda){
        return esemenyek.stream().filter(lambda).collect(Collectors.toSet());
    }

    public Set<Esemeny> getAll(){
        return new HashSet<Esemeny>(esemenyek);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    public boolean doMeghiv(UUID esemeny, UUID szereplo){
        return 
            esemenyek.stream().filter(x -> x.getId() == esemeny).findFirst().orElse(null) != null && 
            szereplok.stream().filter(x -> x.getId() == szereplo).findFirst().orElse(null) != null &&
            jelens.add(new Jelen(esemeny, szereplo));
    }
    
    public Set<Szereplo> getEsemenySzereplok(UUID esemeny){
        Set<Szereplo> sz = new HashSet<>();
        Set<Jelen> j = jelens;
        Szereplo sza;
        for(Jelen jelen : jelens){
            sza = szereplok.stream().filter(x -> x.getId() == jelen.szereplo).findFirst().orElse(null);
            if(jelen.esemeny == esemeny && sza != null){
                sz.add(sza);
            }
        }
        return sz;
    }
}
//Kész
