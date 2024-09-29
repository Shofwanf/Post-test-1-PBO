# Post-test-1-PBO
## Proyek Transportasi Umum
### 1. Kendaraan.java
Kelas `Kendaraan` memiliki tiga properti:
- `nomorKendaraan`: String yang menyimpan nomor kendaraan.
- `jenisKendaraan`: String yang menyimpan jenis kendaraan.
- `kapasitas`: Integer yang menyimpan kapasitas kendaraan.

**Metode:**
- `tampilkanInfo()`: Menampilkan informasi kendaraan.

### 2. SistemTransportasi.java
Kelas `SistemTransportasi` bertanggung jawab untuk mengelola daftar kendaraan. Properti yang dimiliki:
- `daftarKendaraan`: ArrayList yang menyimpan objek `Kendaraan`.
- `totalKendaraan`: Static integer untuk menyimpan total kendaraan yang terdaftar.

**Metode:**
- `tambahKendaraan(Kendaraan k)`: Menambahkan kendaraan ke daftar.
- `hapusKendaraan(String nomorKendaraan)`: Menghapus kendaraan berdasarkan nomor.
- `tampilkanSemuaKendaraan()`: Menampilkan semua kendaraan yang terdaftar.
- `cariKendaraan(String nomorKendaraan)`: Mencari kendaraan berdasarkan nomor.

### 3. Main.java
Kelas `Main` adalah titik masuk program. Di sini, pengguna dapat:
- Menambahkan kendaraan baru.
- Menampilkan semua kendaraan.
- Mencari kendaraan berdasarkan nomor.
- Menghapus kendaraan dari daftar.
- Menampilkan total kendaraan yang terdaftar.
