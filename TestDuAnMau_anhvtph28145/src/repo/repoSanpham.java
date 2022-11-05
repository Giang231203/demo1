/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Sanpham;

/**
 *
 * @author User
 */
public interface repoSanpham {

    ArrayList<Sanpham> getall();

    boolean insert(Sanpham sp);

    boolean update(Sanpham sp, String ma);

    boolean delete(String ma);

}
