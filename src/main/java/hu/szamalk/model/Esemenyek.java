package hu.szamalk.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Esemenyek {
    private Set<Esemeny> esemenyek;

    public Esemenyek(){
        esemenyek = new HashSet<>();
    }

    public boolean add(Esemeny esemeny){
        return esemenyek.add(esemeny);
    }

    public boolean delete(UUID id){
        return esemenyek.removeIf(x->x.getId() == id);
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
}
//Kész
