/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

import java.util.ArrayList;

/**
 *
 * @author mystogan
 */
public class Trans {
    private int noTrans;
    private int total;
    private ArrayList<TransDetail> td = new ArrayList<>();

    public int getNoTrans() {
        return noTrans;
    }

    public void setNoTrans(int noTrans) {
        this.noTrans = noTrans;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public void addTransDetail(TransDetail td){
        this.td.add(td);
    }
    
    public void showTrans(){
        System.out.println("No. Trans : " + getNoTrans());
        System.out.println("Total : " + getTotal());
        for (TransDetail t : td) {
            t.showTransDetail();
        }
    }
}
