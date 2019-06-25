package com.ramazan.spring.jsf.example.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "kullanici")
public class Kullanici extends BaseEntity {
    @Column(name = "kullanici_adi")
    private String kullaniciAdi;
    @Column(name = "sifre")
    private String password;
    private String passwordAgain;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kimlik_id")
    private Kimlik kimlik;




}
