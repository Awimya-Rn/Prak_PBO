package jobsheet4.MokhIlham.relasiclass.percobaan1;

public class Laptop {
  private String merk;
  private Processor processor;

  public Laptop() {

  }

  public Laptop(String merk, Processor processor) {
    this.merk = merk;
    this.processor = processor;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }

  public void setProcessor(Processor processor) {
    this.processor = processor;
  }

  public String getMerk() {
    return merk;
  }

  public Processor getProcessor() {
    return processor;
  }

  public void info(){
    System.out.printf("Merk Laptop: %s\n", merk);
    processor.info();
  }
}
