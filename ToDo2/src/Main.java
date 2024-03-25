import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        // Data yang akan diformat
        String[][] data = {
                {"John", "30", "175.5"},
                {"Alice", "25", "162.3"},
                {"Bob", "35", "180.0"}
        };

        // Membuat objek Formatter
        Formatter formatter = new Formatter();

        // Memformat header
        formatter.format("%-10s%-10s%-10s\n", "Nama", "Umur", "Tinggi");
        formatter.format("%-10s%-10s%-10s\n", "----------", "----------", "----------");

        // Memformat data
        for (String[] row : data) {
            formatter.format("%-10s%-10s%-10s\n", row[0], row[1], row[2]);
        }

        // Mengambil string yang diformat
        String hasilFormat = formatter.toString();

        // Menampilkan hasil format
        System.out.println(hasilFormat);

        // Menutup objek Formatter
        formatter.close();
    }
}
