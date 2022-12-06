/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author anhnguyen
 */
public class DoiDua {

    private int id;
    private String ten, hang, mota;
    private QuanLyDoiDua quanly;
    private ArrayList<TayDua> dstaydua;

    public DoiDua() {
    }

    public DoiDua(int id, String ten, String hang, String mota, QuanLyDoiDua quanly, ArrayList<TayDua> dstaydua) {
        this.id = id;
        this.ten = ten;
        this.hang = hang;
        this.mota = mota;
        this.quanly = quanly;
        this.dstaydua = dstaydua;
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

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public QuanLyDoiDua getQuanly() {
        return quanly;
    }

    public void setQuanly(QuanLyDoiDua quanly) {
        this.quanly = quanly;
    }

    public ArrayList<TayDua> getDstaydua() {
        return dstaydua;
    }

    public void setDstaydua(ArrayList<TayDua> dstaydua) {
        this.dstaydua = dstaydua;
    }

    @Override
    public String toString() {
        return "DoiDua{" + "id=" + id + ", ten=" + ten + ", hang=" + hang + ", mota=" + mota + ", quanly=" + quanly + ", dstaydua=" + dstaydua + '}';
    }

}
