package JobSheet6.HewanOOP4;

public class Main {
  public static void main(String[] args) {
    Kucing kucing = new Kucing("Milo", 2, "Oranye");
    kucing.info();
    kucing.berjalan();
    System.out.println(kucing.umur);
    Anjing anjing = new Anjing("Dio", 2, "Keriting");
    anjing.info();
    System.out.println(anjing.getJenisBulu());
    anjing.berjalan();
  }
}
