public class MobilPenumpang extends Mobil {
    static enum Tipe {
        SPORT, REGULER
    }

    Tipe tipe;
    final int maxGigi = 5;
    final int[] batasKecepatan = { 0, 10, 20, 40, 70, 100 };

    MobilPenumpang(String nomor, String warna, String merk, Tipe tipe) {
        super(nomor, warna, merk);
        this.tipe = tipe;
    }

    void tambahGigi() {
        if (this.tipe != Tipe.SPORT && !this.getIsDikopling()) {
            System.out.println("Mobil belum dikopling!");
        } else if (this.getGigi() < this.maxGigi) {
            this.setGigi(this.getGigi() + 1);
            System.out.println("Gigi: " + this.getGigi());
        } else {
            System.out.println("Top gear!");
        }
    }

    void KurangiGigi() {
        if (!this.getIsDikopling()) {
            System.out.println("Mobil belum dikopling!");
        }
        if (this.getGigi() > 0) {
            this.setGigi(this.getGigi() - 1);
            System.out.println("Gigi: " + this.getGigi());
            if (this.getKecepatan() > this.batasKecepatan[this.getGigi()]) {
                this.setKecepatan(this.batasKecepatan[this.getGigi()]);
                System.out.println("Kecepatan: " + this.getKecepatan());
            }
        } else {
            System.out.println("Netral!");
        }
    }

    void gas() {
        if (this.getIsDikopling()) {
            System.out.println("Mobil masih dikopling!");
        } else if (this.getGigi() == 0) {
            System.out.println("Netral!");
        } else if (this.getKecepatan() < this.batasKecepatan[this.getGigi()]) {
            this.setKecepatan(this.getKecepatan() + 10);
            System.out.println("Speed: " + this.getKecepatan());
        } else {
            System.out.println("Max speed!");
        }
    }

    Tipe getTipe() {
        return this.tipe;
    }
}
