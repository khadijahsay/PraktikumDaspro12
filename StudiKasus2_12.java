import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data dasar
        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen: ");
        int jumlahDokumen = sc.nextInt();

        // Variabel penanda kelayakan
        boolean layakDapatDana = false;
        String alasan = "";

        // Pemilihan Bersarang (Nested IF)
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Peringkat juara: ");
            int peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    layakDapatDana = true;
                } else {
                    alasan = "Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                alasan = "Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).";
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            int statusPKM = sc.nextInt();

            if (statusPKM == 1) {
                if (jumlahDokumen == 4) {
                    layakDapatDana = true;
                } else {
                    alasan = "Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                alasan = "Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).";
            }

        } else {
            alasan = "Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).";
        }

        // Output Status Akhir
        if (layakDapatDana) {
            System.out.println("Status: Berhak memperoleh dana penghargaan.");
        } else {
            System.out.println("Status: " + alasan);
        }

        sc.close();
    }
}