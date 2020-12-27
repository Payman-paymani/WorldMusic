package com.maoptech.WorldMusic.models;

import lombok.Data;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tbl_singers")
public class Singers {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_url")
    private String photoUrl;
    private String description;
  
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "singers")
    private Set<Singers> singers;
}
