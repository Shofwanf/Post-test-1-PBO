/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

import java.util.*;
import transportasi.Kendaraan;

/**
 *
 * @author Asus
 */
public class SistemTransportasi {
    private ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
    private static int totalKendaraan = 0;

    public void tambahKendaraan(Kendaraan k) {
        daftarKendaraan.add(k);
        totalKendaraan++;
    }

    public void hapusKendaraan(String nomorKendaraan) {
        for (Kendaraan k : daftarKendaraan) {
            if (k.getNomorKendaraan().equals(nomorKendaraan)) {
                daftarKendaraan.remove(k);
                totalKendaraan--;
                System.out.println("Kendaraan dengan nomor " + nomorKendaraan + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Kendaraan tidak ditemukan.");
    }

    public void tampilkanSemuaKendaraan() {
        System.out.println("=== Daftar Kendaraan Umum ===");
        for (Kendaraan k : daftarKendaraan) {
            k.tampilkanInfo();
            System.out.println("--------------------");
        }
    }

    public Kendaraan cariKendaraan(String nomorKendaraan) {
        for (Kendaraan k : daftarKendaraan) {
            if (k.getNomorKendaraan().equals(nomorKendaraan)) {
                return k;
            }
        }
        return null;
    }

    public static int getTotalKendaraan() {
        return totalKendaraan;
    }
}