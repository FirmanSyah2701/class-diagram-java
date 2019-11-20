/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalization;

/**
 *
 * @author mystogan
 */
public class Pelanggan extends Person{
    private String noPelanggan;

    public String getNoPelanggan() {
        return noPelanggan;
    }

    public void setNoPelanggan(String noPelanggan) {
        this.noPelanggan = noPelanggan;
    }
    
    public void showPerson(){
        System.out.println("No. Pelanggan : " + getNoPelanggan());
        super.showPerson();
    }
}
