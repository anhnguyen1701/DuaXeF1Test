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
public class MuaGiai {

    private int id;
    private String ten, namtochuc;
    private BanToChuc banToChuc;
    private ArrayList<ChangDua> dschangdua;

    public MuaGiai() {
    }

    public MuaGiai(int id, String ten, String namtochuc, BanToChuc banToChuc, ArrayList<ChangDua> dschangdua) {
        this.id = id;
        this.ten = ten;
        this.namtochuc = namtochuc;
        this.banToChuc = banToChuc;
        this.dschangdua = dschangdua;
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

    public String getNamtochuc() {
        return namtochuc;
    }

    public void setNamtochuc(String namtochuc) {
        this.namtochuc = namtochuc;
    }

    public BanToChuc getBanToChuc() {
        return banToChuc;
    }

    public void setBanToChuc(BanToChuc banToChuc) {
        this.banToChuc = banToChuc;
    }

    public ArrayList<ChangDua> getDschangdua() {
        return dschangdua;
    }

    public void setDschangdua(ArrayList<ChangDua> dschangdua) {
        this.dschangdua = dschangdua;
    }

    @Override
    public String toString() {
        return "MuaGiai{" + "id=" + id + ", ten=" + ten + ", namtochuc=" + namtochuc + ", banToChuc=" + banToChuc + ", dschangdua=" + dschangdua + '}';
    }

}
