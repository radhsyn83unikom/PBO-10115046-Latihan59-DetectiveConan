package com.radhsyn83;

public class KarakterPendukung extends Karakter {
    private String panggilan;

    public KarakterPendukung(String name, String sifat, int umur) {
        super(name, sifat, umur);
        this.nama=name;
        this.sifat=sifat;
        this.umur=umur;
    }

    public String getPanggilan() {
        return panggilan;
    }

    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }



}