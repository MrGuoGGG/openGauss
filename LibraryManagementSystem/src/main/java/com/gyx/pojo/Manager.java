package com.gyx.pojo;

public class Manager {
    private String mid;
    private String mname;
    private String mgender;
    private int mage;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMgender() {
        return mgender;
    }

    public void setMgender(String mgender) {
        this.mgender = mgender;
    }

    public int getMage() {
        return mage;
    }

    public void setMage(int mage) {
        this.mage = mage;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mid='" + mid + '\'' +
                ", mname='" + mname + '\'' +
                ", mgender='" + mgender + '\'' +
                ", mage=" + mage +
                '}';
    }
}
