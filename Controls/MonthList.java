/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controls;

/**
 *
 * @author DELL
 */
public enum MonthList {
    January(31),February(28),March(31),April(30),May(31),June(30),July(31),August(31),September(30),October(31),November(30),December(31);
    private int Total_days;

    private MonthList(int Total_days) {
        this.Total_days = Total_days;
    }

    public int getTotal_days() {
        return Total_days;
    }
}
