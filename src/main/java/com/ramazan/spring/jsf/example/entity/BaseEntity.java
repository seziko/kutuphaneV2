package com.ramazan.spring.jsf.example.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;


//@Getter
//@Setter
//@ToString(exclude ={"id"})
//@EqualsAndHashCode
//@NoArgsConstructor
//@AllArgsConstructor
@Data
@MappedSuperclass
public abstract class BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "etar")
    private Date etar=new Date();
    @Temporal(TemporalType.TIMESTAMP)
    @Column (name = "dtar")
    private Date dtar = new Date();
    @Column(name = "ekul")
    private String ekul;
    @Column(name = "dkul")
    private String dkul;


    protected BaseEntity(){

    }


}
