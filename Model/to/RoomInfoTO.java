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
public class RoomInfoTO {
    private String typeID;
    private int roomid;

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeid) {
        this.typeID = typeid;
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }
}
