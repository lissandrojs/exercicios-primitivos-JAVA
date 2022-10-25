package Tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Diguita o numero da Tabuada desejad!");
        int valorInserido = scan.nextInt();

        for(int i = 1; i <= 10; i++ ){
            System.out.println(valorInserido + " x " + i + " = " + valorInserido * i );
        }
    }
}
