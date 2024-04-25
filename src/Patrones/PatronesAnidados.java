package Patrones;

import java.util.Scanner;

public class PatronesAnidados {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        createNestedPattern1(num);
        createNestedPattern2(num);
        createNestedPattern3(num);
        createNestedPattern4(num);
    }

    public static void createNestedPattern1(int numChar){
        String text1 = "";
        for (int i = 0; i < numChar; i++){
            for (int j = 0; j < numChar; j++){
                if(i==0 || i == numChar-1 || j == 0 || j == numChar-1)
                    text1 += "*";
                else
                    text1 += " ";
            }
            text1 += "\n";
        }
        System.out.println(text1);
    }

    public static void createNestedPattern2(int numChar){
        String text2 = "";
        for (int i = numChar; i >= 0 ; i--){
            for (int j = 0; j < numChar; j++){
                if(i==0 || i == numChar-1 || j == i )
                    text2 += "*";
                else
                    text2 += " ";
            }
            text2 += "\n";
        }
        System.out.println(text2);
    }

    public static void createNestedPattern3(int numChar){
        String text3 = "";
        for (int i = numChar; i >= 0 ; i--){
            for (int j = 0; j < numChar; j++){
                if(j == i || j == numChar-i- 1 )
                    text3 += "x";
                else
                    text3 += " ";
            }
            text3 += "\n";
        }
        System.out.println(text3);
    }

    public static void createNestedPattern4(int numChar){
        String text4 = "";
        for (int i = 0; i < numChar; i++){
            for (int j = 0; j < numChar; j++){

                if((j==0 || j == numChar-1) && j != i )
                    text4 += " ";
                else
                    text4 += "*";
            }
            text4 += "\n";
        }
        System.out.println(text4);
    }
}
