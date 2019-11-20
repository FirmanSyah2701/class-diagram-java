/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author mystogan
 */
public class TransDetail {
    private String idProduk;
    private int qty;
    private int subTotal;

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }
    
    public void showTransDetail(){
        System.out.println("Id Produk : " + getIdProduk());
        System.out.println("Qty : " + getQty());
        System.out.println("Sub Total : " + getSubTotal());
    }
}
