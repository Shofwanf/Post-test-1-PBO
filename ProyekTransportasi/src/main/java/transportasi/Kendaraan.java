/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportasi;

/**
 *
 * @author Asus
 */
public class Kendaraan {
    private String nomorKendaraan;
    private String jenisKendaraan; // Misalnya: Bus, Taksi, Angkot
    private int kapasitas;

    public Kendaraan(String nomorKendaraan, String jenisKendaraan, int kapasitas) {
        this.nomorKendaraan = nomorKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.kapasitas = kapasitas;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Kendaraan: " + nomorKendaraan);
        System.out.println("Jenis Kendaraan: " + jenisKendaraan);
        System.out.println("Kapasitas: " + kapasitas + " penumpang");
    }

    public String getNomorKendaraan() {
        return nomorKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }
}

