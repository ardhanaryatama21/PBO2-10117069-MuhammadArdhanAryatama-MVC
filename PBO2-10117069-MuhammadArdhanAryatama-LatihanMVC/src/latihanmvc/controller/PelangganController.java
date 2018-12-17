/*
 * Nama  : Muhammad Ardhan Aryatama
 * NIM   : 10117069
 * Kelas : IF 2
 */
package latihanmvc.controller;

import javax.swing.JOptionPane;
import latihanmvc.model.PelangganModel;
import latihanmvc.view.PelangganView;


public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String telp = view.getTxtTelp().getText();
        
        if (nama.equals("") && email.equals("") && telp.equals("")){
        
        }else{
            model.resetForm();
            
        } 
        
        
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String telp = view.getTxtTelp().getText();
        
        if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Nama Tidak Boleh Kosong");
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Email Tidak Boleh Kosong"); 
        }else if(telp.trim().equals("")){
            JOptionPane.showMessageDialog(view,"No Telpon Tidak Boleh Kosong"); 
        }else{
            model.simpanForm();
        }
        
    }

}
