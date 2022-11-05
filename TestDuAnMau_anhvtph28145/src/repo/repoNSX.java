/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo;

import java.util.ArrayList;
import model.NSX;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public interface repoNSX {

    ArrayList<NSX> getAll();

    boolean insert(NSX nsx);

    boolean update(NSX nsx, String ma);

    boolean delete(String ma);
}
