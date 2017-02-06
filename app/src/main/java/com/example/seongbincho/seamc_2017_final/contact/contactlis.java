package com.example.seongbincho.seamc_2017_final.contact;

/**
 * Created by seongbincho on 12/31/16.
 */

public class contactlis {
    private int id;
    private String stname;
    private String ststatus;
    private String stphonenumber;
    private String stemail;

    //Constructor

    public contactlis(int id, String stname, String ststatus, String stphonenumber, String stemail) {
        this.id = id;
        this.stname = stname;
        this.ststatus = ststatus;
        this.stphonenumber = stphonenumber;
        this.stemail = stemail;
    }

    //Setter, getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {this.stname= stname;}

    public String getStstatus() {return ststatus;}

    public void setStstatus(String ststatus) {this.ststatus = ststatus;}

    public String getStphonenumber() {return stphonenumber;}

    public void setStphonenumber(String stphonenumber) {
        this.stphonenumber = stphonenumber;
    }

    public String getStemail() {return stemail;}

    public void setStemail(String stemail) {
        this.stemail = stemail;
    }


}

