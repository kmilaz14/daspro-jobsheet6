import java.util.Scanner;

public class TugasJobsheet6_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String jenisBuku;
        int jmlhBuku;
        double diskon = 0;
        double totalBayar;
        int harga = 20000;

        System.out.print("Jenis buku yang dibeli: ");
        jenisBuku = sc.nextLine();
        System.out.print("Jumlah buku yang dibeli: ");
        jmlhBuku = sc.nextInt();

        int ttlJumlah = jmlhBuku * harga;

        if (jenisBuku.equalsIgnoreCase("kamus") ) {
            if (jmlhBuku > 2) {
                diskon = ttlJumlah * (0.12);
            } else {
                diskon = ttlJumlah * 0.10;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jmlhBuku > 3) {
                diskon = ttlJumlah * (0.07 + 0.02);
            } else {
                diskon = ttlJumlah * (0.07 + 0.01);
            }
            
        } else if (jmlhBuku > 3) {
            diskon = ttlJumlah * 0.05;
        } 
        
        totalBayar = ttlJumlah - diskon;

        System.out.println("Banyaknya diskon: " + diskon);
        System.out.println("Total yang harus dibayar: " + totalBayar);
        
    }
}
