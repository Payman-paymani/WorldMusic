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
@Table(name = "tbl_musicCategory")
public class MusicCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "image_url")
    private String imageUrl;
    private String description;
    
   @OneToMany(cascade= CascadeType.ALL, mappedBy = "category")
   private Set<MusicCategory> music_category;
    
}
