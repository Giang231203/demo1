/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Connect.jdbcUtil;
import java.sql.Connection;
import entity.Account;
import java.awt.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui.QLDFrame;
import Repository.AcountRepository;
/**
 *
 * @author tt
 */
public class AccountService {

    AcountRepository accountRepository;
    public Account login(String user,String pass) {
        accountRepository = new AcountRepository();
        Account account = accountRepository.login(user, pass);
        return account ;  
    }
}
