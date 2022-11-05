package Repository;

import DomainModel.ChucVu;
import Utilities.JdbcHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChucVuRepository {
    private Connection conn;
    
    public ChucVuRepository()
    {
        this.conn = JdbcHelper.getConnection();
    }
    
    public List<ChucVu> findAll()
    {
        List<ChucVu> ds = new ArrayList<>();
        
        String sql = "SELECT id, ma, ten FROM ChucVu";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                
                ChucVu cv = new ChucVu(id, ma, ten);
                ds.add(cv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return ds;
    }
    
    public void insert(ChucVu domainModel)
    {
        String sql = "INSERT INTO ChucVu(ma, ten) VALUES (?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, domainModel.getMa());
            ps.setString(2, domainModel.getTen());
            
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
