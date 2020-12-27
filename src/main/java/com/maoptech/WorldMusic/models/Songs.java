package com.maoptech.WorldMusic.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import java.util.Date;


@Data
@Entity
@Table(name = "tbl_songs")
public class Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @Column(name = "date_released")
    private Date dateReleased;
    private String description;
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "file_url")
    private String fileUrl;


@ManyToOne
@JoinColumn(name= "singer_id", nullable = false)
private Singers singers;


@ManyToOne
@JoinColumn(name = "musicBy_id", nullable = false)
private Artist artits;

@ManyToOne
@JoinColumn(name = "musicCategory_id", nullable = false)
private MusicCategory category;


}
