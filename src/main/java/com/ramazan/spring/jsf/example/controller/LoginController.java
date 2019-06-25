package com.ramazan.spring.jsf.example.controller;

import com.ramazan.spring.jsf.example.entity.Kullanici;
import com.ramazan.spring.jsf.example.service.KullaniciService;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.IOException;

@Data
@Controller
@Scope("view")
public class LoginController {

    private final KullaniciService kullaniciService;
    private Kullanici kullanici = new Kullanici();


    public LoginController(KullaniciService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }


    public void onRedirect(){
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void onGiris(){
            if (kullanici.getKullaniciAdi()!=null && kullanici.getPassword()!=null){
                onRedirect();
            }
        }
    }

