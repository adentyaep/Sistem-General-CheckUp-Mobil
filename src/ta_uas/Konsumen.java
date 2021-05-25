/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_uas;

/**
 *
 * @author USER
 */
public class Konsumen {
    private int kode;
    private String nama;
    private String alamat;
    private Part[] listPart = new Part[10];
    private int itungPart=0;

    public Konsumen(int kode, String nama, String alamat) {
        setKode(kode);
        setNama(nama);
        setAlamat(alamat);
//        this.kode = kode;
//        this.nama = nama;
//        this.alamat = alamat;
    }
    
    public void addPart(Part s){
        listPart[itungPart] = s;
        itungPart++;
    }
    
    public int getItungPart() {
        return itungPart;
    }
    
    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Part[] getListPart() {
        return listPart;
    }

    public void setListPart(Part[] listPart) {
        this.listPart = listPart;
    }
}
