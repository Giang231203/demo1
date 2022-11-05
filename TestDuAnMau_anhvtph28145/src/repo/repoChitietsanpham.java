/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Chitietsp;

/**
 *
 * @author User
 */
public interface repoChitietsanpham {

    ArrayList<Chitietsp> getAll();

    boolean insert(Chitietsp ctsp);

    boolean update(Chitietsp ctsp, String id);

    boolean delete(String id);

}
