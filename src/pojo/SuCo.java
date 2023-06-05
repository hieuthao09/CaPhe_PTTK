/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo;


/**
 *
 * @author HieuThao
 */
public class SuCo {
    private String masc;
    private String tensc;
    private String MotaCT ;
    private String HinhThuc ;
    private double ChiPhi ;
    private String  TGXayRa ;
    private String  TGKetThuc ;
    private Nhanvien NguoiLap ;
    private LoaiSuCo MaLoai ;

    public SuCo(String masc, String tensc, String HinhThuc, double ChiPhi, String  TGXayRa, String  TGKetThuc, Nhanvien NguoiLap, LoaiSuCo MaLoai) {
        this.masc = masc;
        this.tensc = tensc;
        this.HinhThuc = HinhThuc;
        this.ChiPhi = ChiPhi;
        this.TGXayRa = TGXayRa;
        this.TGKetThuc = TGKetThuc;
        this.NguoiLap = NguoiLap;
        this.MaLoai = MaLoai;
    }

    public SuCo(String masc, String tensc, String MotaCT, String HinhThuc, double ChiPhi, String  TGXayRa, String  TGKetThuc, Nhanvien NguoiLap, LoaiSuCo MaLoai) {
        this.masc = masc;
        this.tensc = tensc;
        this.MotaCT = MotaCT;
        this.HinhThuc = HinhThuc;
        this.ChiPhi = ChiPhi;
        this.TGXayRa = TGXayRa;
        this.TGKetThuc = TGKetThuc;
        this.NguoiLap = NguoiLap;
        this.MaLoai = MaLoai;
    }
    public SuCo() {
    }

    public String getMasc() {
        return masc;
    }

    public void setMasc(String masc) {
        this.masc = masc;
    }

    public String getTensc() {
        return tensc;
    }

    public void setTensc(String tensc) {
        this.tensc = tensc;
    }

    public String getMotaCT() {
        return MotaCT;
    }

    public void setMotaCT(String MotaCT) {
        this.MotaCT = MotaCT;
    }

    public String getHinhThuc() {
        return HinhThuc;
    }

    public void setHinhThuc(String HinhThuc) {
        this.HinhThuc = HinhThuc;
    }

    public double getChiPhi() {
        return ChiPhi;
    }

    public void setChiPhi(double ChiPhi) {
        this.ChiPhi = ChiPhi;
    }

    public String  getTGXayRa() {
        return TGXayRa;
    }

    public void setTGXayRa(String  TGXayRa) {
        this.TGXayRa = TGXayRa;
    }

    public String  getTGKetThuc() {
        return TGKetThuc;
    }

    public void setTGKetThuc(String  TGKetThuc) {
        this.TGKetThuc = TGKetThuc;
    }

    public Nhanvien getNguoiLap() {
        return NguoiLap;
    }

    public void setNguoiLap(Nhanvien NguoiLap) {
        this.NguoiLap = NguoiLap;
    }

    public LoaiSuCo getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(LoaiSuCo MaLoai) {
        this.MaLoai = MaLoai;
    }
    
    
    
}
