package jobsheet3.Tugas;

public class Anggota {
  private String noKTP;
  private String nama;
  private int limitPinjaman;
  private int pinjaman;

  public Anggota(String noKTP, String nama, int limitPinjaman) {
    this.noKTP = noKTP;
    this.nama = nama;
    this.limitPinjaman = limitPinjaman;
  }

  public int getLimitPinjaman() {
    return limitPinjaman;
  }

  public String getNama() {
    return nama;
  }

  public int getJumlahPinjaman() {
    return pinjaman;
  }

  public void pinjam(int uang) {
    if (uang > limitPinjaman) {
      System.out.println("Maaf, jumlah pinjaman melebihi limit.");
    } else {
      pinjaman += uang;
    }
  }

  public void angsur(int uang) {
    if (pinjaman==(0.1*pinjaman)) {
      System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
    } else {
      pinjaman -= uang;
      if (pinjaman < 0) {
        pinjaman = 0;
      }
    }
  }
}
