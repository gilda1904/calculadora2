
package mediaescolar;
/*fazer um programa que leia um numero qualquer e calcule sua tabuada de multiblicar*/

import java.util.Scanner;
public class calculadora2 {
    
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
       int numero,i,total;
        
       System.out.println("digite o numero");
       numero=sc.nextInt();
       
       
       for( i=1;i<=10;i++){
       
total=numero*i;

           System.out.println(numero+ "x" +i+ "=" +total);
       }
    }
}
