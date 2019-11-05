package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */


public class Main {

    public static void main(String[] args) {
	// write your code here
        MainKarakter pu = new MainKarakter("Shinichi Kudo",  "ambisius", 21);
        pu.setNamaSamaran("Conan");
        pu.displayKarakter();
        System.out.println("Nama Samaran : "+ pu.getNamaSamaran());

        System.out.println("");

        KarakterPendukung pp = new KarakterPendukung("Kogoro Mouri","pantang Menyerah", 30);
        pp.setPanggilan("Heiji");
        pp.displayKarakter();
        System.out.println("Nama Panggilan : " + pp.getPanggilan());
        System.out.println("");
    }
}
