public class Pertemuan_1_2B {
    public static void main(String[] args) {    
        tampilkanInfo("Toyota", "Sedan", 2021, 2025);  
    }
    
    public static void tampilkanInfo(String merk, String jenis, int tahunProduksi, int tahunSekarang){
        System.out.println("====Data Kendaraan====");
        System.out.println("Merk : "+merk);
        System.out.println("Jenis : "+jenis);
        System.out.println("Tahun Produksi : "+tahunProduksi);
        
        int usia=tahunSekarang-tahunProduksi;
        System.out.println("Usia : "+usia);
        
        String status="";
        if(usia<3){
            status="Baru";
        }
        else if(usia>=3 && usia<=10){
            status="Sedang";
        }
        else{
            status="Tua";
        }
        System.out.println("Status : Kendaraan "+status);
    }
}