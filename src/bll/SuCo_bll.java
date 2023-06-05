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
import pojo.Nhanvien;
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
    public ArrayList<SuCo> laydanhsachSC()
    {
        try {
            ArrayList<SuCo> dssc = new ArrayList<>();
            ex.createStatement();
            ex.getKn().setRs(ex.getKn().getSt().executeQuery("select masc, tensc, MotaCT, HinhThuc, ChiPhi, CONVERT(nvarchar,TGXayRa), CONVERT(nvarchar,TGKetThuc), sc.MaLoai, TenLoai, nv.MaNV, nv.HoTen, nv.NgaySinh, nv.SDT, nv.CMND from SuCo sc, LoaiSuCo lsc, NhanVien nv where sc.MaLoai = lsc.MaLoai and sc.NguoiLap = nv.MaNV"));
            while(ex.getKn().getRs().next())
            {
                LoaiSuCo ml = new LoaiSuCo(ex.getKn().getRs().getString(8), ex.getKn().getRs().getString(9));
                Nhanvien nv =  new Nhanvien(ex.getKn().getRs().getString(10),ex.getKn().getRs().getString(11),ex.getKn().getRs().getString(12),ex.getKn().getRs().getString(13),ex.getKn().getRs().getString(14));
                SuCo sc = new SuCo(ex.getKn().getRs().getString(1), ex.getKn().getRs().getString(2),ex.getKn().getRs().getString(3), ex.getKn().getRs().getString(4),ex.getKn().getRs().getDouble(5), ex.getKn().getRs().getString(6),ex.getKn().getRs().getString(7),nv,ml);
                dssc.add(sc);
            }
            return dssc;
        } catch (SQLException ex) {
            Logger.getLogger(SuCo_bll.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    //insert into SuCo(tensc, MotaCT, HinhThuc, ChiPhi, TGXayRa, TGKetThuc, NguoiLap, MaLoai) values(N'%s', N'%s', N'%s', %s, '%s', '%s', '%s', %s)
    public boolean them(SuCo sc)
    {
        String strSQL = String.format("insert into SuCo(tensc, MotaCT, HinhThuc, ChiPhi, TGXayRa, TGKetThuc, NguoiLap, MaLoai) values(N'%s', N'%s', N'%s', %s, '%s', '%s', '%s', %s)",  sc.getTensc(), sc.getMotaCT(), sc.getHinhThuc(), sc.getChiPhi(), sc.getTGXayRa(), sc.getTGKetThuc(), sc.getNguoiLap().getMaNV(), sc.getMaLoai().getMaloai());
        return ex.excuteDataDB(strSQL);
    }
    public boolean capnhat(SuCo sc)
    {
        String strSQL = String.format("update SuCo set tensc = N'%s', MotaCT = N'%s', HinhThuc = N'%s', ChiPhi = %s,  TGXayRa = '%s', TGKetThuc = '%s', NguoiLap = '%s', MaLoai = %s where MaSC = %s", sc.getTensc(), sc.getMotaCT(), sc.getHinhThuc(), sc.getChiPhi(), sc.getTGXayRa(), sc.getTGKetThuc(), sc.getNguoiLap().getMaNV(), sc.getMaLoai().getMaloai(), sc.getMasc());
        return ex.excuteDataDB(strSQL);
    }
    public boolean xoa(String masc)
    {
        String strSQL = String.format("Delete from suco where MaSC = %s", masc);
        return ex.excuteDataDB(strSQL);
    }
     public ArrayList<SuCo> timKiemSC(String masc)
    {
        try {
            ArrayList<SuCo> dssc = new ArrayList<>();
            ex.createStatement();
            ex.getKn().setRs(ex.getKn().getSt().executeQuery(String.format("select masc, tensc, MotaCT, HinhThuc, ChiPhi, CONVERT(nvarchar,TGXayRa), CONVERT(nvarchar,TGKetThuc), sc.MaLoai, TenLoai, nv.MaNV, nv.HoTen, nv.NgaySinh, nv.SDT, nv.CMND from SuCo sc, LoaiSuCo lsc, NhanVien nv where sc.MaLoai = lsc.MaLoai and sc.NguoiLap = nv.MaNV and sc.MaSC = %s",masc )));
            while(ex.getKn().getRs().next())
            {
                LoaiSuCo ml = new LoaiSuCo(ex.getKn().getRs().getString(8), ex.getKn().getRs().getString(9));
                Nhanvien nv =  new Nhanvien(ex.getKn().getRs().getString(10),ex.getKn().getRs().getString(11),ex.getKn().getRs().getString(12),ex.getKn().getRs().getString(13),ex.getKn().getRs().getString(14));
                SuCo sc = new SuCo(ex.getKn().getRs().getString(1), ex.getKn().getRs().getString(2),ex.getKn().getRs().getString(3), ex.getKn().getRs().getString(4),ex.getKn().getRs().getDouble(5), ex.getKn().getRs().getString(6),ex.getKn().getRs().getString(7),nv,ml);
                dssc.add(sc);
            }
            return dssc;
        } catch (SQLException ex) {
            Logger.getLogger(SuCo_bll.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
