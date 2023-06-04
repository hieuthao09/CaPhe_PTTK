/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import dao.JDBCConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ExcuteData {
    JDBCConnect kn;

    
    public ExcuteData() {
        kn = new JDBCConnect();
    }
    public ExcuteData(String user, String pass, String database, String server) {
        kn = new JDBCConnect(user,pass,database,server);
    }

    public ExcuteData(JDBCConnect kn) {
        this.kn = kn;
    }
    public JDBCConnect getKn() {
        return kn;
    }
    public void createStatement()
    {
        try {
            kn.st = kn.con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ExcuteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Vector<String> GetDataVectorNXB(String strSQL, int praremeter)
    {
        Vector<String> t = new Vector<String>();
        createStatement();
        try {
            kn.rs = kn.st.executeQuery(strSQL);
            while(kn.rs.next())
            {
                t.add(kn.rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExcuteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }
     public Vector GetDataVector(String strSQL, int praremeter)
    {
        Vector t = new Vector();
        createStatement();
        try {
            kn.rs = kn.st.executeQuery(strSQL);
            while(kn.rs.next())
            {
                Vector<String> dl = new Vector<String>();
                for(int i = 1; i<=praremeter;i++ )
                {
                     dl.add(kn.rs.getString(i).trim());
                }
                t.add(dl);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ExcuteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }
    public boolean excuteDataDB(String strSQL)
    {
        createStatement();
        try {
            int x = kn.st.executeUpdate(strSQL);
            if(x>=1)
            {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(ExcuteData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean check(String strSQL)
    {
        createStatement();
        try {
            kn.rs = kn.st.executeQuery(strSQL);
            while(kn.rs.next())
            {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(ExcuteData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}