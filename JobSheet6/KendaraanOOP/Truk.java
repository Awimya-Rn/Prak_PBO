package JobSheet6.KendaraanOOP;

class Truk extends Kendaraan {
  private double kapasitasMuatanTon;

  public Truk(String merk, int tahunProduksi, double kapasitasMuatanTon){
    super(merk, tahunProduksi);
    this.kapasitasMuatanTon = kapasitasMuatanTon;
  }

  @Override
  void jalankan(){
    System.out.println("Truk "+merk+" berjalan...");
  }

  void info(){
    super.info();
    System.out.println("Kapasitas Muatan ton: "+kapasitasMuatanTon);
  }
}
