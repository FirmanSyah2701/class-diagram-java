package generalization;

/**
 *
 * @author mystogan
 */
public class Person {
    private String nama;
    private String alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void showPerson(){
        System.out.println("Nama : " + getNama());
        System.out.println("Alamat : " + getAlamat());
    }
}
