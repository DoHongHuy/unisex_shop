package com.og.service;

import com.og.model.Account;
import com.og.utils.MySQLConnUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginService {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public Account checkLogin(String user, String pass){
        try {
            System.out.println("vào đay ko z");
            String query = "SELECT * FROM case_study.user_login WHERE username = ? and password = ?";
            conn = new MySQLConnUtils().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            System.out.println("lỗi tai user");
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println("nhận dc next");
                Account a = new Account(rs.getString(1), rs.getString(2));
                System.out.println("ra dc nè");
                return a;

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("sai rpo");
        }
        System.out.println("bay mau");
        return null;
    }
}
