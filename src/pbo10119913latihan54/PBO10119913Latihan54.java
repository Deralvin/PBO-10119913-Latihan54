/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan54;

/**
 * Nama :Muhammad Alvin Rizqi Ramdahn
 * Kelas : IF10K
 * NIM : 10119913
 * @author Lenovo
 */
public class PBO10119913Latihan54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       WarnaKordinat color = new WarnaKordinat("jingga", 10, 4);
       color.setNamaWarna("Jingga");
       color.setX(10);
       color.setY(4);
       System.out.println("Warna Koordinat "+color.getNamaWarna());
       System.out.println("Kordinat Sumbu x : "+color.getX()+", y : "+color.getY());
    }
    
}
