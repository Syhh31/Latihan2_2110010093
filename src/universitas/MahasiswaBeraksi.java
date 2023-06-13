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
public class MahasiswaBeraksi {
    public static void main(String[] args) {
    Mahasiswa1 mahasiswa = new Mahasiswa1("2110010093", "SYAHBANA NOOR", "TI");
    System.out.println("NPM : " +mahasiswa.getNPM());
    System.out.println("Nama : " +mahasiswa.getNama());
    System.out.println("Prodi : "+mahasiswa.getProdi());
    }
}