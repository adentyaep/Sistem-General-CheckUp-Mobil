/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOCheckUP;
import DAOInterface.ICheckUP;
import Model.MCheckUP;
import Model.TMCheckUP;
import View.VCheckUP;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CCheckUP {
    VCheckUP frame;
    ICheckUP implcheck;
    List<MCheckUP> listcheck;
    
    public CCheckUP(VCheckUP frame)
    {
        this.frame = frame;
        implcheck = new DAOCheckUP();
        
    }
    
    public void isiTable()
    {
       listcheck = implcheck.getAll();
       TMCheckUP tabelChk = new TMCheckUP(listcheck);
       frame.getTbl_data().setModel(tabelChk);
    }
    public void insert()
    {
       if(!frame.getTxt_nama().getText().trim().isEmpty() & !frame.getTxt_nama().getText().trim().isEmpty()){
            MCheckUP mchk = new MCheckUP();
            
            mchk.setPemilik(frame.getTxt_nama().getText());
            mchk.setAlamat(frame.getTxt_alamat().getText());
            mchk.setMobil(frame.getTxt_mobil().getText());
            mchk.setRoda(Integer.valueOf(frame.getTxt_roda().getText()));
            mchk.setBhn_bakar(frame.getTxt_bhnbakar().getText());
            mchk.setBgn_check(frame.getTxt_part().getText());
            mchk.setKerusakan(Integer.valueOf(frame.getTxt_kondisi().getText()));
            mchk.setKategori(frame.getTxt_kondisi().getText());
            
            implcheck.insert(mchk);
            JOptionPane.showMessageDialog(null,"Data Tersimpan");
        } else {
            JOptionPane.showMessageDialog(null,"Data Tidak Tersimpan");
         
    }
}
}
