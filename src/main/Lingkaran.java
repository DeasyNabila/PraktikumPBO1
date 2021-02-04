/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Lingkaran {
    void hitunglingkaran (){
    
    Scanner input = new Scanner(System.in);
    
    //Deklarasi variabel
    double luas, phi=3.14;
    int r;
    
    //Input nilai jari-jari
    System.out.println("Masukkan jari-jari : ");
    r=input.nextInt();
        
    //Menghitung luas lingkaran
    luas = phi*r*r;
    
    //Tampilkan hasil
        System.out.println("Luas Lingkaran = "+luas);
        
        
        
        
    }
}
