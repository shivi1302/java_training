/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.to;

/**
 *
 * @author DELL
 */
public class CustomerInfoTO {
    private int customerid;
    private int adhaarcard;
    private String customername;

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getAdhaarcard() {
        return adhaarcard;
    }

    public void setAdhaarcard(int adhaarcard) {
        this.adhaarcard = adhaarcard;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }
}
