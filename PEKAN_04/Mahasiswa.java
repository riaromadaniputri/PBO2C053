import java.util.Scanner;

class Mahasiswa {
    
    // Modifier private
    private String nama;
    private String nim;
    private String jurusan;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method untuk menampilkan data
    public void tampilData() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }
}

public class MainMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Jurusan: ");
        String jurusan = input.nextLine();

        // Membuat objek dengan constructor
        Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan);

        System.out.println("\nData Mahasiswa:");
        mhs.tampilData();
    }
}
