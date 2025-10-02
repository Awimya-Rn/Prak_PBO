package JobSheet6.KendaraanOOP;

public class Main {
  public static void main(String[] args) {
    Mobil mobil = new Mobil("Toyota", 2022, 4);
    Motor motor = new Motor("Honda", 2023, 150);
    Truk truk = new Truk("Fuso", 2020, 7.0);

    mobil.info();
    mobil.jalankan();
    System.out.println("-----");
    motor.info();
    motor.jalankan();
    System.out.println("-----");
    truk.info();
    truk.jalankan();
  }
}
