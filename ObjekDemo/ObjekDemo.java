package ObjekDemo;

public class ObjekDemo {
  public static void main(String[] args) {
    Tas tas1 = new Tas();
    TasPinggang tas2 = new TasPinggang();
    TasGunung tas3 = new TasGunung();
    Galon galon = new Galon();
    RiceCooker riceCooker = new RiceCooker();

    tas1.namaMerek("Asus");
    tas1.kapasitas(20);
    tas1.cetakStatus();
    System.out.println();

    tas2.namaMerek("Alto");
    tas2.kapasitas(5);
    tas2.aturPanjangTali(117);
    tas2.adaSlotLaptop(false);
    tas2.cetakStatus();
    System.out.println();
    
    tas3.namaMerek("Rei");
    tas3.kapasitas(30);
    tas3.jumlahKompartemen(6);
    tas3.adaRainCover(true);
    tas3.cetakStatus();
    System.out.println();
    
    galon.namaMerek("Le Minerale");
    galon.kapasitasGalon(15);
    galon.isiAir(14);
    galon.cetakStatus();
    System.out.println();

    riceCooker.namaMerek("KIRIN");
    riceCooker.kapasitasRiceCooker(1);
    riceCooker.dayaRiceCooker(350);
    riceCooker.cetakStatus();
  }
}
