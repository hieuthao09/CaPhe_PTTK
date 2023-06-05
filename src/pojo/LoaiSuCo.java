/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo;

/**
 *
 * @author HieuThao
 */
public class LoaiSuCo {
    private String maloai;
    private String tenLoai;

    @Override
    public String toString() {
        return tenLoai;
    }
    
    public LoaiSuCo() {
    }

    public LoaiSuCo(String maloai, String tenLoai) {
        this.maloai = maloai;
        this.tenLoai = tenLoai;
    }

    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
    
}
