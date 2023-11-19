import java.util.Scanner;

public class HitungNilaiMhs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("* Inputkan Data Mahasiswa *\n");
        System.out.print("NAMA: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.println("====================");

        System.out.print("* Data Nilai Mahasiswa *\n");
        System.out.print("Nilai Tubes: ");
        double nilaiTubes = input.nextDouble();
        System.out.print("Nilai Quiz: ");
        double nilaiQuiz = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        System.out.println("====================");

        double totalNilai = (0.30 * nilaiTubes) + (0.10 * nilaiQuiz) + (0.10 * nilaiTugas) + (0.25 * nilaiUTS) + (0.25 * nilaiUAS);

        System.out.println("NAMA: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek:" + totalNilai);
        System.out.println("====================");
        input.close();
    }
}

