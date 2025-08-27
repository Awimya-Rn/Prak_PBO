package ObjekDemo;

public class TasPinggang extends Tas{
  private boolean slotLaptop;
  private int panjangTali;

  public void adaSlotLaptop(boolean isThere){
    slotLaptop=isThere;
  }

  public void aturPanjangTali(int increment){
    panjangTali=increment;
  }

  public void cetakStatus(){
    super.cetakStatus();
    System.out.println("Slot Laptop: "+slotLaptop);
    System.out.println("Panjang tali: "+panjangTali+" cm");
  }
} 