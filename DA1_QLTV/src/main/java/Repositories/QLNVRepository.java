
package Repositories;

import Entities.NhanVien;
import Utillities.HibernateUtil;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class QLNVRepository implements IQLNVRepository{

    @Override
    public List<NhanVien> findAll(int position, int pageSize) {
        List<NhanVien> nhanvien;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String hql = "SELECT p FROM NhanVien p";
            TypedQuery<NhanVien> query = session.createNamedQuery(hql, NhanVien.class);
            query.setFirstResult(position);
            query.setMaxResults(pageSize);
            nhanvien = query.getResultList();         
        } 
        
        return nhanvien;
    }

    @Override
    public NhanVien findByMaNv(String MaNv) {
        NhanVien nhanvien;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM NhanVien p WHERE p.MaNV = :MaNV";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            query.setParameter("MaNV", MaNv);
            nhanvien = query.getSingleResult();
        }
        return nhanvien;
    }

    @Override
    public NhanVien save(NhanVien nhanvien) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(nhanvien);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                nhanvien = null;
            }
        } finally {
            return nhanvien;
        }
    }

//    @Override
//    public long dalete(long id) {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Transaction trans = session.getTransaction();
//            trans.begin();
//            try {
//                String hql = "DELETE Product p WHERE p.id = :id";
//                Query query = session.createQuery(hql);
//                query.setParameter("id", id);
//                int result = query.executeUpdate();
//                if (result == 0) {
//                    id = 0;
//                }
//                trans.commit();
//            } catch (Exception e) {
//                id = -1;
//            }
//           
//        }
//        return id;
//    }

    @Override
    public long totalCount() {
        long total = 0;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String statement = "SELECT COUNT(p.MaNV) FROM NhanVien p";
            TypedQuery<Long> query = session.createQuery(statement, Long.class);
            total = query.getSingleResult();
        }
        return total;
    }
    
}
