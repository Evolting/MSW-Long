/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nvlon
 */
public class Singer {
    private int singerID;
    private String name, info;

    public Singer() {
    }

    public Singer(int singerID, String name, String info) {
        this.singerID = singerID;
        this.name = name;
        this.info = info;
    }

    public int getSingerID() {
        return singerID;
    }

    public void setSingerID(int singerID) {
        this.singerID = singerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singer{" + "singerID=" + singerID + ", name=" + name + ", info=" + info + '}';
    }
    
}
