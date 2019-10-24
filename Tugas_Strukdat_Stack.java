/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukdat;

import java.util.Stack;
/**
 * 
 * @author Muhammad Hijrul Arifin Zain
 * NIM : 11850111418
 */
public class Tugas_Strukdat_Stack {
    
    public static void main (String [] args){
        Stack stack1 = new Stack();
        
        System.out.println("====================================================");
        System.out.println("Masukkan Data : ");
        stack1.push("Buku Struktur Data");
        stack1.push("Buku Basis Data");
        stack1.push("Buku Teorima Bahasa dan Otomata");
        stack1.push("Buku Teknologi Web");
        stack1.push("Buku Arsitek Komputer");
        System.out.println(stack1);
        
        System.out.println("\nData Yang Paling Atas : ");
        stack1.peek();
        System.out.println(stack1.peek());
        
        System.out.println("\nApakah Stack Sudah Kosong ? " +stack1.isEmpty());       
        
        System.out.println("\nUkuran Stack ? " +stack1.size());
        System.out.println("====================================================");
        
        System.out.println("Hasil dari Mengeluarkan Data : ");
        stack1.pop();
        System.out.println(stack1);
        
        System.out.println("\nApakah Stack Sudah Kosong ? " + stack1.isEmpty());
        
        System.out.println("\nUkuran Stack ? " + stack1.size());
        System.out.println("====================================================");
        
        System.out.println("Hapus Semua Data : ");
        stack1.clear();
        System.out.println(stack1);
        
        System.out.println("\nApakah Stack Sudah Kosong ? " + stack1.isEmpty());
        
        System.out.println("\nUkuran Stack ? " + stack1.size());
        System.out.println("====================================================");
        
        
        
    }
}
