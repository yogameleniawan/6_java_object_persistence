/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_objectpresistence;

import java.io.Serializable;

/**
 *
 * @author Pamungkas
 */
public class MataKuliah implements Serializable {

    private static final long serialVersionUID
            = 5559055602375093688L;
    private String kodeMk;
    private transient String nama;
    private static byte sks;

    public MataKuliah(String kodeMk, String nama, byte sks) {
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKodeMk() {
        return kodeMk;
    }

    public void setKodeMk(String kodeMk) {
        this.kodeMk = kodeMk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public byte getSks() {
        return sks;
    }

    public void setSks(byte sks) {
        this.sks = sks;
    }

    @Override
    public String toString() {
        return "MataKuliah{" + "kodeMk=" + kodeMk + ", nama=" + nama
                + ", sks=" + sks + '}';
    }
}
