/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_uas;

/**
 *
 * @author Elkus Studio
 */
public class CetakKonsumen {
    public static void main(String[] args) {
        Konsumen a1 = new Konsumen(1, "Adentya", "Brebes");
        a1.addPart(new Part("Oli Mesin"));
        a1.addPart(new Part("Filter Oli"));
        
        System.out.println("Jumlah Part pada Konsumen "+a1.getNama()+" yang harus diperbaiki : "+a1.getItungPart());
    }
}
