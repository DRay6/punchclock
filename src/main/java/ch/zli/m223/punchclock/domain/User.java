package ch.zli.m223.punchclock.domain;

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
}
