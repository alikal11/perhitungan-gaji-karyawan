/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.pegawai;

/**
 *
 * @author asus
 */
public class GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gaji = 4500000;
        String jabatan;
     
     if (gaji >= 20000000) {
   
     jabatan = "dia direktur";
     }
     else if (gaji >= 10000000) {
        
     jabatan = "dia manager";
     }
     else if (gaji >= 7000000) {
         
    jabatan = "dia leader";
     }
     else {
      
   
     jabatan = "dia karyawa produksi";
     }
     System.out.println("status"+jabatan);
     
    }
}

             
    } 
    
             
    }
            
       
        
    
 

    

