package jobsheet4.MokhIlham.relasiclass.percobaan4;

public class Gerbong {
  private String kode;
  private Kursi[] arrayKursi;

  public Gerbong(String kode, int jumlah) {
    this.kode = kode;
    this.arrayKursi = new Kursi[jumlah];
    initKursi();
  }

  private void initKursi() {
    for (int i = 0; i < this.arrayKursi.length; i++) {
      this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
    }
  }

  public void setKode(String kode) {
    this.kode = kode;
  }

  public String getKode() {
    return kode;
  }

  public void setPenumpang(Penumpang penumpang, int nomor) {
    this.arrayKursi[nomor - 1].setPenumpang(penumpang);
  }

  public Kursi[] getArrayKursi() {
    return arrayKursi;
  }

  public String info() {
    String info = "";
    info += "Kode: " + this.kode + "\n";
    for (Kursi kursi : this.arrayKursi) {
      info += kursi.info();
    }
    return info;
  }
}
