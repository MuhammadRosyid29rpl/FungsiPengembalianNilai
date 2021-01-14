/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsipengembaliannilai;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF A15
 */
public class FungsiPengembalianNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int a,b,c,;
        System.out.println("Program menjumlahkan 2 nilai");
        System.out.print("Masukkan nilai a : ");
        a=input.nextInt();
        System.out.print("Masukkan nilai b : ");
        b=input.nextInt();
        System.out.print("Masukkan nilai c : ");
        c=input.nextInt();
        System.out.println();
        System.out.println("Jumlah a+b :"+(jumlah(a,b)));
        System.out.println("Jumlah a+c :"+(jumlah(a,c)));
        System.out.println("Jumlah b+c :"+(jumlah(b,c)));
    }    
    //konstruktor
private static int jumlah(int a, int b){
    int hasil=a+b;
            return hasil;
}
}