/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.to;

import java.sql.Date;

/**
 *
 * @author DELL
 */
public class EmployeeInfoTO {
    private int empid;
    private int adhaarcard;
    private String empName;
    private String emptypeid;
    private Date dateofjoining;
    private Date dateofleaving;
    private String emptypename;

    public String getEmptypename() {
        return emptypename;
    }

    public void setEmptypename(String emptypename) {
        this.emptypename = emptypename;
    }
    public String getEmptypeid() {
        return emptypeid;
    }

    public void setEmptypeid(String emptypeid) {
        this.emptypeid = emptypeid;
    }

    public Date getDateofjoining() {
        return dateofjoining;
    }

    public void setDateofjoining(Date dateofjoining) {
        this.dateofjoining = dateofjoining;
    }

    public Date getDateofleaving() {
        return dateofleaving;
    }

    public void setDateofleaving(Date dateofleaving) {
        this.dateofleaving = dateofleaving;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    public int getAdhaarcard() {
        return adhaarcard;
    }

    public void setAdhaarcard(int adhaarcard) {
        this.adhaarcard = adhaarcard;
    }
}
   

   