package jobsheet4.MokhIlham.relasiclass.Tugas;

public class PerusahaanTaxi {
  private String nama;
  private int jumlahGarasi;
  private Garasi garasi;

  public PerusahaanTaxi(String nama) {
    this.nama = nama;
  }

  public void setGarasi(Garasi garasi) {
    this.garasi = garasi;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public int getJumlahGarasi() {
    return jumlahGarasi;
  }

  public void setJumlahGarasi(int jumlahGarasi) {
    this.jumlahGarasi = jumlahGarasi;
  }

  public String info() {
    String info = "";
    info += "Nama perusahaan: " + nama + "\n";
    info += "Garasi: \n" + garasi.info() + "\n";
    return info;
  }
}
