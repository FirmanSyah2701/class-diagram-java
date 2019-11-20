/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

/**
 *
 * @author mystogan
 */
public class Main {
    public static void main(String[] args) {
        Prodi p1 = new Prodi();
        p1.setKode("P001");
        p1.setNamaProdi("D3 TI");
        
        Prodi p2 = new Prodi();
        p2.setKode("P002");
        p2.setNamaProdi("D4 RPL");
        
        Mahasiswa m = new Mahasiswa();
        m.setNim("1805041");
        m.setNama("Firman Syah");
        m.setProdi(p2);
        m.showMahasiswa();
        
    }
}
