package com.ramazan.spring.jsf.example.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "iletisim")
public class Iletisim extends BaseEntity{
    @Column(name = "cep_telefon",nullable = false)
    private String cepTelefon;
    @Column(name = "ev_telefon")
    private String evTelefon;
    @Column(name = "is_telefon")
    private String isTelefon;
    @Column(name = "e_mail",nullable = false)
    private String email;


}
