package Fatorial;

import java.util.Scanner;

public class Fatorial {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int resultado = 1;

        System.out.println("Fatorial : ");
        int valorInseridoFatorial = scan.nextInt();
    
        for(int i = 1 ;i <= valorInseridoFatorial;i++){
            resultado *= i;
        }

        System.out.println(resultado);
    }
}
