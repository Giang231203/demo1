package reopsitory;

import hibernateConfig.HibernateConfig;
import java.util.ArrayList;
import model.LopHoc;
import model.SinhVien;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenvv
 */
public class LopHocRepository {

    Session session = HibernateConfig.getFACTORY().openSession();

    public ArrayList<LopHoc> getList() {
        Query q = session.createQuery("From LopHoc");// truy vấn trên entity(HQL)
        ArrayList<LopHoc> list = (ArrayList<LopHoc>) q.getResultList();
        return list;
    }
    
}
