/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anhnguyen
 */
public class ThanhVien {

    private int id;
    private String username, password, chucvu, hoten;

    public ThanhVien() {
    }

    public ThanhVien(int id, String username, String password, String chucvu, String hoten) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.chucvu = chucvu;
        this.hoten = hoten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public String toString() {
        return "ThanhVien{" + "id=" + id + ", username=" + username + ", password=" + password + ", chucvu=" + chucvu + ", hoten=" + hoten + '}';
    }

}
