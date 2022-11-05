
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Hoc_ky;


public class HocKyRepository {
    public ArrayList<Hoc_ky> getAll() throws Exception {
        ArrayList<Hoc_ky> listHk = new ArrayList<>();
        
        
            Connection conn = DBContext.getConnection();
            String query = "SELECT id,ten,co_so,so_sv_nhap_hoc FROM hoc_ky";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                String coSo = rs.getString("co_so");
//                Date ngayBatDau = rs.getDate("ngay_bat_dau");
//                Date ngayKetThuc = rs.getDate("ngay_ket_thuc");
                int soSv = rs.getInt("so_sv_nhap_hoc");
                
                Hoc_ky hk = new Hoc_ky(id, ten, coSo, null, null, soSv);
                listHk.add(hk);
            }
            
        
        
        return listHk;
    }
    
    
}
