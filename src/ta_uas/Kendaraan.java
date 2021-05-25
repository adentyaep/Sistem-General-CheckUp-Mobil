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
public class Kendaraan extends Konsumen{
    
    private String namaMobil;
    private int roda;
    private String jbakar;

    public Kendaraan(String namaMobil, int roda, String jbakar, int kode, String nama, String alamat) {
        super(kode, nama, alamat);
        this.namaMobil = namaMobil;
        this.roda = roda;
        this.jbakar = jbakar;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
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
    
    
    
}
