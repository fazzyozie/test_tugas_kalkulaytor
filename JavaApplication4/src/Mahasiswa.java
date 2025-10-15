
public class Mahasiswa {
    String nama;
    String npm;
    String prodi;
    int semester;
    
    public void setNama(String nama_mhs){
        nama=nama_mhs;
    }  
    public void setNpm(String npm_mhs){
        npm=npm_mhs;
    } 
    public  void setProdi(String prodi){
        this.prodi=prodi;
    }
    public void setSemester(int semester){
        this.semester=semester;
    }
    
    public String getNama(){
        return nama;
    }
    public String getNpm(){
        return npm;
    }
    public String getProdi(){
        return prodi;
    }
    public int getSemester(){
        return semester;
    } 
    
    public void infoMahasiswa(){
        System.out.println("IDENTITAS MAHASISWA");
        System.out.println("Nama : "+nama);
        System.out.println("NPM : "+npm);
        System.out.println("Prodi : "+prodi);
        System.out.println("Semester : "+semester);
    }
}
