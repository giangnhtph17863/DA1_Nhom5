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
@Table(name = "PHIEUMUON")
public class PhieuMuon implements Serializable{
    @Id
    private String maPM;
    
    @Column
    private Date ngayMuon;
    
    @Column
    private Date ngayTra;
    
    @Column
    private Double tienCoc;
    
    @Column
    private String trangThai;
    
    @ManyToOne
    @JoinColumn(name= "maKH")
    private KhachHang khachHang;
    
    @ManyToOne
    @JoinColumn(name= "maNV")
    private NhanVien nhanVien;

    public PhieuMuon() {
    }

    public PhieuMuon(String maPM, Date ngayMuon, Date ngayTra, Double tienCoc, String trangThai, KhachHang khachHang, NhanVien nhanVien) {
        this.maPM = maPM;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.tienCoc = tienCoc;
        this.trangThai = trangThai;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
    }

    public String getMaPM() {
        return maPM;
    }

    public void setMaPM(String maPM) {
        this.maPM = maPM;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public Double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(Double tienCoc) {
        this.tienCoc = tienCoc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
    
    
}
