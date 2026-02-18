/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class TugasPertemuan2No1 {
    public static void main(String[] args) {
        
        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);
        
        // Input
        System.out.print("Masukkan bilangan pertama: ");
        int a = input.nextInt();
        
        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();
        
        System.out.print("Masukkan bilangan ketiga: ");
        int c = input.nextInt();
        
        // Proses
        int hasilTambah = a + b + c;
        int hasilKurang = a - b - c;
        int hasilKali = a * b * c;
        int hasilBagi = a / b / c;
        
        // Output
        System.out.println("Hasil Penjumlahan: " + hasilTambah);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Perkalian: " + hasilKali);
        System.out.println("Hasil Pembagian: " + hasilBagi);
        
        input.close();
    }
}
