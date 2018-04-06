package praktek03;

public class Aksi {
    public static void main(String[] args) {
        beras e = new beras();
        
        e.setJenis_padi("unggul");
        e.setHarga(30000);
        e.setMerk("unus");
       //gak bisa juga pak hee e.setJenisketan();
        
        e.cetakInfo();
        System.out.println("Jenisnnya \t: ");
        System.out.println(e.getJenis_padi());
        System.out.println("harga \t: ");
        System.out.println(e.getHarga());
        System.out.println("merk \t: ");
        System.out.println(e.getMerk());
        
        ketan sm = new ketan ();
        sm.setJenis_padi("inpor");
        sm.setMerk("unus");
        sm.setHarga(300000);
        sm.setJenisketan("lakatan");
        sm.cetakInfo();
        
        System.out.println("Jenis \t: "+sm.getJenisketan());
        sm.iniketan();
    }
    
}
