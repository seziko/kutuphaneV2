package com.ramazan.spring.jsf.example.controller;

import com.ramazan.spring.jsf.example.entity.Adres;
import com.ramazan.spring.jsf.example.entity.Iletisim;
import com.ramazan.spring.jsf.example.entity.Kimlik;
import com.ramazan.spring.jsf.example.entity.Kullanici;
import com.ramazan.spring.jsf.example.service.KullaniciService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Data
@Controller
@Scope("view")
public class KullaniciController {

    private final KullaniciService kullaniciService;
    private Kullanici kullanici = new Kullanici();
    private Kimlik kimlik = new Kimlik();
    private Adres adres = new Adres();
    private Iletisim iletisim = new Iletisim();
    private Kullanici selectedKullanici;
    private List<Kullanici> kullaniciList = new ArrayList<>();

    @Autowired
    public KullaniciController(KullaniciService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }

    public void onRedirect(){
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("kullaniciTanimla");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onKaydet(){

        if (kullanici.getKullaniciAdi()!=kullanici.getKullaniciAdi()){
            FacesContext.getCurrentInstance()
                    .addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_ERROR,"Kullanıcı Adı Hatalı,",""));
        }

        if (kimlik.getTcKimlikNo()!=null){
            kullanici.setKimlik(kimlik);
            kullaniciService.kaydet(kullanici);
            FacesContext.getCurrentInstance()
                    .addMessage(null,
                            new FacesMessage(FacesMessage.SEVERITY_INFO,"Kayıt Başarılı",""));
        }
    }

    public void onSil(){

    }

    public void onListele(){


    }

    public void onUpdate(){

    }




}
