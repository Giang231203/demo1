/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Nhanvien;

/**
 *
 * @author User
 */
public interface repoNhanvien {

    ArrayList<Nhanvien> getAll();

    boolean insert(Nhanvien nv);

    boolean update(Nhanvien nv, String ma);

    boolean delete(String id);

}
