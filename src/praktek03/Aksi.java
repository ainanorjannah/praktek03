package praktek03;

public class Aksi {
    public static void main(String[] args) {
        beras e = new beras();
        
        e.setJenis_padi("unggul");
        e.setHarga(30000);
        e.setMerk("unus");
        
        e.cetakInfo();
        System.out.println("Jenisnnya \t: ");
        System.out.println(e.getJenis_padi());
        System.out.println("harga \t: ");
        System.out.println(e.getHarga());
        System.out.println("merk \t: ");
        System.out.println(e.getMerk());
    }
    
}
