/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;

import dao.ExcuteData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.TaiKhoan;
/**
 *
 * @author HieuThao
 */
public class TaiKhoan_bll {
    private ExcuteData ex;
    
    public TaiKhoan_bll(ExcuteData ex) {
        this.ex = ex;
    }
    public ArrayList GetData(String strSQL)
    {
        try {
            ArrayList<TaiKhoan> dstk = new ArrayList<TaiKhoan>();
            ex.createStatement();
            ex.getKn().setRs(ex.getKn().getSt().executeQuery(strSQL));
            while(ex.getKn().getRs().next())
            {
                TaiKhoan tk = new TaiKhoan(ex.getKn().getRs().getString(0), ex.getKn().getRs().getString(1), ex.getKn().getRs().getString(2));
                dstk.add(tk);
            }
            return dstk;
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan_bll.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public boolean checkTaiKhoan(TaiKhoan tk)
    {
        String strSQL = String.format("select * from taikhoan where tendn = '%s' and matkhau = '%s'", tk.getTenDN(), tk.getMatKhau());
        return ex.check(strSQL);
    }
}
