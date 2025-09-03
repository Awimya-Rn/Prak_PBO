package jobsheet2.tugas;

public class Barang {
  public String kode;
  public String namaBarang;
  public int hargaDasar;
  public float diskon;

  public int hitungHargaJual(){
    int hargaJual =  hargaDasar-(((int) diskon/100)*hargaDasar);
    return hargaJual;
  }

  public void tampilData(){
    System.out.println("Kode: "+kode);
    System.out.println("Nama Barang: "+namaBarang);
    System.out.println("Harga Dasar: "+hargaDasar);
    System.out.println("Diskon: "+diskon);
  }
}
