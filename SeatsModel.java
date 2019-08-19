/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author Aviator
 */
public class SeatsModel implements Serializable {

    int seatId, seatTableId;
    String seatName;

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getSeatTableId() {
        return seatTableId;
    }

    public void setSeatTableId(int seatTableId) {
        this.seatTableId = seatTableId;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

}
