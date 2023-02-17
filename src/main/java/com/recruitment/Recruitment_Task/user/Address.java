package com.recruitment.Recruitment_Task.user;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

import java.util.List;

@Entity
@Transactional
@Table(name = "adress")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private int adressId;
    private String city;



}
