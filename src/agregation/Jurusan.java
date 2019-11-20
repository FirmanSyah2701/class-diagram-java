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
public class Jurusan {
    private String kodeJurusan;
    private String namaJurusan;

    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }
    
    public void showJurusan(){
        System.out.println("Kode Jurusan : " + getKodeJurusan());
        System.out.println("Nama Jurusan : " + getNamaJurusan());
        System.out.println("");
    }
}
