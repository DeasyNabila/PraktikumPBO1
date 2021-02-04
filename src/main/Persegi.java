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
public class Persegi {
    void hitungpersegi (){
    
    Scanner input = new Scanner(System.in);
    
    //Deklarasi variabel
    int sisi, luas;
    
    //Input nilai jari-jari
    System.out.print("Masukkan panjang sisi persegi : ");
    sisi=input.nextInt();
        
    //Menghitung luas lingkaran
    luas = sisi*sisi;
    
    //Tampilkan hasil
        System.out.println("Luas Persegi = "+luas);
        
        
}
    
}
