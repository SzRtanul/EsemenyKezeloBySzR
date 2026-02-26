package hu.szamalk.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Esemenyek {
    private HashSet<Esemeny> esemenyek;

    boolean add(Esemeny esemeny){
        return true;
    }
    boolean change(UUID id){
        return true;
    }
    boolean delete(UUID id){
        return true;
    }
    public Esemeny get(UUID id){
        return null;
    }
    public Set<Esemeny> getFiltered(Predicate<Esemeny> lambda){
        return esemenyek.stream().filter(lambda).collect(Collectors.toSet());
    }

    public Set<Esemeny> getAll(){
        return null;
    }
}
