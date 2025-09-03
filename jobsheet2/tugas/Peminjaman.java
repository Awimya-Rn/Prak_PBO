package jobsheet2.tugas;

public class Peminjaman {
  public int id;
  public String namaMember;
  public String namaGame;
  public int harga;

  public void tampilData(){
    System.out.println("Id              : " + id);
    System.out.println("Nama Member     : " + namaMember);
    System.out.println("Nama Game       : " + namaGame);
  }

  public int hitungHargaBayar(int lamaSewa){
    int totalHarga=lamaSewa*harga;
    return totalHarga;
  }
}
