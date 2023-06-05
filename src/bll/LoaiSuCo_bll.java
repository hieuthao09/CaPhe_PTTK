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
import pojo.LoaiSuCo;
import pojo.SuCo;

/**
 *
 * @author HieuThao
 */
public class LoaiSuCo_bll {
    private ExcuteData ex;
    
    public LoaiSuCo_bll(ExcuteData ex) {
        this.ex = ex;
    }
    public ArrayList<LoaiSuCo> laydanhsachLSC()
    {
        try {
            ArrayList<LoaiSuCo> dslsc = new ArrayList<>();
            ex.createStatement();
            ex.getKn().setRs(ex.getKn().getSt().executeQuery("select * from LoaiSuCo"));
            while(ex.getKn().getRs().next())
            {
                LoaiSuCo ml = new LoaiSuCo(ex.getKn().getRs().getString(1), ex.getKn().getRs().getString(2));
                dslsc.add(ml);
            }
            return dslsc;
        } catch (SQLException ml) {
            Logger.getLogger(LoaiSuCo_bll.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
