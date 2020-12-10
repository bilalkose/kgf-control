package _VizeOdevi;

public class KumandaTvSmart extends KumandaTv  {

    private int sesSeviyesi;
    private int kanalDurumu;
    private String marka;

    public KumandaTvSmart(int tusSayisi, int pilSayisi, String uretimTarihi, String pilTuru, double voltajDegeri,
                          int sesSeviyesi, int kanalDurumu, String marka) {
        super(tusSayisi, pilSayisi, uretimTarihi, pilTuru, voltajDegeri, sesSeviyesi, kanalDurumu, marka);
        this.sesSeviyesi = sesSeviyesi;
        this.kanalDurumu = kanalDurumu;
        this.marka = marka;
    }

    @Override
    public int getSesSeviyesi() {
        return sesSeviyesi;
    }

    @Override
    public void setSesSeviyesi(int sesSeviyesi) {
        this.sesSeviyesi = sesSeviyesi;
    }

    @Override
    public int getKanalDurumu() {
        return kanalDurumu;
    }

    @Override
    public void setKanalDurumu(int kanalDurumu) {
        this.kanalDurumu = kanalDurumu;
    }

    @Override
    public String getMarka() {
        return marka;
    }

    void interneteGir(){
        System.out.println(getMarka() + "markalı 'SMART' televizyonda internete girildi!");
    }

    void uygulamaYukle(){
        System.out.println(getMarka() + "markalı 'SMART' televizyona uygulama yüklendi!");
    }

    void wifiBaglan(){
        System.out.println(getMarka() + "markalı 'SMART' televizyonda wifi bağlantısı yapıldı!");
    }

    @Override
    void cihazAc()
    {
        System.out.println(getMarka() + "markalı 'SMART' televizyon açıldı!");
    }

    @Override
    void cihazKapat() {
        System.out.println(getMarka() + "markalı 'SMART' televizyon kapandı!");
    }

    @Override
    void pilPitiyor() {
        System.out.println(getMarka() + "markalı 'SMART' televizyonun pili tukeniyor!");
    }
}
