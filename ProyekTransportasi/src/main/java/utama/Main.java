/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utama;

import sistem.SistemTransportasi;
import transportasi.Kendaraan;
import java.util.*;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        SistemTransportasi sistem = new SistemTransportasi();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Menambahkan kendaraan awal
        Kendaraan bus = new Kendaraan("KT1122BS", "Bus", 40);
        Kendaraan taksi = new Kendaraan("KT2233TK", "Taksi", 4);
        Kendaraan angkot = new Kendaraan("KT3344AT", "Angkot", 7);

        sistem.tambahKendaraan(bus);
        sistem.tambahKendaraan(taksi);
        sistem.tambahKendaraan(angkot);

        while (running) {
            System.out.println("=== Menu Sistem Pengelolaan Transportasi Umum ===");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Tampilkan Semua Kendaraan");
            System.out.println("3. Cari Kendaraan");
            System.out.println("4. Hapus Kendaraan");
            System.out.println("5. Total Kendaraan");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi (1-6): ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (opsi) {
                case 1: // Tambah Kendaraan
                    System.out.print("Masukkan nomor kendaraan: ");
                    String nomorKendaraan = scanner.nextLine();
                    System.out.print("Masukkan jenis kendaraan: ");
                    String jenisKendaraan = scanner.nextLine();
                    System.out.print("Masukkan kapasitas kendaraan: ");
                    int kapasitas = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline

                    Kendaraan kendaraan = new Kendaraan(nomorKendaraan, jenisKendaraan, kapasitas);
                    sistem.tambahKendaraan(kendaraan);
                    System.out.println("Kendaraan berhasil ditambahkan!");
                    break;

                case 2: // Tampilkan Semua Kendaraan
                    sistem.tampilkanSemuaKendaraan();
                    break;

                case 3: // Cari Kendaraan
                    System.out.print("Masukkan nomor kendaraan yang ingin dicari: ");
                    String nomorCari = scanner.nextLine();
                    Kendaraan hasilCari = sistem.cariKendaraan(nomorCari);
                    if (hasilCari != null) {
                        System.out.println("Kendaraan ditemukan:");
                        hasilCari.tampilkanInfo();
                    } else {
                        System.out.println("Kendaraan tidak ditemukan.");
                    }
                    break;

                case 4: // Hapus Kendaraan
                    System.out.print("Masukkan nomor kendaraan yang ingin dihapus: ");
                    String nomorHapus = scanner.nextLine();
                    sistem.hapusKendaraan(nomorHapus);
                    break;

                case 5: // Total Kendaraan
                    System.out.println("Total kendaraan: " + SistemTransportasi.getTotalKendaraan());
                    break;

                case 6: // Keluar
                    running = false;
                    break;

                default:
                    System.out.println("Opsi tidak valid! Silakan pilih kembali.");
                    break;
            }
        }

        // Menutup scanner
        scanner.close();
        System.out.println("Program selesai. Terima kasih!");
    }
}