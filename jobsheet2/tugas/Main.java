package jobsheet2.tugas;

public class Main {
  public static void main(String[] args) {
    
    Peminjaman pnjm = new Peminjaman();
    pnjm.id = 1;
    pnjm.namaMember = "Rizky";
    pnjm.namaGame = "Omori";
    pnjm.harga = 10000;
    pnjm.tampilData();
    System.out.println("Total Bayar: " + pnjm.hitungHargaBayar(3));
    System.out.println();
    
    Barang brng = new Barang();
    brng.kode = "BRG001";
    brng.namaBarang = "Buku";
    brng.hargaDasar = 20000;
    brng.diskon = 10;
    brng.tampilData();
    System.out.println("Harga Jual: " + brng.hitungHargaJual());
    System.out.println();
    
    Lingkaran lngkrn = new Lingkaran();
    lngkrn.r = 7;
    lngkrn.phi = 3.14;
    System.out.println("Luas Lingkaran: " + lngkrn.hitungLuas());
    System.out.println("Keliling Lingkaran: " + lngkrn.hitungKeliling());
  }
}

