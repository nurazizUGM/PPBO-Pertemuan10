public abstract class Mobil {
    private String nomor;
    private String warna;
    private String merk;
    private boolean isDikopling = false;
    private int gigi = 0;
    private int kecepatan = 0;

    Mobil(String nomor, String warna, String merk) {
        this.nomor = nomor;
        this.warna = warna;
        this.merk = merk;
    }

    void kopling() {
        this.isDikopling = !this.isDikopling;
        System.out.println("Dikopling: " + this.isDikopling);
    }

    abstract void tambahGigi();

    abstract void KurangiGigi();

    abstract void gas();

    void rem() {
        if (this.kecepatan == 0) {
            System.out.println("Mobil berhenti!");
        } else {
            this.kecepatan -= 10;
            System.out.println("Kecepatan: " + this.kecepatan);
        }
    }

    String getNomor() {
        return this.nomor;
    }

    String getWarna() {
        return this.warna;
    }

    String getMerk() {
        return this.merk;
    }

    boolean getIsDikopling() {
        return this.isDikopling;
    }

    int getGigi() {
        return this.gigi;
    }

    int getKecepatan() {
        return this.kecepatan;
    }

    void setKopling(boolean isDikopling) {
        this.isDikopling = isDikopling;
    }

    void setGigi(int gigi) {
        this.gigi = gigi;
    }

    void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
}
