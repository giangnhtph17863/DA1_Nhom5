/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.Serializable;
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
@Table(name = "PHIEUTRA")
public class PhieuTra implements Serializable{
    @Id
    @ManyToOne
    @JoinColumn(name="maPM")
    private PhieuMuon phieuMuon;
    
    @Id
    @ManyToOne
    @JoinColumn(name="maSach")
    private Sach maSach;
    
    @Column
    private Double soTienCoc;
    
    @Column
    private Double tienPhat;

    public PhieuTra() {
    }

    public PhieuTra(PhieuMuon phieuMuon, Sach maSach, Double soTienCoc, Double tienPhat) {
        this.phieuMuon = phieuMuon;
        this.maSach = maSach;
        this.soTienCoc = soTienCoc;
        this.tienPhat = tienPhat;
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

    public Double getSoTienCoc() {
        return soTienCoc;
    }

    public void setSoTienCoc(Double soTienCoc) {
        this.soTienCoc = soTienCoc;
    }

    public Double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(Double tienPhat) {
        this.tienPhat = tienPhat;
    }
    
    
}
