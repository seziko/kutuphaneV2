package com.ramazan.spring.jsf.example.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "adres")
public class Adres extends BaseEntity {

    @Column(name = "ulke",nullable = false)
    private String ulke;
    @Column(name = "il",nullable = true)
    private String il;
    @Column(name = "ilce",nullable = true)
    private String ilce;
    @Column(name = "koy")
    private String koy;
    @Column(name = "mahalle",nullable = true)
    private String mahalle;
    @Column(name = "sokak",nullable = true)
    private String sokak;
    @Column(name = "dis_kapi")
    private String disKapi;
    @Column(name = "ic_kapi")
    private String icKapi;
    @Column(name = "adres_tarifi")
    private String adresTarifi;


}
