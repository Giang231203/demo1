/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Dongsp;

/**
 *
 * @author User
 */
public interface repodongsp {

    ArrayList<Dongsp> getAll();

    boolean insert(Dongsp sp);

    boolean update(Dongsp sp, String ma);

    boolean delete(String ma);

}
