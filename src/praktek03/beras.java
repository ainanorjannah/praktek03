
package praktek03;


public class beras {
    private String jenis_padi;
    private double harga;
    private String merk;
    
void cetakInfo() {
    System.out.println("Jenis Padi \t: "+jenis_padi+"\n"+
            "harga \t: "+harga+"\n"+
            "Merk  \t: "+merk);
}

    public String getJenis_padi() {
        return jenis_padi;
    }

    public void setJenis_padi(String jenis_padi) {
        this.jenis_padi = jenis_padi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

}
