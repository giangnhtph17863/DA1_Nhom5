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
@Table(name = "CTPHIEUMUON")
public class CTPhieuMuon implements Serializable{
    @Id
    @ManyToOne
    @JoinColumn(name= "maPM")
    private PhieuMuon phieuMuon;
    
    @Id
    @ManyToOne
    @JoinColumn(name= "maSach")
    private Sach maSach;
    
    @Column
    private String tinhTrang;
    
    @Column
    private Double tienPhat;
    
    @Column
    private Date ngayTra;
    
    @Column
    private String ghiChu;

    public CTPhieuMuon() {
    }

    public CTPhieuMuon(PhieuMuon phieuMuon, Sach maSach, String tinhTrang, Double tienPhat, Date ngayTra, String ghiChu) {
        this.phieuMuon = phieuMuon;
        this.maSach = maSach;
        this.tinhTrang = tinhTrang;
        this.tienPhat = tienPhat;
        this.ngayTra = ngayTra;
        this.ghiChu = ghiChu;
    }

    public PhieuMuon getPhieuMuon() {
        return phieuMuon;
    }

    public void setPhieuMuon(PhieuMuon phieuMuon) {
        this.phieuMuon = phieuMuon;
    }

    public Sach getMaSach() {
        return maSach;
    }

    public void setMaSach(Sach maSach) {
        this.maSach = maSach;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(Double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

   
    
}
