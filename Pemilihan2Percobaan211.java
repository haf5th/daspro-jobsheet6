import java.util.Scanner;

public class Pemilihan2Percobaan211 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int pilihan_menu;
        String member, pembayaran;
        double diskon, harga, total_bayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea) ");
        System.out.println("--------------------------------------");
        System.out.println("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input11.nextInt();
        input11.nextLine();
        System.out.println("Apakah punya member (y/n) ? =");
        member = input11.nextLine();
        System.out.println("Pembayaran melalui apa (QRIS/Tunai)");
        pembayaran = input11.nextLine();
        System.out.println("--------------------------------------");
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling  = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon =" + total_bayar);
            if (pembayaran.equalsIgnoreCase("QRIS")) {
                total_bayar -= 1000;
                System.out.println("Pembayaran menggunakan QRIS = " + total_bayar);
           }
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling  = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            System.out.println("Total bayar = " + harga);
            if (pembayaran.equalsIgnoreCase("QRIS")) {
                harga -= 1000;
                System.out.println("Pembayaran menggunakan QRIS = " + harga);
            } else {
                System.out.println("Member tidak valid");
            }
            System.out.println("--------------------------------------");
        }

    }
}

