package Service;

import Entities.NhanVien;
import Repositories.IQLNVRepository;
import Repositories.QLNVRepository;
import java.util.ArrayList;
import java.util.List;

public class QLNVService implements IQLNVService {

    private final IQLNVRepository iQlnvRepository;

    private List<NhanVien> lstQlnv;

    public QLNVService() {
        iQlnvRepository = new QLNVRepository();
        lstQlnv = new ArrayList<>();
    }

    @Override
    public List<NhanVien> getQuanLyNV(int position, int pageSize) {
        lstQlnv = new ArrayList<>();
        var product = iQlnvRepository.findAll(position, pageSize);
        for (NhanVien x : product) {
            lstQlnv.add(new NhanVien(x.getMaNV(), x.getTenNV(), x.getMatKhau(),x.getGioiTinh(), x.getNgaySinh(),x.getSĐT(), x.getEmail(),x.getDiaChi(),x.getVaiTro(),x.getTrangThai()));
        }
        return lstQlnv;
    }

    @Override
    public NhanVien getNvByMaNV(String MaNV) {
        var x = iQlnvRepository.findByMaNv(MaNV);
    return new NhanVien(x.getMaNV(), x.getTenNV(), x.getMatKhau(),x.getGioiTinh(), x.getNgaySinh(),x.getSĐT(), x.getEmail(),x.getDiaChi(),x.getVaiTro(),x.getTrangThai());
    }

    @Override
    public NhanVien createNewNv(NhanVien nhanvien) {
        nhanvien.setMaNV(null);
    var x = iQlnvRepository.save(new NhanVien(nhanvien.getMaNV(), nhanvien.getTenNV(), nhanvien.getMatKhau(),nhanvien.getGioiTinh(), nhanvien.getNgaySinh(),nhanvien.getSĐT(), nhanvien.getEmail(),nhanvien.getDiaChi(),nhanvien.getVaiTro(),nhanvien.getTrangThai()));
    return new NhanVien(x.getMaNV(), x.getTenNV(), x.getMatKhau(),x.getGioiTinh(), x.getNgaySinh(),x.getSĐT(), x.getEmail(),x.getDiaChi(),x.getVaiTro(),x.getTrangThai());
    }

    @Override
    public NhanVien updateNvByMaNV(NhanVien nhanvien) {
        var x = iQlnvRepository.save(new NhanVien(nhanvien.getMaNV(), nhanvien.getTenNV(), nhanvien.getMatKhau(),nhanvien.getGioiTinh(), nhanvien.getNgaySinh(),nhanvien.getSĐT(), nhanvien.getEmail(),nhanvien.getDiaChi(),nhanvien.getVaiTro(),nhanvien.getTrangThai()));
    return new NhanVien(x.getMaNV(), x.getTenNV(), x.getMatKhau(),x.getGioiTinh(), x.getNgaySinh(),x.getSĐT(), x.getEmail(),x.getDiaChi(),x.getVaiTro(),x.getTrangThai());
    }

    @Override
    public long countAllNv() {
        return iQlnvRepository.totalCount();
    }

}
