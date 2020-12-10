package _VizeOdevi;

public abstract class KumandaMain {
    private String kumandaFirmaIsmi = "KGF";
    private int tusSayisi;
    private int pilSayisi;
    private String uretimTarihi;
    private boolean cihazDurum=true;
    private Pil pil;

    public KumandaMain(int tusSayisi, int pilSayisi, String uretimTarihi, String pilTuru, double voltajDegeri) {
        this.tusSayisi = tusSayisi;
        this.pilSayisi = pilSayisi;
        this.uretimTarihi = uretimTarihi;
        Pil pil = new Pil(); //Kumanda oluşturulurken pil nesnesi üretilsin
        pil.setPilTuru(pilTuru);
        pil.setVoltajDegeri(voltajDegeri);
        this.pil = pil;
    }
    //kalıtılan sınıflar bu mototları kullanmak zorunda kalsın
    abstract void cihazAc();
    abstract void cihazKapat();
    abstract void pilPitiyor();

    public String getkumandaFirmaIsmi() {
        return kumandaFirmaIsmi;
    }

    public int getTusSayisi() {
        return tusSayisi;
    }

    public void setTusSayisi(int tusSayisi) {
        this.tusSayisi = tusSayisi;
    }

    public int getPilSayisi() {
        return pilSayisi;
    }

    public void setPilSayisi(int pilSayisi) {
        this.pilSayisi = pilSayisi;
    }

    public String getUretimTarihi() {
        return uretimTarihi;
    }

    public void setUretimTarihi(String uretimTarihi) {
        this.uretimTarihi = uretimTarihi;
    }

    public boolean isCihazDurum() {
        return cihazDurum;
    }

    public void setCihazDurum(boolean cihazDurum) {
        this.cihazDurum = cihazDurum;
    }

    public String getPilTuru() {
        return pil.getPilTuru();
    }

}
