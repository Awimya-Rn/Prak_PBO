package ObjekDemo;

public class TasGunung extends Tas {
  private boolean rainCover;
  private int kompartemen;

  public void adaRainCover(boolean isThere){
    rainCover=isThere;
  }

  public void jumlahKompartemen(int newValue){
    kompartemen=newValue;
  }

  public void cetakStatus(){
    super.cetakStatus();
    System.out.println("Rain Cover: "+rainCover);
    System.out.println("Jumlah Kompartemen: "+kompartemen);
  }
}
