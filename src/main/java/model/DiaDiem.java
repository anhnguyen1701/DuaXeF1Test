/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anhnguyen
 */
public class DiaDiem {

    private int id;
    private String ten, toado, diemxuatphat, diemketthuc;
    private float sokm;

    public DiaDiem() {
    }

    public DiaDiem(int id, String ten, String toado, String diemxuatphat, String diemketthuc, float sokm) {
        this.id = id;
        this.ten = ten;
        this.toado = toado;
        this.diemxuatphat = diemxuatphat;
        this.diemketthuc = diemketthuc;
        this.sokm = sokm;
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

    public String getToado() {
        return toado;
    }

    public void setToado(String toado) {
        this.toado = toado;
    }

    public String getDiemxuatphat() {
        return diemxuatphat;
    }

    public void setDiemxuatphat(String diemxuatphat) {
        this.diemxuatphat = diemxuatphat;
    }

    public String getDiemketthuc() {
        return diemketthuc;
    }

    public void setDiemketthuc(String diemketthuc) {
        this.diemketthuc = diemketthuc;
    }

    public float getSokm() {
        return sokm;
    }

    public void setSokm(float sokm) {
        this.sokm = sokm;
    }

    @Override
    public String toString() {
        return "DiaDiem{" + "id=" + id + ", ten=" + ten + ", toado=" + toado + ", diemxuatphat=" + diemxuatphat + ", diemketthuc=" + diemketthuc + ", sokm=" + sokm + '}';
    }

}
