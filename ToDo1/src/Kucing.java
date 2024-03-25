public class Kucing {
    String namaKucing, warnaBulu, ras, jenisKelamin;
    double berat, tenaga;
    boolean sehat;

    public Kucing(String namaKucing, String warnaBulu, String ras, String jenisKelamin, double berat, double tenaga, boolean sehat){
        this.namaKucing = namaKucing;
        this.warnaBulu = warnaBulu;
        this.ras = ras;
        this.jenisKelamin = jenisKelamin;
        this.berat = berat;
        this.tenaga = tenaga;
        this.sehat = sehat;
    }

    public void makan() {
        if (sehat) {
            System.out.println(namaKucing + " sedang makan...");
            tenaga += 0.5;
        } else{
            System.out.println(namaKucing + " tidak bisa makan karena sedang sakit.");
        }
    }
    public void tidur() {
        if (sehat) {
            System.out.println(namaKucing + " sedang tidur...");
            tenaga += 1.0;
        } else {
            System.out.println(namaKucing + " tidak bisa tidur karena sedang sakit.");
        }
    }

    public void bermain() {
        if (sehat) {
            System.out.println(namaKucing + " sedang bermain...");
            tenaga -= 0.5;
        } else {
            System.out.println(namaKucing + " tidak bisa bermain karena sedang sakit.");
        }
    }

    public void mengeong() {
        if (sehat) {
            System.out.println(namaKucing + " sedang mengeong...");
            tenaga -= 0.2;
        } else {
            System.out.println(namaKucing + " tidak bisa mengeong karena sedang sakit.");
        }
    }

    public void periksaKesehatan() {
        if (tenaga < 5.0) {
            System.out.println(namaKucing + " terlihat lemah, perlu perawatan.");
            sehat = false;
        } else {
            System.out.println(namaKucing + " terlihat sehat dan bugar.");
            sehat = true;
        }
    }
}
