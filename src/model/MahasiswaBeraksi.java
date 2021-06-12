package model;

import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        //instance - pembuatan object
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630366";
        mahasiswa.nama = "Awal";
        mahasiswa.tanggallahir = new Date();

        System.out.println("NPM \t\t\t : " + mahasiswa.npm);
        System.out.println("Nama \t\t\t :" + mahasiswa.nama);
        System.out.println("Tanggal Lahir \t :" + mahasiswa.tanggallahir);


    }
}
