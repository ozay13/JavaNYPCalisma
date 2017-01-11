/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classification;

/**
 *
 * @author ozaytunctan13
 */
public class Ogrenci {

    private String ad;
    private String soyad;
    private String cinsiyet;
    private static int session_id;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyad, String cinsiyet) {
        setAll(ad, soyad, cinsiyet);
        this.setSession_id(++this.session_id);
    }

    public int getSession_id() {
        return session_id;
    }

    public void setSession_id(int session_id) {
        this.session_id = session_id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    @Override
    public String toString() {
        String m = "Ogrenci Values:\n"
                + "Session_id:" + this.getSession_id()
                + "\nAd:" + this.getAd()
                + "\nSoyad:" + this.getSoyad()
                + "\nCinsiyet:" + this.getCinsiyet();
        return m;
    }

    public int compareTo(Ogrenci ogr) {
        int ret = (this.session_id < ogr.session_id) ? -1 : (this.session_id == ogr.session_id) ? 0 : 1;
        return ret;
    }

    public boolean equals(Ogrenci ogr) {
        boolean ret = false;
        if (ogr.session_id != this.session_id) {
            return ret;
        }
        if (!(ogr.getAd().equals(this.getAd())) || !(ogr.getSoyad().equals(this.getSoyad()))) {
            return ret;
        }
        return !ret;
    }

    public Ogrenci clone() {
        Ogrenci ogr = new Ogrenci();
        ogr.setAll(this.ad, this.soyad, this.cinsiyet);
        return ogr;
    }

    private void setAll(String ad, String soyad, String cinsiyet) {
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
    }
}
