package _VizeOdevi;
import java.util.Random;

public class KumandaKlima extends KumandaMain {
    private String marka;
    private float mevcutSicaklik;
    private static int toplamKlimaSayac = 0;
    private int id;

    public KumandaKlima(int tusSayisi, int pilSayisi, String uretimTarihi, String pilTuru, double voltajDegeri, float mevcutSicaklik,
                        String marka) {
        super(tusSayisi, pilSayisi, uretimTarihi, pilTuru, voltajDegeri);
        this.marka = marka;
        if(mevcutSicaklik>=10 && mevcutSicaklik<=43)
            this.mevcutSicaklik = mevcutSicaklik;
        else {
            this.mevcutSicaklik = 10;
            System.out.println(marka + " markasının mevcut sıcaklığı 10 ila 43 derece arasında olmalıdır. Varsayılan 10 olarak başlatıldı.");
        }

        //Her tv üretildiğinde ID değerleri için random sayı oluşturulsun
        Random randomSayi = new Random();
        this.id = randomSayi.nextInt(100000);

        toplamKlimaSayac++;
    }

    public void getId() {
        String numaraString = String.format("ID Değeri: "+"KL"+"%05d", this.id);
        System.out.println(numaraString);
    }

    public String getMarka() {
        return marka;
    }


    public float getMevcutSicaklik() {
        return mevcutSicaklik;
    }

    public void setMevcutSicaklik(float mevcutSicaklik) {
        this.mevcutSicaklik = mevcutSicaklik;
    }



    public static void getToplamKlimaSayac() {
        System.out.println("Toplam klima kumandaları (Normal+Turbolu): " + toplamKlimaSayac);
    }


    void sicaklikArttir(){
        if(isCihazDurum() == true){
            if(mevcutSicaklik>=10.0 && mevcutSicaklik<=43.0){
                mevcutSicaklik++;
                setMevcutSicaklik(mevcutSicaklik);
                System.out.println("Sıcaklık 1 derece artırıldı. Yeni sıcaklık seviyesi: " + getMevcutSicaklik());
            }
            else {
                System.out.println("Mevcut sıcaklık 10 ila 43 derece arasında olmalıdır.");
            }
        }
        else{
            System.out.println("Cihaz açık olmalıdır.");
        }
    }

    void sicaklikAzalt(){
        if(isCihazDurum() == true){
            if(mevcutSicaklik>=10.0 && mevcutSicaklik<=43.0){
                mevcutSicaklik--;
                setMevcutSicaklik(mevcutSicaklik);
                System.out.println("Sıcaklık 1 derece azaltıldı. Yeni sıcaklık seviyesi: " + getMevcutSicaklik());
            }
            else {
                System.out.println("Mevcut sıcaklık 10 ila 43 derece arasında olmalıdır.");
            }
        }
        else{
            System.out.println("Cihaz açık olmalıdır.");
        }
    }

    void istenilenSicakligaGit(float istenenSicaklik){
        if(isCihazDurum() == true){
            if(istenenSicaklik>=10.0 && istenenSicaklik<=43.0){
                setMevcutSicaklik(istenenSicaklik);
                System.out.println("Sıcaklık istenen seviye getirildi. Yeni sıcaklık: " + getMevcutSicaklik());
            }
            else {
                System.out.println("Mevcut sıcaklık 10 ila 43 derece arasında olmalıdır.");
            }
        }
        else{
            System.out.println("Cihaz açık olmalıdır.");
        }
    }


    @Override
    void cihazAc() {
        System.out.println(marka + "markalı 'NORMAL' klima açıldı!");
    }

    @Override
    void cihazKapat() {
        System.out.println(marka + "markalı 'NORMAL' klima kapandı!");
    }

    @Override
    void pilPitiyor() {
        System.out.println(marka + "markalı 'NORMAL' klimanın pili tükeniyor!");
    }
}
