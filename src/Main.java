import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String namaDepan = "Muhammad";
        String namaTengah = "Risky";
        String namaBelakang = "Perdana";

        int usia = 19;
        int targetTahunKuliah = 4;
        double ipk = 3.8889;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.println(namaDepan+namaTengah+namaBelakang );

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String  uniskaString = new String(uniskaChar);
        System.out.println(uniskaChar);
        System.out.println(uniskaString);

        String namaLengkap = namaDepan + " " + namaTengah + " " + namaBelakang;

        System.out.println(namaLengkap);
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("dan"));
        System.out.println(namaLengkap.substring(10));
        System.out.println(namaLengkap.substring(10,13));
        System.out.println(namaLengkap.replace("Ris","Barr"));
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(10));

        String[] namaArray = namaLengkap.split( " ");

        for(String nama: namaArray)
            System.out.println(nama);

    }
}
