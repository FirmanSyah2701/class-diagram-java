/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregation;

/**
 *
 * @author mystogan
 */
public class Departemen {
    private String kodeDepartemen;
    private String namaDepartemen;
    private Jurusan jurusan;
    public String getKodeDepartemen() {
        return kodeDepartemen;
    }

    public void setKodeDepartemen(String kodeDepartemen) {
        this.kodeDepartemen = kodeDepartemen;
    }

    public String getNamaDepartemen() {
        return namaDepartemen;
    }

    public void setNamaDepartemen(String namaDepartemen) {
        this.namaDepartemen = namaDepartemen;
    }
    
    public void setJurusan(Jurusan jurusan){
        this.jurusan = jurusan;
    }
    
    
    public void showDepartemen(){
        System.out.println("Kode Departemen : " + getKodeDepartemen());
        System.out.println("Nama Departemen : " + getNamaDepartemen());
        System.out.println("");
        try {
            jurusan.showJurusan();
        } catch (NullPointerException e) {
            System.out.println("Jurusan kosong");
        }
    }
}
