public class Main {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Tom", "Putih", "Persia", "Jantan", 4.5, 10, true);
        System.out.println("Info Kucing 1:");
        System.out.println("Nama: " + kucing1.namaKucing);
        System.out.println("Warna Bulu: " + kucing1.warnaBulu);
        System.out.println("Ras: " + kucing1.ras);
        System.out.println("Jenis Kelamin: " + kucing1.jenisKelamin);
        System.out.println("Berat: " + kucing1.berat + " kg");
        System.out.println("Tenaga: " + kucing1.tenaga);
        if (kucing1.sehat) {
            System.out.println("Kesehatan: Baik");
        } else {
            System.out.println("Kesehatan: Perlu perawatan");
        }
        System.out.println("Tom melakukan beberapa aksi:");
        kucing1.makan();
        kucing1.tidur();
        kucing1.bermain();
        kucing1.mengeong();
        kucing1.periksaKesehatan();
        System.out.println();

        Kucing kucing2 = new Kucing("Kitty", "Coklat", "Anggora", "Betina", 3.2, 8.0, true);
        System.out.println("Info Kucing 2:");
        System.out.println("Nama: " + kucing2.namaKucing);
        System.out.println("Warna Bulu: " + kucing2.warnaBulu);
        System.out.println("Ras: " + kucing2.ras);
        System.out.println("Jenis Kelamin: " + kucing2.jenisKelamin);
        System.out.println("Berat: " + kucing2.berat + " kg");
        System.out.println("Tenaga: " + kucing2.tenaga);
        if (kucing2.sehat) {
            System.out.println("Kesehatan: Baik");
        } else {
            System.out.println("Kesehatan: Perlu perawatan");
        }
        System.out.println("Kitty melakukan beberapa aksi:");
        kucing2.makan();
        kucing2.tidur();
        kucing2.bermain();
        kucing2.mengeong();
        kucing2.periksaKesehatan();
        System.out.println();

        Kucing kucing3 = new Kucing("Garfield", "Orange", "Kampung", "Jantan", 5.0, 9.0, false);
        System.out.println("Info Kucing 3:");
        System.out.println("Nama: " + kucing3.namaKucing);
        System.out.println("Warna Bulu: " + kucing3.warnaBulu);
        System.out.println("Ras: " + kucing3.ras);
        System.out.println("Jenis Kelamin: " + kucing3.jenisKelamin);
        System.out.println("Berat: " + kucing3.berat + " kg");
        System.out.println("Tenaga: " + kucing3.tenaga);
        if (kucing3.sehat) {
            System.out.println("Kesehatan: Baik");
        } else {
            System.out.println("Kesehatan: Perlu perawatan");
        }
        System.out.println("Garfield melakukan beberapa aksi:");
        kucing3.makan();
        kucing3.tidur();
        kucing3.bermain();
        kucing3.mengeong();
        kucing3.periksaKesehatan();
        System.out.println();
    }
}