import java.util.Scanner;

public class StudiKasus106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi Variabel
        int hargaperCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;

        // Input Program
        System.out.println("==== SELAMAT DATANAG DI KASIR KAFE ====");
        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayar: ");
        uangBayar = sc.nextInt();

        // Proses Program
        totalHarga = jumlahCup * hargaperCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            System.out.println("Mendapat diskon 10%");
            diskon = totalHarga * 10 / 100;
        } else {
            System.out.println("Tidak mendapat diskon");
        }
        totalBayar = totalHarga - diskon;

        // Output Program
        System.out.println("Total harga yang harus dibayar adalah " + totalHarga);
        System.out.println("Total diskon yang didapatkan adalah: " + diskon);
        System.out.println("Total bayar setelah diskon adalah: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Uang kembalian yang harus dikembalikan adalah: " + kembalian);
        }else{ 
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang sejumlah Rp: " + kurang);
        sc.close(); 
        }
    }

}
