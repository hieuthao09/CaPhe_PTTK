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
import pojo.ChucVu;
import pojo.LoaiSuCo;
import pojo.Nhanvien;

/**
 *
 * @author HieuThao
 */
public class Nhanvien_bll {
    private ExcuteData ex;
    
    public Nhanvien_bll(ExcuteData ex) {
        this.ex = ex;
    }
    public ArrayList<Nhanvien> laydanhsachNV_SC()
    {
        try {
            ArrayList<Nhanvien> dsnv = new ArrayList<>();
            ex.createStatement();
            ex.getKn().setRs(ex.getKn().getSt().executeQuery("select MaNV, HoTen, NgaySinh, SDT, CMND, nv.MACV, TenCV, GioiTinh from NhanVien nv, ChucVu cv where cv.MaCV = nv.MaCV"));
            while(ex.getKn().getRs().next())
            {
                ChucVu cv = new ChucVu(ex.getKn().getRs().getString(6), ex.getKn().getRs().getString(7));
                Nhanvien nv = new Nhanvien(ex.getKn().getRs().getString(1), ex.getKn().getRs().getString(2),ex.getKn().getRs().getString(3),ex.getKn().getRs().getString(4),ex.getKn().getRs().getString(5),cv,ex.getKn().getRs().getString(8));
                dsnv.add(nv);
            }
            return dsnv;
        } catch (SQLException ml) {
            Logger.getLogger(LoaiSuCo_bll.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
