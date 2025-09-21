package jobsheet4.MokhIlham.relasiclass.Tugas;

public class Garasi {
  private String namaGarasi;
  private String lokasi;
  private Taxi[] daftarTaxi;

  public Garasi(String namaGarasi, String lokasi, int kapasitas) {
    this.namaGarasi = namaGarasi;
    this.lokasi = lokasi;
    this.daftarTaxi = new Taxi[kapasitas];
    initTaxi();
  }

  public void initTaxi() {
    for (int i = 0; i < this.daftarTaxi.length; i++) {
      this.daftarTaxi[i] = null;
    }
  }

  public void setNamaGarasi(String namaGarasi) {
    this.namaGarasi = namaGarasi;
  }

  public String getNamaGarasi() {
    return namaGarasi;
  }

  public void setLokasi(String lokasi) {
    this.lokasi = lokasi;
  }

  public String getLokasi() {
    return lokasi;
  }

  public void tambahTaxi(Taxi taxi, int nomor, Sopir sopir) {
    if (this.daftarTaxi[nomor-1]!=null) {
      return;
    }
    this.daftarTaxi[nomor-1] = taxi;
  }

  public String info() {
    String info = "";
    info += "Nama Garasi: " + namaGarasi + "\n";
    info += "Lokasi: " + lokasi + "\n";
    info += "Daftar Taxi:\n";
    for (int i = 0; i < this.daftarTaxi.length; i++) {
      if (this.daftarTaxi[i] != null) {
        info += "Taxi nomor " + (i + 1) + ":\n" + this.daftarTaxi[i].info() + "\n";
      } else {
        info += "Taxi nomor " + (i + 1) + ": Kosong\n";
      }
    }
    return info;
  }
}
