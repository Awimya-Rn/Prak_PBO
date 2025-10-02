package JobSheet6.HewanOOP3;

class Anjing extends Mamalia {
  public Anjing(String nama, int umur){
    super(nama, umur);
    System.out.println("Konstruktor Anjing dipanggil");
  }

  void menggonggong() {
    System.out.println("Guk!");
  }
}
