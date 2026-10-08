import java.util.Scanner;

public class StudiKasus206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // Deklarasi Variabel
    String namaMahasiswa;
    String jenisKegiatan;
    int jumlahDokumen;
    int peringkatJuara;
    int statusPendanaanPKM;

    // Input Program
    System.out.println("===== Selamat datang di laman pengecekan status dana =====");
    System.out.println("Masukkan Nama Mahasiswa: ");
    namaMahasiswa = sc.nextLine();
    System.out.println("Masukkan Jenis Kegiatam (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
    jenisKegiatan = sc.nextLine();
    System.out.println("Masukkan jumlah dokumen yang di upload: ");
    jumlahDokumen = sc.nextInt();
    System.out.println("Masukkan Status Pendanaan PKM (1 = lolos atau 0 = tidak lolos): ");
    statusPendanaanPKM = sc.nextInt();
    System.out.println("Masukkan peringkat juara: ");
    peringkatJuara = sc.nextInt();
    
    // Proses Program
    if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri") || jenisKegiatan.equalsIgnoreCase("Lainnya")) {
        System.out.println("Jenis Kegiatan Diterima");
        if (peringkatJuara <= 3) {
            System.out.println("Peringkat diterima lanjut ke tahap selanjutnya");
            if (jumlahDokumen == 4) {
                System.out.println("Dokumen lengkap. Dana Penghargaan dapat diberikan");
            }else if (jumlahDokumen == 3) {
                System.out.println("Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan");
            }else if (jumlahDokumen == 2) {
                System.out.println("Dokuemn tidak lengkap (kurang 2 dokumen). Dana penghargaan tidak diberikan");
            }else if (jumlahDokumen == 1) {
                System.out.println(" Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan");
            }else{
                System.out.println("Mana Dokumennya!!!");   
            }
        }else{ 
            System.out.println("Peringkat juara tidak valid. Dana tidak diberikan");
        }
    }
    else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
        if (statusPendanaanPKM == 1) {
            if (jumlahDokumen >= 4) {
                System.out.println("Dokumen lengkap. Dana Penghargaan dapat diberikan");
            }else if (jumlahDokumen == 3) {
                System.out.println("Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidka diberikan");
            }else if (jumlahDokumen == 2) {
                System.out.println("Dokuemn tidak lengkap (kurang 2 dokumen). Dana penghargaan tidak diberikan");
            }else if (jumlahDokumen == 1) {
                System.out.println(" Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan");
            }else{
                System.out.println("Dokumen");   
            }
        }else{
            System.out.println("Status: Tidak lolos pendanaan. Dana tidak diberikan kepada tim.");
        }
    }else{ 
        System.out.println("Jenis Kegiatan Tidak Memperoleh Dana Penghargaan.");   
        }
sc.close();
    }
}