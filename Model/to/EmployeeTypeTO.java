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
public class EmployeeTypeTO {
    private String emptypeid;
    private String emptypename;
    private float basicsalary;

    public String getEmptypeid() {
        return emptypeid;
    }

    public void setEmptypeid(String emptypeid) {
        this.emptypeid = emptypeid;
    }
    
    public String getEmptypename() {
        return emptypename;
    }

    public void setEmptypename(String emptypename) {
        this.emptypename = emptypename;
    }
    
    public float getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(float basicsalary) {
        this.basicsalary = basicsalary;
    }
    @Override
    public String toString(){
        return emptypename;
    }
}
