/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Toan
 */
@Entity
@Table(name= "SACH")
public class Sach implements Serializable{
    @Id
    private String maSach;
    
    @Column
    private String NXB;
    
    @Column
    private String tenSach;
    
    @Column
    private String noiDat;
    
    @Column
    private Double giaTien;
    
    @Column
    private String tacGia;
    
    @Column
    private Date namXB;
    
    @Column
    private int soLuong;
    
    @ManyToOne
    @JoinColumn(name="id_TL")
    private TheLoai maTL;

    public Sach() {
    }

    public Sach(String maSach, String NXB, String tenSach, String noiDat, Double giaTien, String tacGia, Date namXB, int soLuong, TheLoai maTL) {
        this.maSach = maSach;
        this.NXB = NXB;
        this.tenSach = tenSach;
        this.noiDat = noiDat;
        this.giaTien = giaTien;
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.soLuong = soLuong;
        this.maTL = maTL;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNoiDat() {
        return noiDat;
    }

    public void setNoiDat(String noiDat) {
        this.noiDat = noiDat;
    }

    public Double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Double giaTien) {
        this.giaTien = giaTien;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Date getNamXB() {
        return namXB;
    }

    public void setNamXB(Date namXB) {
        this.namXB = namXB;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public TheLoai getMaTL() {
        return maTL;
    }

    public void setMaTL(TheLoai maTL) {
        this.maTL = maTL;
    }

   
}
