package ParesImpares;
import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int quantNumeros , numeroDigitado;
        int quantPares = 0 ,quantImpares = 0;

        System.out.print("Quantidade de numeros a serem contados: ");

        quantNumeros = scan.nextInt();

        int count = 0;
    
        do{
            System.out.println("Numero: ");
            numeroDigitado = scan.nextInt();

            if(numeroDigitado % 2 == 0){
                quantPares++;
            }else{
                quantImpares++;
            }

            count++;
        }while(count < quantNumeros);
        
        System.out.println("Quantidade Impares :" + quantPares);
        System.out.println("Quantidade Par :"+ quantImpares);

    }
}
