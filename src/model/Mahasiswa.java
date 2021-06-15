package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    }
}
