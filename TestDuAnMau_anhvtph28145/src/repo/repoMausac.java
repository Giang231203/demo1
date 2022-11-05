/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Mausac;

/**
 *
 * @author User
 */
public interface repoMausac {

    ArrayList<Mausac> getAll();

    boolean insert(Mausac ms);

    boolean update(Mausac ms, String ma);

    boolean delete(String ma);
}
