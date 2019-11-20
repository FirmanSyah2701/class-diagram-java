package association;

/**
 *
 * @author mystogan
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private Prodi prodi;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setProdi(Prodi prodi){
        this.prodi = prodi;
    }
    
    public void showMahasiswa(){
        System.out.println("Nim : " + getNim());
        System.out.println("Nama : " + getNama());
        prodi.showProdi();
    }
}
