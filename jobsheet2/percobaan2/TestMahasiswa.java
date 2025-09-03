package jobsheet2.percobaan2;

public class TestMahasiswa {
  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa();
    mhs1.nim = 101;
    mhs1.nama = "Lestari";
    mhs1.alamat = "Jl. Vinolina No 1A";
    mhs1.kelas = "1A";
    mhs1.tampilBiodata();
    System.out.println("------------------------------");
    Mahasiswa mhs2 = new Mahasiswa();
    mhs2.nim = 102;
    mhs2.nama = "Ayu";
    mhs2.alamat = "Jl. Teratai No 22";
    mhs2.kelas = "1B";
    mhs2.tampilBiodata();
    System.out.println("------------------------------");
    Mahasiswa mhs3 = new Mahasiswa();
    mhs3.nim = 103;
    mhs3.nama = "Budi";
    mhs3.alamat = "Jl. Soekarno Hatta No 11";
    mhs3.kelas = "1C";
    mhs3.tampilBiodata();
  }
}
