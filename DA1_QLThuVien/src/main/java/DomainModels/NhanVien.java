/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModels;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "NHANVIEN")
public class NhanVien implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column
  private String maNV;
  
  @Column
  private String tenNV;
  
  @Column
  private boolean gioiTinh;
  
  @Column
  private Date ngaySinh;
  
  @Column
  private String sdt;
  
  @Column
  private boolean vaiTro;
  
    @Column
  private boolean trangThai;
  
}
