/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anhnguyen
 */
public class ChangDua {

    private int id;
    private String ten;
    private int sovongdua;
    private String thoigianbatdau;
    private DiaDiem diaDiem;
    private String mota;
    private MuaGiai muaGiai;

    public ChangDua() {
    }

    public ChangDua(int id, String ten, int sovongdua, String thoigianbatdau, DiaDiem diaDiem, String mota, MuaGiai muaGiai) {
        this.id = id;
        this.ten = ten;
        this.sovongdua = sovongdua;
        this.thoigianbatdau = thoigianbatdau;
        this.diaDiem = diaDiem;
        this.mota = mota;
        this.muaGiai = muaGiai;
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

    public int getSovongdua() {
        return sovongdua;
    }

    public void setSovongdua(int sovongdua) {
        this.sovongdua = sovongdua;
    }

    public String getThoigianbatdau() {
        return thoigianbatdau;
    }

    public void setThoigianbatdau(String thoigianbatdau) {
        this.thoigianbatdau = thoigianbatdau;
    }

    public DiaDiem getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(DiaDiem diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public MuaGiai getMuaGiai() {
        return muaGiai;
    }

    public void setMuaGiai(MuaGiai muaGiai) {
        this.muaGiai = muaGiai;
    }

    @Override
    public String toString() {
        return "ChangDua{" + "id=" + id + ", ten=" + ten + ", sovongdua=" + sovongdua + ", thoigianbatdau=" + thoigianbatdau + ", diaDiem=" + diaDiem + ", mota=" + mota + ", muaGiai=" + muaGiai + '}';
    }

}
