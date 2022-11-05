/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository.Iplm;

import Respository.*;
import DomainModel.MauSac;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Utilities.SQLServerConnection;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class mauSacRespository implements IMauSacRespository {

    @Override
    public List<MauSac> getAll() {
        String query = "select * from FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041.dbo.MauSac";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<MauSac> listMauSac = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                listMauSac.add(ms);
            }
            return listMauSac;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public MauSac add(MauSac ms) {
        String query = "INSERT INTO [dbo].[MauSac]"
                + "           ([Ma]"
                + "           ,[Ten])"
                + "     VALUES(?,?)";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, ms.getMaMauSac());
            ps.setObject(2, ms.getTenMauSac());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return ms;
    }

    @Override
    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[MauSac]"
                + "      WHERE Ma = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public MauSac update(MauSac ms, String ma) {
        String query = "UPDATE [dbo].[MauSac]"
                + "   SET [Ten] = ?"
                + " WHERE [Ma] = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, ms.getTenMauSac());
            ps.setObject(2, ma);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return ms;
    }

    public static void main(String[] args) {
        List<MauSac> listmauSac = new ArrayList<>();
        for (MauSac mauSac : listmauSac) {
            System.out.println(mauSac.toString());
        }

//        MauSac ms = new MauSac("ms2", "Xanh Dương");
//        MauSac add = new mauSacRespository().add(ms);
//        System.out.println(add);
//        boolean delete = new mauSacRespository().delete("ms3");
//        System.out.println(delete);
//        MauSac ms = new MauSac("ms4", "Xanh Lá");
//        MauSac ms1 = new mauSacRespository().update(ms, "ms4");
//        System.out.println(ms1);

    }

}
