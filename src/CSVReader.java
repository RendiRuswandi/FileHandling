import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        String line;
        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Membaca header
            String header = br.readLine();
            System.out.println("Header: " + header);

            // Membaca isi file baris per baris
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("NIM: " + data[0] + ", NAMA: " + data[1] + ", UMUR: " + data[2] + ", PRODI: " + data[3]);
                rowCount++;
            }
            System.out.println("Jumlah baris data: " + rowCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
