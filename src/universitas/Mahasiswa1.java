/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;

/**
 *
 * @author acer
 */
public class Mahasiswa1 {
    private String npm, nama, prodi;
    
    public Mahasiswa1(String npm, String nama, String prodi){
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void setNPM(String npm) {
        this.npm = npm;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public String getNPM() {
        return this.npm;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getProdi(){
        return this.prodi;
    }

}
