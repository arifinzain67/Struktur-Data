/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.util.*;
import java.text.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Muhammad Hijrul Arifin Zain
 * NIM : 11850111418
 */
public class Tugas_Strukdat_Queue {
    
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private tambah a;
   public Tugas_Strukdat_Queue(){
       GUI();
       this.a = new tambah();
   }
   public static void main(String[] args){
       Tugas_Strukdat_Queue test = new Tugas_Strukdat_Queue();
       test.tombol();
   }
   private void GUI(){
       mainFrame = new JFrame("BANK JD");
       mainFrame.setSize(300,150);
       mainFrame.setLayout(new GridLayout(3, 1));
     
       mainFrame.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent windowEvent){
               System.exit(0);
           }        
       });
       
       headerLabel = new JLabel("", JLabel.CENTER);        
       statusLabel = new JLabel("", JLabel.CENTER);    
       statusLabel.setSize(350,100);
       controlPanel = new JPanel();
       controlPanel.setLayout(new FlowLayout());
       mainFrame.add(headerLabel);
       mainFrame.add(controlPanel);
       mainFrame.add(statusLabel);
       mainFrame.setVisible(true);  
   }
   private void tombol(){
       headerLabel.setText("SELAMAT DATANG DI BANK JD");
       
       JButton okButton = new JButton("Nasabah");
       JButton oceButton = new JButton("Pegawai");
       okButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               a.show();
           }          
       });
       oceButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               String pil= JOptionPane.showInputDialog("Melayani sebagai: \n1. Teller\n2.Customer Service\n");
               a.kurang(pil);
           }          
       });
       controlPanel.add(okButton);
       controlPanel.add(oceButton);
       mainFrame.setVisible(true);  
   }
}
class tambah
{
   public int NT=0;
   public int NCs=0;
   public int JlhT=0;
   public int JlhCs=0;
   public void show(){
       Date dNow = new Date();
       SimpleDateFormat ft = new SimpleDateFormat("E, dd.MM.yyyy   hh:mm:ss a");
       
       String pilihan = JOptionPane.showInputDialog("Silahkan pilih:\n 1. Teller\n 2. Customer Service");
       char c = pilihan.charAt(0);
       
       if(c=='1'){
           String message0 = String.format("#BANK JD#\n\n"+ft.format(dNow)+"\n\nNomor Antrian Anda:\n\nTELLER\nA%d\n\nMohon menunggu hingga nomor dipanggil.\nJumlah antrian: %d nasabah.", NT+1, NT-JlhT);
           JOptionPane.showMessageDialog(null, message0);
           NT++;
       }
       else if(c=='2'){
           String message1 = String.format("#BANK JD#\n\n"+ft.format(dNow)+"\n\nNomor Antrian Anda:\n\nCUSTOMER SERVICE\nB0%d\n\nMohon menunggu hingga nomor dipanggil.\nJumlah antrian: %d nasabah.", NCs+1, NCs-JlhCs);
           JOptionPane.showMessageDialog(null, message1);
           NCs++;
       }
       else{
           String message2 = String.format("Pilihan yang Anda masukkan salah. Silahkan coba lagi!");
           JOptionPane.showMessageDialog(null, message2);
       }
    }
   public void kurang(String x){
       switch (x){
           case "1":
              if(NT-JlhT<=0){
                  String message3 = String.format("Tidak ada antrian untuk Teller");
                  JOptionPane.showMessageDialog(null, message3);
              }
              else{
                  JlhT++;
                  String message4 = String.format("Berhasil mengurangi nasabah pada antrian %s.\nSisa nasabah yang belum mendapatkan pelayanan %d", x, NT-JlhT);
                  JOptionPane.showMessageDialog(null, message4);
              }
              break;
           case "2":
               if(NCs-JlhCs<=0){
                  String message5 = String.format("Tidak ada antrian untuk Customer Service");
                  JOptionPane.showMessageDialog(null, message5);
              }
              else{
                  JlhCs++;
                  String message6 = String.format("Berhasil mengurangi nasabah pada antrian %s.\nSisa nasabah yang belum mendapatkan pelayanan %d", x, NCs-JlhCs);
                  JOptionPane.showMessageDialog(null, message6);
              }
              break;
           default:
              String message7 = String.format("Pilihan yang Anda masukkan salah. Silahkan coba lagi!");
              JOptionPane.showMessageDialog(null, message7);
              break;
       }
   
   }
}
