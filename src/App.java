public class App {
    public static void main(String[] args) throws Exception {
        MobilPenumpang civic = new MobilPenumpang("AB1", "hitam", "Honda", MobilPenumpang.Tipe.SPORT);
        civic.gas();
        civic.tambahGigi();
        civic.gas();
        civic.tambahGigi();
        civic.gas();
        civic.tambahGigi();
        civic.gas();
        civic.gas();
        civic.tambahGigi();
        civic.gas();
        civic.gas();
        civic.gas();
        civic.tambahGigi();
        civic.gas();
        civic.gas();
        civic.gas();
        civic.gas();
        civic.tambahGigi();
        System.out.println();

        MobilPenumpang avanza = new MobilPenumpang("AB2", "putih", "Toyota", MobilPenumpang.Tipe.REGULER);
        avanza.tambahGigi();
        avanza.kopling();
        avanza.tambahGigi();
        avanza.kopling();
        avanza.gas();
        System.out.println();

        MobilBarang carry = new MobilBarang("AB3", "hitam", "Suzuki", 1000);
        carry.kopling();
        carry.tambahGigi();
        carry.kopling();
        carry.gas();
        carry.kopling();
        carry.tambahGigi();
        carry.kopling();
        carry.gas();
        carry.kopling();
        carry.tambahGigi();
        carry.kopling();
        carry.gas();
        carry.kopling();
        carry.tambahGigi();
        carry.kopling();
        carry.gas();
        carry.gas();
        carry.kopling();
        carry.tambahGigi();
        carry.kopling();
        carry.gas();
        carry.gas();
        carry.gas();
        carry.kopling();
        carry.tambahGigi();
        carry.kopling();
        carry.gas();
        carry.gas();
        carry.gas();
        carry.kopling();
        carry.tambahGigi();

        carry.KurangiGigi();
        carry.kopling();
        carry.rem();
        carry.rem();
        carry.rem();
        carry.rem();
        carry.rem();
        carry.rem();
        carry.rem();
        carry.rem();
        carry.rem();
    }
}
