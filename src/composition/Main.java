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
public class Main {
    public static void main(String[] args) {
        TransDetail td = new TransDetail();
        td.setIdProduk("1800");
        td.setQty(5);
        td.setSubTotal(1000);
        td.showTransDetail();
        Trans t = new Trans();
        t.setNoTrans(100);
        t.setTotal(5000);
        t.addTransDetail(td);
        t.showTrans();
        
    }
}
