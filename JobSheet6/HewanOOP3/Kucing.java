package JobSheet6.HewanOOP3;

class Kucing extends Mamalia {
  public Kucing(String nama, int umur){
    super(nama, umur);
    System.out.println("Konstruktor Kucing dipanggil");
  }

  void mengeong() {
    System.out.println("Meong!");
  }
}
