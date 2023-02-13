import java.io.IOException;
import java.util.Scanner;

public class week1 {
    public static void main(String[] args) throws IOException {

//        guesing game percabangan
        char huruf='K', tebakan;
        System.out.println(" diantara huruf A sampai Z. ");
        System.out.println(" tebak satu huruf: .... ");
        tebakan = (char) System.in.read();
        if(tebakan == huruf){
            System.out.println("benar");
        }
        else if (tebakan > huruf) {
            System.out.println("kegedean");
        }
        else if (tebakan < huruf) {
            System.out.println("kekecilan");
        }
        else {
            System.out.println("tidak ada");
        }
//        konverwsi nilai pake scanner
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nilai: ");
        int nilai = input.nextInt();
        if(nilai >= 90)
        {System.out.println("A");}
       else if (nilai >= 80 && nilai < 90)
       {System.out.println("B");}
       else if (nilai >= 60 && nilai < 80)
       {System.out.println("Nilai huruf: C");}
       else if (nilai >= 40 && nilai < 60)
       {System.out.println("Nilai huruf: D");}
       else
       {System.out.println("Nilai huruf: E");}

//        menguybah strin
        Scanner str = new Scanner(System.in);
        System.out.println("masukan huruf: ");
        String kata = str.nextLine();

        if (kata.length() > 10) {
            System.out.println("Panjang");
        } else if (kata.length() < 10) {
            System.out.println("Pendek");
        }
//        minimarket
        Scanner harga = new Scanner(System.in);
        System.out.println("masukan uang: ");
        int uang = harga.nextInt();
        int diskon = 0;

        if(uang >= 50000 && uang < 100000) {
             diskon = uang-(uang*10/100);
        }
        else if (uang >= 100000 && uang < 200000 ) {
            diskon =  (uang-(uang*10/100))*5/100 - ((uang-(uang*10/100))*5/100)*5/100;
        }
        else if (uang >= 200.000) {
            diskon = ((uang-(uang*10/100))-((uang-(uang*10/100))*5/100)) - ((uang-(uang*10/100))*5/100 - ((uang-(uang*10/100))*5/100)*5/100);

        }
        int pajak = diskon*10/100;
        int pajaktot = pajak + diskon;
        System.out.println("total akhir " + pajaktot);

    }
}
