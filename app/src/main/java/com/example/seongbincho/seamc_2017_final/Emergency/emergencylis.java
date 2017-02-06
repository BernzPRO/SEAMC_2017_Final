package com.example.seongbincho.seamc_2017_final.Emergency;

/**
 * Created by seongbincho on 12/31/16.
 */

public class emergencylis {
    private int id;
    private String emname;
    private String status;
    private String phonenumber;

    //Constructor

    public emergencylis(int id, String emname, String status, String phonenumber) {
        this.id = id;
        this.emname = emname;
        this.status = status;
        this.phonenumber = phonenumber;
    }

    //Setter, getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmname() {
        return emname;
    }

    public void setEmname(String emname) {this.emname= emname;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

    public String getPhonenumber() {return phonenumber;}

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}

