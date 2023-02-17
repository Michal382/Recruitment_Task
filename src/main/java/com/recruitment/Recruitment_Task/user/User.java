package com.recruitment.Recruitment_Task.user;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(length = 15, nullable = false)
    private String password;

    @Column(length = 30, nullable = false, name = "first_name")
    private String firstname;

    @Column(length = 30, nullable = false, name = "last_name")
    private String lastname;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id", referencedColumnName = "id")
    private List<Adress> adress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Adress> getAdress() {
        return adress;
    }

    public void setAdress(List<Adress> adress) {
        this.adress = adress;
    }
}
