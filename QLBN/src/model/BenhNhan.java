/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BenhNhan implements Serializable {

    private static final long serialVersionUID = 1L;

    private int Id;
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private int dienThoai;
    //private List<BenhAn> hosobenhan;

    public BenhNhan() {
    }

    public BenhNhan(int Id, String hoTen, int tuoi, String diaChi, int dienThoai) {
        this.Id = Id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        //this.hosobenhan = new ArrayList<>();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(int dienThoai) {
        this.dienThoai = dienThoai;
        
    }
}
