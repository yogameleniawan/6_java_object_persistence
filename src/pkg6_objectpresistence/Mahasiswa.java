/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_objectpresistence;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Pamungkas
 */
public class Mahasiswa implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String nim;
    private String nama;
    private String prodi;
    private String jurusan;
    private String ipk;

    public Mahasiswa(){
        
    }
    
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    
    public Mahasiswa(String nim, String nama,  String jurusan,String prodi, String ipk) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public String getIpk() {
        return ipk;
    }

    public void setIpk(String ipk) {
        this.ipk = ipk;
    }       

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + '}';
    }
}
