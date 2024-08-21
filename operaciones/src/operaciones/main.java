/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;
import java.util.Scanner;
/**
 *
 * @author SANTIAGO CARDOZO
 */
public class main {
     public static void main(String args[]) {
         Scanner kiu = new Scanner(System.in);
         String opera;
         Operaciones uj = new Operaciones();
         int centinela = 0;
         System.out.println("Bienvenido a la calculadora la fe");
         System.out.println("Porfavor ingrese el tipo de operacion que va a realizar");
         System.out.println("Multiplicacion");
         System.out.println("Suma");
         System.out.println("Resta");
         opera = kiu.next();
         switch (opera){
             case "Multiplicacion" ->{
                 while (centinela == 0){
                     int numer1, numer2;
                     System.out.println("Porfavor ingrese los numeros que desea multiplicar");
                     System.out.println("Ingrese el primer numero");
                     numer1 = kiu.nextInt();
                     System.out.println("Ingrese el segundo numero");
                     numer2 = kiu.nextInt();
                     uj.Establecer(numer1, numer2);
                     uj.multiplicacion();
                     System.out.println("EL resultado de su multiplicacion entre: " +numer1+ "*" +numer2+ " es:" + uj.getRes1());
                     System.out.println("Desea retirarse?");
                     System.out.println("Seleccione el numero correspondiente");
                     System.out.println("0. SI");
                     System.out.println("1. No");
                     centinela = kiu.nextInt();
                 }
                 break;
             }
             case "Suma" ->{
                 while (centinela == 0){
                     int numsu, numsu2;
                     System.out.println("Porfavor ingrese los numeros que desea sumar");
                     System.out.println("Ingrese el primer numero");
                     numsu = kiu.nextInt();
                     System.out.println("Ingrese el segundo numero");
                     numsu2 = kiu.nextInt();
                     uj.Establecer(numsu, numsu2);
                     uj.suma();
                     System.out.println("EL resultado de su suma entre: " +numsu+ "+" +numsu2+ " es:" + uj.getRes2());
                     System.out.println("Desea retirarse?");
                     System.out.println("Seleccione el numero correspondiente");
                     System.out.println("0. SI");
                     System.out.println("1. NO");
                     centinela = kiu.nextInt();
                 }
                 break;
             }
             case "Resta" ->{
                 while (centinela == 0){
                     int numre, numre2;
                     System.out.println("Porfavor ingrese los numeros que desea restar");
                     System.out.println("Ingrese el primer numero");
                     numre = kiu.nextInt();
                     System.out.println("Ingrese el segundo numero");
                     numre2 = kiu.nextInt();
                     uj.Establecer(numre, numre2);
                     uj.rest();
                     System.out.println("EL resultado de su resta entre: " +numre+ "-" +numre2+ " es:" + uj.getRes3()); 
                     System.out.println("Desea retirarse?");
                     System.out.println("Seleccione el numero correspondiente");
                     System.out.println("0. SI");
                     System.out.println("1. NO");
                     centinela = kiu.nextInt();
                 }
                 break;
             }
         }
     }
}
