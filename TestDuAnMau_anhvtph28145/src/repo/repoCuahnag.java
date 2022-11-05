/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Cuahang;

/**
 *
 * @author User
 */
public interface repoCuahnag {
   ArrayList<Cuahang> getAll();

    boolean insert(Cuahang ch);

    boolean update(Cuahang ch, String ma);

    boolean delete(String ma);
}
