package ch.zli.m223.punchclock.domain;

import jdk.jfr.Name;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EntryTag {
    @Id
    private  int id;
    private String name;

    @OneToMany
    private Set<Entry> entrySet;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
