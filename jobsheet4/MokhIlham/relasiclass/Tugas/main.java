package jobsheet4.MokhIlham.relasiclass.Tugas;

public class main {
  public static void main(String[] args) {
    PerusahaanTaxi perusahaan1 = new PerusahaanTaxi("Shell");
    Garasi garasi1 = new Garasi("Garasi A", "Jakarta", 5);
    perusahaan1.setGarasi(garasi1);

    Sopir sopir1 = new Sopir("John Doe", "SIM123456");
    Taxi taxi1 = new Taxi("B 1234 CD", "Toyota", sopir1);
    garasi1.tambahTaxi(taxi1, 1, sopir1);

    Sopir sopir2 = new Sopir("Jane Smith", "SIM654321");
    Taxi taxi2 = new Taxi("B 5678 EF", "Honda", sopir2);
    garasi1.tambahTaxi(taxi2, 2, sopir2);
    System.out.println(perusahaan1.info());
  }
}
