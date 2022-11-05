/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reopsitory;

import hibernateConfig.HibernateConfig;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenvv
 */
public class SinhVienRepository {

    Session session = HibernateConfig.getFACTORY().openSession();

    public ArrayList<SinhVien> getList() {
        Query q = session.createQuery("From SinhVien");// truy vấn trên entity(HQL)
        ArrayList<SinhVien> list = (ArrayList<SinhVien>) q.getResultList();
        return list;
    }

    public Boolean add(SinhVien sinhVien) {
        Transaction transaction = null;
        Integer check = 0;
        try (Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            check = (Integer) session.save(sinhVien);
            transaction.commit();
            System.out.println("ma hoa don" + check);
            return check > 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
