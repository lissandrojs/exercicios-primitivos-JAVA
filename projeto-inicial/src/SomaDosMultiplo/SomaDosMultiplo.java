package SomaDosMultiplo;

import java.util.Scanner;

public class SomaDosMultiplo {
    public static void main(String[] args){
        int primeiroValor, segundoValor ;
        int resultado = 0;

        Scanner valorInserido = new Scanner(System.in);
        primeiroValor = valorInserido.nextInt();
        segundoValor = valorInserido.nextInt();

        for(int i =  primeiroValor ; i<= segundoValor ;i++){
          if( i % primeiroValor == 0){
            System.out.println(i); 
            resultado += i;
          }
        } 
        System.out.println(resultado); 
    }
}
