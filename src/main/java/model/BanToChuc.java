/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anhnguyen
 */
public class BanToChuc extends ThanhVien {

    private String mabtc;

    public BanToChuc() {
    }

    public BanToChuc(String mabtc, int id, String username, String password, String chucvu, String hoten) {
        super(id, username, password, chucvu, hoten);
        this.mabtc = mabtc;
    }

    public String getMabtc() {
        return mabtc;
    }

    public void setMabtc(String mabtc) {
        this.mabtc = mabtc;
    }

    @Override
    public String toString() {
        return "BanToChuc{" + "mabtc=" + mabtc + '}';
    }
}
