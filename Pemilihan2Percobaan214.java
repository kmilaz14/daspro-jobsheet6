import java.util.Scanner;

public class Pemilihan2Percobaan214 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        
        int pilihan_menu;
        double harga = 0, total_bayar = 0;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input14.nextInt();
        input14.nextLine();
        System.out.print("Apakah punya member (y/n)?= ");
        String member = input14.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            double diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar!");
                return;
            }

            total_bayar = harga - (harga*diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }


        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar!");
                return;
            }
            
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }

        System.out.println("--------------------------------------");
    }
}

