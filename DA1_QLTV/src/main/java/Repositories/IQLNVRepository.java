package Repositories;

import Entities.NhanVien;
import java.util.List;

public interface IQLNVRepository {
    List<NhanVien> findAll(int position, int pageSize);
    NhanVien findByMaNv(String MaNv);
    NhanVien save(NhanVien nhanvien);
//    long dalete(long id);
    long totalCount();
}
