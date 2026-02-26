package hu.szamalk.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Esemenyek {
    private HashSet<Esemeny> esemenyek;

    public Esemenyek(){
        esemenyek = new HashSet<>();
    }

    boolean add(Esemeny esemeny){
        return esemenyek.add(esemeny);
    }

    boolean delete(UUID id){
        return false;
    }

    public Esemeny get(UUID id){
        return esemenyek.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    public Set<Esemeny> getFiltered(Predicate<Esemeny> lambda){
        return esemenyek.stream().filter(lambda).collect(Collectors.toSet());
    }

    public Set<Esemeny> getAll(){
        return null;
    }
}
