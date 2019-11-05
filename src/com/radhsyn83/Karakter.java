package com.radhsyn83;

public class Karakter {
    protected String nama;
    protected String sifat;
    protected int umur;

    public Karakter(String name, String sifat, int umur){
        this.nama=name;
        this.sifat=sifat;
        this.umur=umur;
    }
    public void displayKarakter(){
        System.out.println("Nama : "+nama);
        System.out.println("sifat : "+sifat);
        System.out.println("umur : "+umur);
    }
}
