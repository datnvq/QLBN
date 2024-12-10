/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author Admin
 */

public class BenhAn {

    private int id;
    private String trieuChung;
    private String chanDoan;
    private String chiDinh;
    private String ketLuan;
    private String donThuoc;
    private Date ngayKham;

    public BenhAn() {
    }

    public BenhAn(int id, String trieuChung, String chanDoan, String chiDinh, String ketLuan, String donThuoc, Date ngayKham) {
        this.id = id;
        this.trieuChung = trieuChung;
        this.chanDoan = chanDoan;
        this.chiDinh = chiDinh;
        this.ketLuan = ketLuan;
        this.donThuoc = donThuoc;
        this.ngayKham = ngayKham;
    }

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getTrieuChung() {
        return trieuChung;
    }

    public void setTrieuChung(String trieuChung) {
        this.trieuChung = trieuChung;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public String getChiDinh() {
        return chiDinh;
    }

    public void setChiDinh(String chiDinh) {
        this.chiDinh = chiDinh;
    }

    public String getKetLuan() {
        return ketLuan;
    }

    public void setKetLuan(String ketLuan) {
        this.ketLuan = ketLuan;
    }

    public String getDonThuoc() {
        return donThuoc;
    }

    public void setDonThuoc(String donThuoc) {
        this.donThuoc = donThuoc;
    }

    public Date getNgayKham() { // Getter cho ngayKham
        return ngayKham;
    }

    public String getNgayKhamString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(ngayKham);
    }

    public void setNgayKham(Date ngayKham) { // Setter cho ngayKham
        this.ngayKham = ngayKham;
    }
}
