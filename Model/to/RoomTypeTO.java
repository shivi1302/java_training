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
public class RoomTypeTO {
    private String typeID;
    private String typename;
    private float chargesperday;
    private String description;

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }
    
    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public float getChargesperday() {
        return chargesperday;
    }

    public void setChargesperday(float chargesperday) {
        this.chargesperday = chargesperday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString(){
        return typename+" Rs."+ chargesperday+" per day";
    }
}
