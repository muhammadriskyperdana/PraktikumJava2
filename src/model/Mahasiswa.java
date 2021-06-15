package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm;
    String nama;
    Date tanggallahir;

    void tampilkanAtribut() {
        String polaTanggal = "dd-MM-yyy";
        SimpleDateFormat sdf = new SimpleDateFormat(polaTanggal);


        System.out.println("NPM \t\t\t : " + this.npm);
        System.out.println("Nama \t\t\t :" + this.nama);
        System.out.println("Tanggal Lahir \t :" + sdf.format(this.tanggallahir));
        System.out.println("Usia : \t\t\t : " + hitungUsia());
    }
    String getNama(){
        return nama;
    }

    int hitungUsia(){

        Calendar tanggalLahir = Calendar.getInstance();
        tanggalLahir.setTime(this.tanggallahir);
        Calendar tanggalIni = Calendar.getInstance();

        int tahunLahir = tanggalLahir.get(Calendar.YEAR);
        int tahunIni = tanggalIni.get(Calendar.YEAR);

        int selisihTahun = tahunIni - tahunLahir;

        int bulanLahir = tanggalLahir.get(Calendar.MONTH);
        int bulanIni = tanggalIni.get(Calendar.MONTH);

        if(bulanIni<bulanLahir){
            selisihTahun--;
        }else{
            int tanggalTanggalLahir = tanggalLahir.get(Calendar.DAY_OF_MONTH);
            int tanggalTanggalIni = tanggalIni.get(Calendar.DAY_OF_MONTH);
            if(bulanIni == bulanLahir){
                if(tanggalTanggalIni < tanggalTanggalLahir){
                    selisihTahun--;
                }
            }
        }

        return selisihTahun;

    }
    public Mahasiswa() {
        System.out.println("Ini dari constructor");

    }
}
