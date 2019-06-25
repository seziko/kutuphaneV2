package com.ramazan.spring.jsf.example.service;

import com.ramazan.spring.jsf.example.dao.KullaniciDAO;
import com.ramazan.spring.jsf.example.entity.Kullanici;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KullaniciServiceImpl implements KullaniciService {

    private final KullaniciDAO kullaniciDAO;

    public KullaniciServiceImpl(KullaniciDAO kullaniciDAO) {
        this.kullaniciDAO = kullaniciDAO;
    }

    @Override
    public List<Kullanici> findAll() {
        return kullaniciDAO.findAll();
    }

    @Override
    public Kullanici kaydet(Kullanici kullanici) {
        return kullaniciDAO.save(kullanici);
    }

    @Override
    public void sil(Kullanici kullanici) {

        if (kullanici != null && kullanici.getId() != null) {
            kullaniciDAO.delete(kullanici);
        }
    }

    @Override
    public Kullanici update(Kullanici kullanici) {

        return kullaniciDAO.save(kullanici);

    }

    @Override
    public Kullanici findById(Long id) {
        return kullaniciDAO.findById(id).get();
    }

    @Override
    public Kullanici giris(Kullanici kullanici) {
        if (kullanici.getPassword() == kullanici.getPassword()
                && kullanici.getKullaniciAdi() == kullanici.getKullaniciAdi()) {
            return kullaniciDAO.save(kullanici);
        }
        return null;
    }
}

