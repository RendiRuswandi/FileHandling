import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan NAMA: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan UMUR: ");
        String umur = scanner.nextLine();

        System.out.print("Masukkan PRODI: ");
        String prodi = scanner.nextLine();

        String line = nim + "," + nama + "," + umur + "," + prodi;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))) {
            bw.newLine();
            bw.write(line);
            System.out.println("Data berhasil ditambahkan ke " + csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
