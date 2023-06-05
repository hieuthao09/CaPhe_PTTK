/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;

import dao.ExcuteData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.LoaiSuCo;
import pojo.SuCo;

/**
 *
 * @author HieuThao
 */
public class SuCo_bll {
    private ExcuteData ex;
    
    public SuCo_bll(ExcuteData ex) {
        this.ex = ex;
    }
    public ArrayList<SuCo> GetData()
    {
        try {
            ArrayList<SuCo> dssc = new ArrayList<>();
            ex.createStatement();
            ex.getKn().setRs(ex.getKn().getSt().executeQuery("select masc, tensc, MotaCT, HinhThuc, ChiPhi, CONVERT(nvarchar,TGXayRa), CONVERT(nvarchar,TGKetThuc), NguoiLap, sc.MaLoai, TenLoai from SuCo sc, LoaiSuCo lsc where sc.MaLoai = lsc.MaLoai"));
            while(ex.getKn().getRs().next())
            {
                LoaiSuCo ml = new LoaiSuCo(ex.getKn().getRs().getString(9), ex.getKn().getRs().getString(10));
                SuCo sc = new SuCo(ex.getKn().getRs().getString(1), ex.getKn().getRs().getString(2),ex.getKn().getRs().getString(3), ex.getKn().getRs().getString(4),ex.getKn().getRs().getDouble(5), ex.getKn().getRs().getString(6),ex.getKn().getRs().getString(7), ex.getKn().getRs().getString(8),ml);
                dssc.add(sc);
            }
            return dssc;
        } catch (SQLException ex) {
            Logger.getLogger(SuCo_bll.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
