package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyy";
        SimpleDateFormat sdf = new SimpleDateFormat(polaTanggal);

        //instance - pembuatan object
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630366";
        mahasiswa.nama = "Awal";
        try {
            mahasiswa.tanggallahir = sdf.parse("02-01-2000");

            System.out.println("NPM \t\t\t : " + mahasiswa.npm);
            System.out.println("Nama \t\t\t :" + mahasiswa.nama);
            System.out.println("Tanggal Lahir \t :" + sdf.format(mahasiswa.tanggallahir));
        } catch (ParseException e) {
            System.err.println("Format tanggal tidak sesuai");
        }



    }
}
