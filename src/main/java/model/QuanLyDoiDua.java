/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anhnguyen
 */
public class QuanLyDoiDua extends ThanhVien {

    private String maquanly;

    public QuanLyDoiDua() {
    }

    public QuanLyDoiDua(String maquanly, int id, String username, String password, String chucvu, String hoten) {
        super(id, username, password, chucvu, hoten);
        this.maquanly = maquanly;
    }

    public String getMaquanly() {
        return maquanly;
    }

    public void setMaquanly(String maquanly) {
        this.maquanly = maquanly;
    }

    @Override
    public String toString() {
        return "QuanLyDoiDua{" + "maquanly=" + maquanly + '}';
    }

}
