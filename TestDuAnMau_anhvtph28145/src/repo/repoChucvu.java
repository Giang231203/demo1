/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Chucvu;

/**
 *
 * @author User
 */
public interface repoChucvu {

    ArrayList<Chucvu> getAll();

    boolean insert(Chucvu cv);

    boolean update(Chucvu cv, String ma);

    boolean delete(String ma);

}
