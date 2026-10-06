import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon = 0, totalBayar;
        int kembalian, kurang;

        // Input data
        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = sc.nextInt();

        // Hitung total harga dasar
        totalHarga = jumlahCup * hargaPerCup;

        // Pemilihan diskon (jika totalHarga >= 100000)
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        // Hitung total bayar
        totalBayar = totalHarga - diskon;

        // Output rincian pembayaran
        System.out.println("Total harga : Rp " + totalHarga);
        System.out.println("Diskon      : Rp " + diskon);
        System.out.println("Total bayar : Rp " + totalBayar);

        // Pemilihan kembalian / kekurangan pembayaran
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian   : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        sc.close();
    }
}