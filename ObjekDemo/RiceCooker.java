package ObjekDemo;

public class RiceCooker {
  private String merek;
  private int kapasitas;
  private int daya;

  public void namaMerek(String newValue){
    merek=newValue;
  }

  public void kapasitasRiceCooker(int newValue){
    kapasitas=newValue;
  }

  public void dayaRiceCooker(int newValue){
    daya=newValue;
  }

  public void cetakStatus(){
    System.out.println("Merek: "+merek);
    System.out.println("Kapasitas: "+kapasitas+" liter");
    System.out.println("Daya: "+daya+" Watt");
  }
}
