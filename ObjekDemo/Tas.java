package ObjekDemo;

public class Tas {
  private String merek;
  private int kapasitas;

  public void namaMerek(String newValue) {
    merek=newValue;
  }

  public void kapasitas(int newValue) {
    kapasitas=newValue;
  }

  public void cetakStatus(){
    System.out.println("Merek: "+merek);
    System.out.println("Kapasitas: "+kapasitas);
  }
}
