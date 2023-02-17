package com.recruitment.Recruitment_Task.user;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jdk.jfr.DataAmount;

@Entity
@Transactional
@Table(name = "adress")
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private Integer adressId;
    private String city;
    private String adressType;
}
