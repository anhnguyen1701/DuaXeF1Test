/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author anhnguyen
 */
public class TayDua {

    private int id;
    private String ten, quoctich, tieusu;
    private Date ngaysinh;
    private DoiDua doiDua;

    public TayDua() {
    }

    public TayDua(int id, String ten, String quoctich, String tieusu, Date ngaysinh, DoiDua doiDua) {
        this.id = id;
        this.ten = ten;
        this.quoctich = quoctich;
        this.tieusu = tieusu;
        this.ngaysinh = ngaysinh;
        this.doiDua = doiDua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public String getTieusu() {
        return tieusu;
    }

    public void setTieusu(String tieusu) {
        this.tieusu = tieusu;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public DoiDua getDoiDua() {
        return doiDua;
    }

    public void setDoiDua(DoiDua doiDua) {
        this.doiDua = doiDua;
    }

    @Override
    public String toString() {
        return "TayDua{" + "id=" + id + ", ten=" + ten + ", quoctich=" + quoctich + ", tieusu=" + tieusu + ", ngaysinh=" + ngaysinh + ", doiDua=" + doiDua + '}';
    }

}
