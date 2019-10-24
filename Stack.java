/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukdat; 

/**
 *
 * @author ASUS
 */
public class Stack {
     
    private int data [];
    private int top;
    public Stack (int jumlah){
        data = new int[jumlah];
        top = -1;
    }  
    public void push (int nilai){
        //Jika stack belum penuh
        if ( top < data.length-1 ){
            top++;
            data[top] = nilai;
        }
    }
    public int pop(){
        //jika srtack tidak kosong
        if(top > -1){
            int temp = data[top--];
            return temp;
        }
        return 0;
    }
    public void print(){
        for(int i = data.length-1; i >= 0; i--){
            System.out.println(data[i]);
        }
    }
}
