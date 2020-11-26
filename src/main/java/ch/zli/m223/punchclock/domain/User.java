package ch.zli.m223.punchclock.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(nullable = false)
    @JsonIgnoreProperties({"users"})
    private UserRole userRole;

    @OneToMany(mappedBy = "user")
    private Set<Entry> entrySet;

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public Set<Entry> getEntrySet() {
        return entrySet;
    }

    public void setEntrySet(Set<Entry> entrySet) {
        this.entrySet = entrySet;
    }
}
