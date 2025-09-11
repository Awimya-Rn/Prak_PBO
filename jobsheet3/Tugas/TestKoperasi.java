package jobsheet3.Tugas;
import java.util.Scanner;

public class TestKoperasi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int pinjaman;
    int angsuran;
    Anggota donny = new Anggota("111333444", "Donny", 5000000);
    System.out.println("Nama Anggota: " + donny.getNama());
    System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

    System.out.print("\nInput Pinjaman : ");
    pinjaman = input.nextInt();
    input.nextLine();
    donny.pinjam(pinjaman);
    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    System.out.print("\nMasukkan jumlah angsuran: ");
    angsuran = input.nextInt();
    input.nextLine();
    donny.angsur(angsuran);
    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    System.out.print("\nMasukkan jumlah angsuran berikutnya: ");
    angsuran = input.nextInt();
    input.nextLine();
    donny.angsur(angsuran);
    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    input.close();
  }
}
