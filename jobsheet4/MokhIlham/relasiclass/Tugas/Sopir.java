package jobsheet4.MokhIlham.relasiclass.Tugas;

public class Sopir {
  private String nama;
  private String noLisensi;

  public Sopir(String nama, String noLisensi) {
    this.nama = nama;
    this.noLisensi = noLisensi;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }
  
  public String getNama() {
    return nama;
  }

  public void setNoLisensi(String noLisensi) {
    this.noLisensi = noLisensi;
  }
  
  public String getNoLisensi() {
    return noLisensi;
  }

  public String info() {
    String info = "";
    info += "Nama: " + nama + "\n";
    info += "No Lisensi: " + noLisensi + "\n";
    return info;
  }
}
