package association;

import java.util.ArrayList;

/**
 *
 * @author mystogan
 */
public class Prodi {
    private String kode;
    private String namaProdi;
    private Mahasiswa mhs;
    
    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaProdi() {
        return namaProdi;
    }

    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }
    
    public void setMhs(Mahasiswa mhs){
        this.mhs = mhs;
    }
    
    public void showProdi(){
        System.out.println("Kode Prodi: " + getKode());
        System.out.println("Nama Prodi: " + getNamaProdi());
    }
}
