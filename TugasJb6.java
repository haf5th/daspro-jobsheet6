import java.util.Scanner;

public class TugasJb6 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        double totaldiskon, totalharga, sblmdiskon, diskon = 0;
        String jenis;
        int jumlah;
        double harga = 20000;

        System.out.println("Masukkan Jenis Buku : ");
        jenis = input11.nextLine();
        System.out.println("Masukkan Jumlah Buku : ");
        jumlah = input11.nextInt();

        if (jenis.equalsIgnoreCase("kamus")) {
            if (jumlah > 2) {
                diskon = 0.12;
            }else
                diskon = 0.1;
        }
        else if (jenis.equalsIgnoreCase("novel")) {
            if (jumlah > 3) {
                diskon = 0.09;
            }else
                diskon = 0.08;
        }      
        else if (jumlah > 3) {
        diskon = 0.05;
        }
    
    sblmdiskon = (harga * jumlah);
    totaldiskon = (sblmdiskon * diskon);
    totalharga = (sblmdiskon - totaldiskon);
    System.out.println(diskon);
    System.out.println("Total Diskon : " + totaldiskon);
    System.out.println("Total Harga : Rp " + totalharga);

    }
}
