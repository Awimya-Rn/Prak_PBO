package ObjekDemo;

public class Galon {
  private String merek;
  private int kapasitas;
  private int air;

  public void namaMerek(String newValue){
    merek=newValue;
  }

  public void kapasitasGalon(int newValue){
    kapasitas=newValue;
  }

  public void isiAir(int increment){
    if (kapasitas!=air) {
      air=air+increment;
    } else{
      System.out.println("Sudah penuh");
    }
  }

  public void cetakStatus(){
    System.out.println("Merek: "+merek);
    System.out.println("Kapasitas: "+kapasitas+" liter");
    System.out.println("Jumlah air: "+air+" liter");
  }
}
