package Service;

import Entities.NhanVien;
import java.util.List;

public interface IQLNVService {
    List<NhanVien> getQuanLyNV(int position, int pageSize);
    
    NhanVien getNvByMaNV(String MaNV);
    
    NhanVien createNewNv(NhanVien nhanvien);
    
    NhanVien updateNvByMaNV(NhanVien nhanvien);
    
    long countAllNv();
}
