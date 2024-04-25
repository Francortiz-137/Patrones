package Patrones;

import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        String text1 = "";
        String text2 = "";
        String text3 = "";


        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                text1 += ".";
            }else{
                text1 += "*";
            }

            if (i % 4 == 0) {
                text2 += "4";
            } else if ( i % 4 == 3) {
                text2 += "3";
            } else if ( i%4 == 2) {
                text2 += "2";
            } else if ( i % 4 == 1) {
                text2 += "1";
            }

            if (i % 3 == 0) {
                text3 += "*";
            }else{
                text3 += "|";
            }
        }

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
    }
}
