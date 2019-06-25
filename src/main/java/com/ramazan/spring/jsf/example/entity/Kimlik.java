package com.ramazan.spring.jsf.example.entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name = "kimlik")
public class Kimlik extends BaseEntity{

    @Column(name = "tc_kimlik_no",nullable = false)
    private String tcKimlikNo;
    @Column(name = "adi",nullable = false)
    private String adi;
    @Column(name = "soyadi",nullable = false)
    private String soyadi;
    @Temporal(TemporalType.DATE)
    @Column(name = "dogum_tarihi")
    private Date dogumTarihi;
    @OneToOne
    @JoinColumn(name = "iletisim_id",nullable = true)
    private Iletisim iletisim;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adres_id",nullable = true)
    private Adres adres;



}
