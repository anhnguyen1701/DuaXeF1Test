/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anhnguyen
 */
public class DangKiThiDau {

    private int id;
    private ChangDua changDua;
    private TayDua tayDua;
    private int sovongduahoanthanh;
    private String thoigianvedich;
    private int diem;

    public DangKiThiDau() {
    }

    public DangKiThiDau(int id, ChangDua changDua, TayDua tayDua, int sovongduahoanthanh, String thoigianvedich, int diem) {
        this.id = id;
        this.changDua = changDua;
        this.tayDua = tayDua;
        this.sovongduahoanthanh = sovongduahoanthanh;
        this.thoigianvedich = thoigianvedich;
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ChangDua getChangDua() {
        return changDua;
    }

    public void setChangDua(ChangDua changDua) {
        this.changDua = changDua;
    }

    public TayDua getTayDua() {
        return tayDua;
    }

    public void setTayDua(TayDua tayDua) {
        this.tayDua = tayDua;
    }

    public int getSovongduahoanthanh() {
        return sovongduahoanthanh;
    }

    public void setSovongduahoanthanh(int sovongduahoanthanh) {
        this.sovongduahoanthanh = sovongduahoanthanh;
    }

    public String getThoigianvedich() {
        return thoigianvedich;
    }

    public void setThoigianvedich(String thoigianvedich) {
        this.thoigianvedich = thoigianvedich;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "DangKiThiDau{" + "id=" + id + ", changDua=" + changDua + ", tayDua=" + tayDua + ", sovongduahoanthanh=" + sovongduahoanthanh + ", thoigianvedich=" + thoigianvedich + ", diem=" + diem + '}';
    }

}
