package org.example.portfolio.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleid;
    private String name;

    // --- Relation: One Role -> Many Users ---
    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public int getRoleid() {
        return roleid;
    }

    public void addUser(User user) {
        users.add(user);
        user.setRole(this);
    }
}
