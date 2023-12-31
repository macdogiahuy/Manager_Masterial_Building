/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private double gia;
    private String phanLoai;
    private String xuatXu;
    private int trangThai;

    
    public SanPham(String maSP, String tenSP, int soLuong, double gia, String phanLoai, String xuatXu,int trangThai)
    {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.gia = gia;
        this.phanLoai = phanLoai;
        this.xuatXu = xuatXu;
        this.trangThai = trangThai;
    }
    
    public SanPham(){
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public String getPhanLoai(){
        return phanLoai;
    }
    
    public void setPhanLoai(String phanLoai){
        this.phanLoai = phanLoai;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.maSP);
        hash = 41 * hash + Objects.hashCode(this.tenSP);
        hash = 41 * hash + this.soLuong;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.gia) ^ (Double.doubleToLongBits(this.gia) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.xuatXu);
        hash = 41 * hash + (phanLoai != null ? phanLoai.hashCode() : 0);
        hash = 41 * hash + this.trangThai;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SanPham other = (SanPham) obj;
        if (this.soLuong != other.soLuong) {
            return false;
        }
        if (Double.doubleToLongBits(this.gia) != Double.doubleToLongBits(other.gia)) {
            return false;
        }
        if (this.trangThai != other.trangThai) {
            return false;
        }
        if (!Objects.equals(this.maSP, other.maSP)) {
            return false;
        }
        if (!Objects.equals(this.tenSP, other.tenSP)) {
            return false;
        }
        if (!Objects.equals(this.xuatXu, other.xuatXu))
        {
            return false;
        }
        return Objects.equals(this.phanLoai, other.phanLoai);
    }   
}