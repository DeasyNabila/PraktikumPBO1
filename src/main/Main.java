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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pilihan;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan pilihan: ");
        pilihan = scan.nextLine();
        
        switch(pilihan){
            case "lingkaran":
                System.out.println("Menghitung Luas Lingkaran");
                Lingkaran luas = new Lingkaran();
                luas.hitunglingkaran();
                break;               
            case "persegi":
                System.out.println("Menghitung Luas Persegi");
                Persegi deasy = new Persegi();
                deasy.hitungpersegi();
                break;
            default:
                System.out.println("Tidak menghitung apa-apa");
                
                
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
