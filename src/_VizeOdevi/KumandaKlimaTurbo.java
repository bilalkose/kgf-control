package _VizeOdevi;

public class KumandaKlimaTurbo extends KumandaKlima {

    private float mevcutSicaklik;
    private String marka;

    public KumandaKlimaTurbo(int tusSayisi, int pilSayisi, String uretimTarihi, String pilTuru, double voltajDegeri, float mevcutSicaklik, String marka) {
        super(tusSayisi, pilSayisi, uretimTarihi, pilTuru, voltajDegeri, mevcutSicaklik, marka);
        this.mevcutSicaklik = mevcutSicaklik;
        this.marka = marka;
    }

    @Override
    public void setMevcutSicaklik(float mevcutSicaklik) {
        this.mevcutSicaklik = mevcutSicaklik;
    }

    @Override
    public float getMevcutSicaklik() {
        return mevcutSicaklik;
    }

    @Override
    public String getMarka() {
        return marka;
    }

    void turboSicaklikAc(){
        System.out.println("Turbo sıcaklık açıldı!");
    }
    void turboSicaklikKapat(){
        System.out.println("Turbo sıcaklık kapandı!");
    }
    void turboSoguklukAc(){
        System.out.println("Turbo soğukluk açıldı!");
    }
    void turboSoguklukKapat(){
        System.out.println("Turbo soğukluk kapandı!");
    }

    @Override
    void cihazAc() {
        System.out.println(marka + "markalı 'TURBOLU' klima açıldı!");
    }

    @Override
    void cihazKapat() {
        System.out.println(marka + "markalı 'TURBOLU' klima kapandı!");
    }

    @Override
    void pilPitiyor() {
        System.out.println(marka + "markalı 'TURBOLU' klimanın pili tükeniyor!");
    }

}
