/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k;

/**
 *
 * @author Lenovo
 */
public class color {
 public static final int TRANSPARENT = 0;
    public static final int BLACK = 30;
    public static final int RED = 31;
    public static final int GREEN = 32;
    public static final int YELLOW = 33;
    public static final int BLUE = 34;
    public static final int PURPLE = 35;
    public static final int CYAN = 36;
    public static final int WHITE = 37;    


    private int colorCode;
    private String color;

    public color(String selectedColor){   
        color = selectedColor; 
        switch (selectedColor.toLowerCase()) {
            case "merah":
                colorCode = RED;
                break;
            case "hijau":
                colorCode = GREEN;
                break;
            case "kuning":
                colorCode = YELLOW;
                break;
            case "biru":
                colorCode = BLUE;
                break;
            case "ungu":
                colorCode = PURPLE;
                break;
            default:
                colorCode = TRANSPARENT;
                break;
        }
    }

    /**
     * @param args the command line arguments
     */

    public void printPersonality(){
       
        if (colorCode == TRANSPARENT) {
            System.out.println("Warna yang anda pilih tidak ada");
            return;
        }

        System.out.println("Warna Favorit kamu adalah ".concat(colorBuilder(colorCode, TRANSPARENT, color.toUpperCase())));

        switch (colorCode) {
            case RED:
                System.out.println("1. Kamu pemberani");
                System.out.println("2. Kamu pecinta music");
                System.out.println("3. Memiliki rasa nasionalisme");
                System.out.println("4. Memiliki rasa semua harus berjalan sempurna");
                break;
            case GREEN:
                System.out.println("1. Kamu orangnya irit");
                System.out.println("2. Kamu orangnya kalem dan santai");
                System.out.println("3. Mudah Cemburu");
                System.out.println("4. Selalu sabar dalam segala hal");
                break;
            case YELLOW:
                System.out.println("1. Orangnya asik");
                System.out.println("2. Selalu Membantu orang lain");
                System.out.println("3. Selalu semangat di setiap waktu");
                System.out.println("4. Terkadang lupa waktu karena terlalu semangat");
                break;
            case BLUE:
                System.out.println("1. Selalu positif dalam segala keadaan");
                System.out.println("2. Sifatnya Dewasa");
                System.out.println("3. Realistis");
                System.out.println("4. Menjadi perhatian orang lain");
                break;
            case PURPLE:
                System.out.println("1. Romantis");
                System.out.println("2. Pemalu");
                System.out.println("3. Memiliki rasa sayang yang tinggi");
                System.out.println("4. Terlalu khawatir");
                break;                    
        }
    }

    public static String colorBuilder(int foreground, int background, String text){
        return "\033[" + foreground + ";" + (background + 10) + ";1m".concat(text).concat("\033[" + TRANSPARENT + ";" + (TRANSPARENT) + ";1m");
    }
}
