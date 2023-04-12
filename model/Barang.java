/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Noval
 */
public class Barang {
    private String kode, nama, merek;
    private int jumlah, harga;
    
    public String getKode() {
        return kode;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    
     public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
     public String getMerek() {
        return merek;
    }
    
    public void setMerek(String merek) {
        this.merek = merek;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
}
