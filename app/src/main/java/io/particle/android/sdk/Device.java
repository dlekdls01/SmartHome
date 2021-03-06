package io.particle.android.sdk;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by user562 on 2019-04-03.
 */

public class Device implements Serializable {
    private String name, state, detailState;                // device이름
    private int type, roomNum, id;                   //0:led 1:rgb 2:blind 3:fan 4:temper
    private int[] room = new int[3];    //0:기본 1~2추가
    private Drawable deviceImgDrawable; // device image
    private boolean isFirst, cBoxState;             //fist인지

    // For customRoom
    private int customRoomNum1;
    private int customRoomNum2;

    public int getDeviceId() {return id;}
    public void setDeviceId(int _id) {this.id = _id;}

    public String getDeviceName() {
        return name;
    }
    public void setDeviceName(String _name) {
        this.name = _name;
    }

    public int getDeviceType() {
        return type;
    }
    public void setDeviceType(int _type) {
        this.type = _type;
    }

    public String getDeviceState() {
        return state;
    }
    public void setDeviceState(String _state) {
        this.state = _state;
    }

    public int getDeviceRoom(int roomNum) {
        return room[roomNum];
    }
    public void setDeviceRoom(int basicRoomNum, int addedRoomNum) {
        room[basicRoomNum] = addedRoomNum;
    }

    public int getDeviceRoomNum() {return roomNum;}
    public void setDeviceRoomNum(int roomNum) { this.roomNum = roomNum; }

    public Drawable getDeviceImgDrawable() {
        return deviceImgDrawable;
    }
    public void setDeviceImgDrawable(Drawable _deviceImgDrawable) {
        this.deviceImgDrawable = _deviceImgDrawable;
    }

    public boolean getIsFirst(){ return isFirst;}
    public void setIsFirst(Boolean _isFirst){
        this.isFirst = _isFirst;
    }

    public boolean getCBoxState(){ return cBoxState;}
    public void setCBoxState(Boolean _cBoxState){
        this.cBoxState = _cBoxState;
    }


    public String getDeviceDetailState() {
        return detailState;
    }
    public void setDeviceDetailState(String _state) {
        this.detailState = _state;
    }

    public int getDeviceCustomRoomNum1() { return customRoomNum1; }
    public void setDeviceCustomRoomNum1(int _roomNum1) { this.customRoomNum1 = _roomNum1; }

    public int getDeviceCustomRoomNum2() { return customRoomNum2; }
    public void setDeviceCustomRoomNum2(int _roomNum2) {this.customRoomNum2 = _roomNum2;}
}