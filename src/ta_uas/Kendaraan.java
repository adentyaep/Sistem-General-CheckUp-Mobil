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
public class Kendaraan {
    private int kode;
    private String nama;
    private int roda;
    private String jbakar;
    
    
    public Kendaraan (int kode, String nama, int roda, String jbakar){
        this.kode = kode;
        this.nama = nama;
        this.roda = roda;
        this.jbakar = jbakar;
    }
    
    public Kendaraan(){
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public String getJbakar() {
        return jbakar;
    }

    public void setJbakar(String jbakar) {
        this.jbakar = jbakar;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }
    
}
