package com.qf.pojo;

public class TabUserInfo {

    private Integer addrId;

    private String address;

    private String sex;

    private String Phone;

    public TabUserInfo() {
    }

    public TabUserInfo(Integer addrId, String address, String sex, String phone) {
        this.addrId = addrId;
        this.address = address;
        this.sex = sex;
        Phone = phone;
    }

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "TabUserInfo{" +
                "addrId=" + addrId +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
