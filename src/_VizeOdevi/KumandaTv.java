package _VizeOdevi;
import java.util.Random;

public class KumandaTv extends KumandaMain {
    private String marka;
    private int sesSeviyesi;
    private int kanalDurumu;
    private int toplamKanalSayisi = 500;
    private static int toplamTvSayac = 0;
    private int id;

    public KumandaTv(int tusSayisi, int pilSayisi, String uretimTarihi, String pilTuru, double voltajDegeri,
                     int sesSeviyesi, int kanalDurumu, String marka) {
        super(tusSayisi, pilSayisi, uretimTarihi, pilTuru, voltajDegeri);
        if(sesSeviyesi>=0 && sesSeviyesi<=30)
            this.sesSeviyesi = sesSeviyesi;
        else{
            this.sesSeviyesi = 0;
            System.out.println("Ses seviyesi 0 ve 30 arasında olmalıdır. Varsayılan 0 olarak başlatıldı.");
        }
        if(kanalDurumu>=1 && kanalDurumu<500)
            this.kanalDurumu = kanalDurumu;
        else{
            this.kanalDurumu = 1;
            System.out.println(marka + " markasının kanal durumu 1 ile 500 arasında olmalıdır. Varsayılan 1 olarak başlatıldı");
        }
        this.marka = marka;

        //Her tv üretildiğinde ID değerleri için random sayı oluşturulsun
        Random randomSayi = new Random();
        this.id = randomSayi.nextInt(100000);

        toplamTvSayac++;
    }

    public void getId() {
        String numaraString = String.format("ID Değeri: "+"TV"+"%05d", this.id);
        System.out.println(numaraString);
    }

    public String getMarka() {
        return marka;
    }

    public int getSesSeviyesi() {
        return sesSeviyesi;
    }

    public void setSesSeviyesi(int sesSeviyesi) {
        this.sesSeviyesi = sesSeviyesi;
    }

    public int getKanalDurumu() {
        return kanalDurumu;
    }

    public void setKanalDurumu(int kanalDurumu) {
        this.kanalDurumu = kanalDurumu;
    }

    public int getToplamKanalSayisi() {
        return toplamKanalSayisi;
    }

    public static void getToplamTvSayac() {
        System.out.println("Toplam televizyon kumandaları (Normal+Smart): " + toplamTvSayac);
    }

    void sesUp(){
        if(isCihazDurum() == true){
            if( (sesSeviyesi>=0 && sesSeviyesi<30) ){
                sesSeviyesi++;
                setSesSeviyesi(sesSeviyesi);
                System.out.println("Ses 1 arttırıldı. Yeni ses seviyesi: " + getSesSeviyesi());
            }
            else{
                System.out.println("Ses seviyesi 0 ve 30 arasında olmalıdır.");
            }
        }
        else{
            System.out.println("Cihaz açık değil.");
        }
    }

    void sesDown(){
        if(isCihazDurum() == true){
            if( (sesSeviyesi>=0 && sesSeviyesi<30) ) {
                sesSeviyesi--;
                setSesSeviyesi(sesSeviyesi);
                System.out.println("Ses 1 arttırıldı. Yeni ses seviyesi: " + getSesSeviyesi());
            }
            else{
                System.out.println("Ses seviyesi 0 ve 30 arasında olmalıdır.");
            }
        }
        else{
            System.out.println("Cihaz açık değil.");
        }
    }

    void kanalUp(){
        if(isCihazDurum() == true){
            if( (kanalDurumu>=1 && kanalDurumu<500) ) {
                kanalDurumu++;
                setKanalDurumu(kanalDurumu);
                System.out.println("Kanal 1 yukarı değiştirildi. Yeni kanal durumu: " + getKanalDurumu());
            }
            else{
                System.out.println("Kanal durumu 1 ile 500 arasında olmalıdır");
            }
        }
        else{
            System.out.println("Cihaz açık değil.");
        }
    }

    void kanalDown(){
        if(isCihazDurum() == true){
            if( (kanalDurumu>=1 && kanalDurumu<500) ) {
                kanalDurumu--;
                setSesSeviyesi(kanalDurumu);
                System.out.println("Kanal 1 aşağı değiştirildi. Yeni kanal durumu: " + getKanalDurumu());
            }
            else{
                System.out.println("Kanal durumu 1 ile 500 arasında olmalıdır");
            }
        }
        else{
            System.out.println("Cihaz açık değil.");
        }
    }

    void istenilenKanalaGit(int istenenKanal){
        if(isCihazDurum() == true){
            if( (istenenKanal>=1 && istenenKanal<500) ) {
                setKanalDurumu(istenenKanal);
                System.out.println("İstenilen kanala gidildi. Yeni kanal durumu: " + getKanalDurumu());
            }
            else{
                System.out.println("Kanal durumu 1 ile 500 arasında olmalıdır");
            }
        }
        else{
            System.out.println("Cihaz açık değil.");
        }
    }

    @Override
    void cihazAc() {
        System.out.println(marka + "markalı 'NORMAL' televizyon açıldı!");
    }

    @Override
    void cihazKapat() {
        System.out.println(marka + "markalı 'NORMAL' televizyon kapandı!");
    }

    @Override
    void pilPitiyor() {
        System.out.println(marka + "markalı 'NORMAL' televizyonun pili tukeniyor!");
    }
}
