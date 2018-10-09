/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class latihan40 {
     /**
     * Semua color code
     */
    public static final int TRANSPARENT = 0;
    public static final int BLACK = 30;
    public static final int RED = 31;
    public static final int GREEN = 32;
    public static final int YELLOW = 33;
    public static final int BLUE = 34;
    public static final int PURPLE = 35;
    public static final int CYAN = 36;
    public static final int WHITE = 37;    

    public static void main(String[] args){      
        String name;
        printHeader();

        Scanner scanner = new Scanner(System.in);                        
        System.out.print("PILIH WARNA FAVORITMU\t: ");
        color myColor = new color(scanner.nextLine());
    
        System.out.print("NAMA KAMU\t\t: ");
        name = scanner.nextLine();

        System.out.println("\n=========== HASIL TEST KEPRIBADIAN ".concat(name.toUpperCase()).concat(" ==========="));        
        myColor.printPersonality();
    }

    public static void printHeader(){
        System.out.println("\n"+
            color.colorBuilder(RED, TRANSPARENT, "YUK") + " " +
            color.colorBuilder(GREEN, TRANSPARENT, "CEK")  + " " +
            color.colorBuilder(YELLOW, TRANSPARENT, "KEPRIBADIANMU")  + " " +
            color.colorBuilder(CYAN, TRANSPARENT, "DARI")  + " " +
            color.colorBuilder(PURPLE, TRANSPARENT, "WARNA")  + " " +
            color.colorBuilder(BLUE, TRANSPARENT, "FAVORITMU")  + " "
            );

        System.out.println();

        System.out.println(color.colorBuilder(WHITE, RED,    "          MERAH          "));
        System.out.println(color.colorBuilder(WHITE, GREEN,  "          HIJAU          "));
        System.out.println(color.colorBuilder(WHITE, YELLOW, "          KUNING         "));
        System.out.println(color.colorBuilder(WHITE, BLUE,   "          BIRU           "));
        System.out.println(color.colorBuilder(WHITE, PURPLE, "          UNGU           "));

        System.out.println();
    }
    
}
