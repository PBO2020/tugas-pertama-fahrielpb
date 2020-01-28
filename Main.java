/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Praktikan
 */
public class Main {
    public static void main(String[] args) {
        
        calc c = new calc();
        
        c.setAngka1(365);
        c.setAngka2(5);
        
        int penjumlahan = c.getAngka1() + c.getAngka2();
        int pengurangan = c.getAngka1() - c.getAngka2();
        int perkalian = c.getAngka1() * c.getAngka2();
        int pembagian = c.getAngka1() / c.getAngka2();
        
        System.out.println("Hasil Penjumlahan " + c.getAngka1() + " + " + c.getAngka2() + " = " + penjumlahan);
        System.out.println("Hasil Pengurangan " + c.getAngka1() + " - " + c.getAngka2() + " = " + pengurangan);
        System.out.println("Hasil Perkalian " + c.getAngka1() + " * " + c.getAngka2() + " = " + perkalian);
        System.out.println("Hasil Pembagian " + c.getAngka1() + " / " + c.getAngka2() + " = " + pembagian);
    }
}
