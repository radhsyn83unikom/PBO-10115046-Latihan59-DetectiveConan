package com.radhsyn83;

public class MainKarakter extends Karakter{
    private String namaSamaran;

    public MainKarakter(String name, String sifat, int umur) {
        super(name, sifat, umur);
        this.nama=name;
        this.sifat=sifat;
        this.umur=umur;
    }

    public String getNamaSamaran() {
        return namaSamaran;
    }

    public void setNamaSamaran(String namaSamaran) {
        this.namaSamaran = namaSamaran;
    }


}