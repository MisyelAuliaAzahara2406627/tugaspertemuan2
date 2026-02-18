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
public class TugasPertemuan2No2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Input
        System.out.print("Masukkan jumlah uang: ");
        int uang = input.nextInt();
        
        System.out.print("Apakah sedang hujan? (true/false): ");
        boolean hujan = input.nextBoolean();
        
        // Proses + Output
        if ((uang > 5000) && (!hujan)) {
            System.out.println("Anda jadi membeli gorengan.");
        } else {
            System.out.println("Anda tidak membeli gorengan.");
        }
        
        input.close();
    }
}