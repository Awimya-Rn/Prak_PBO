package jobsheet4.MokhIlham.relasiclass.Tugas;

public class Taxi {
  private String noPolisi;
  private String merk;
  private Sopir sopir;

  public Taxi(String noPolisi, String merk, Sopir sopir) {
    this.noPolisi = noPolisi;
    this.merk = merk;
    this.sopir = sopir;
  }

  public void setNoPolisi(String noPolisi) {
    this.noPolisi = noPolisi;
  }

  public String getNoPolisi() {
    return noPolisi;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }

  public String getMerk() {
    return merk;
  }

  public String info() {
    String info = "";
    info += "No Polisi: " + noPolisi + "\n";
    info += "Merk: " + merk + "\n";
    info += "Sopir: " + sopir.info() + "\n";
    return info;
  }
}
