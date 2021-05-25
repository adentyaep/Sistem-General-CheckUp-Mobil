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
public class Servis {
    private String part;
    private int kerusakan;

    public Servis(String part, int kerusakan) {
        setPart(part);
        setKerusakan(kerusakan);
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public int getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(int kerusakan) {
        this.kerusakan = kerusakan;
    }
    
    public String kategori(int kerusakan){
        if (kerusakan <= 30){
            return "Ringan";
        } else if (kerusakan <= 70){
            return "Sedang";
        } else {
            return "Berat";
        }
    }
}
