/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas_s;
import java.util.Scanner;

/**
 *
 * @author SANTIAGO CARDOZO
 */
public class Maine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notas_s hiu = new Notas_s();

        for (int i = 0; i <= 14; i++) {
            System.out.println("Ingrese la nota #" + (i + 1) + ":");
            hiu.setNotas(i, sc.nextDouble());
        }
        hiu.calcAlto();
        hiu.calcAvi();
        hiu.calcPor();
        
        System.out.println("La nota mas alta es: " + hiu.getAlta());
        System.out.println("El porcentaje de alumnos que obtuvieron 3.0 o mas es: " + hiu.getPor() + "%");
        System.out.println("El promedio de las notas es: " + hiu.getAvi());
        System.out.println("La nota mas baja se encuentra en la posicion " + (hiu.getBaja() + 1) + " del arreglo");
    }
}

