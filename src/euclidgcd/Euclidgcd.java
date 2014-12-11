/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclidgcd;

/**
 *
 * @author I'am a Muslim
 */

import java.util.Scanner;
public class Euclidgcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m,n,r;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nilai pertama = ");
        m = in.nextInt();
        System.out.print("Masukkan nilai kedua(<nilai pertama) = ");
        n = in.nextInt();
        System.out.print("gcd("+m+","+n+") = ");
        long startTime = System.nanoTime();
        while(n>0){
            r = m % n;
            m = n;
            n = r;
        }
        long stopTime = System.nanoTime();
    	
    	double elapsedTime = (double) (stopTime - startTime)/1000000;
        System.out.println(m);
    	System.out.println("Waktu eksekusi = "+elapsedTime + " * 10^-3 detik");
        
    }
    
}
