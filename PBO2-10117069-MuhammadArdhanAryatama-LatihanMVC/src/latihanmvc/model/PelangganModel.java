/*
 * Nama  : Muhammad Ardhan Aryatama
 * NIM   : 10117069
 * Kelas : IF 2
 */
package latihanmvc.model;

import javax.swing.JOptionPane;
import latihanmvc.event.PelangganListener;

public class PelangganModel {
   private String nama;
   private String email;
   private String telp;
   
   private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
        
    }
   
   
   
   
   public String getNama() {
       return nama;
   }

   public void setNama(String nama) {
       this.nama = nama;
       fireOnChange();
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
       fireOnChange();
   }

   public String getTelp() {
       return telp;
   }

   public void setTelp(String telp) {
       this.telp = telp;
       fireOnChange();
   }
   
   protected void fireOnChange(){
       if(pelangganListener!=null){
       pelangganListener.onChange(this);
       
       
       }
   }
   
   public void resetForm(){
       setNama("");
       setEmail("");
       setTelp("");
       
       
       
   }
    
   public void simpanForm(){
       JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
       resetForm();
   }
   
}
