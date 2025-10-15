
public class Hewan {
    String nama_hewan;
    int jumlah_kaki;
    String makanan;
    String tipe_hewan;

    public void setNama_hewan(String nama_hewan) {
        this.nama_hewan = nama_hewan;
    }

    public void setJumlah_kaki(int jumlah_kaki) {
        this.jumlah_kaki = jumlah_kaki;
    }

    public void setTipe_hewan(String tipe_hewan) {
        this.tipe_hewan = tipe_hewan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getNama_hewan() {
        return nama_hewan;
    }

    public String getMakanan() {
        return makanan;
    }

    public String getTipe_hewan() {
        return tipe_hewan;
    }

    public int getJumlah_kaki() {
        return jumlah_kaki;
    }
    
    public void info(){
        System.out.println("Nama Hewan : "+nama_hewan);
        System.out.println("Jumlah Kaki : "+jumlah_kaki);
        System.out.println("Makanan : "+makanan);
        System.out.println("Tipe Hewan : "+tipe_hewan);
    }
    
    
    
    
}
