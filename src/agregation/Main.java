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
public class Main {
    public static void main(String[] args) {
        Jurusan j = new Jurusan();
        j.setKodeJurusan("J001");
        j.setNamaJurusan("Teknik Informatika");
        Departemen d = new Departemen();
        d.setKodeDepartemen("D001");
        d.setNamaDepartemen("Polindra");
        d.setJurusan(j);
        d.showDepartemen();
    }
}
