/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estatura;
import java.util.Scanner;

/**
 *
 * @author SANTIAGO CARDOZO
 */
public class Terminal {
     public static void main(String[] args) {
         Scanner oki = new Scanner(System.in);

        Estatura oku = new Estatura();

        for (int i = 0; i <= 24; i++) {
            System.out.println("Ingrese la estatura #" + (i + 1) + ":");
            oku.setEstaturas(i, oki.nextDouble());
        }

        oku.setAlto();
        oku.setBajo();

        System.out.println("La estatura mas alta registrada es: " + oku.getAlto());
        System.out.println("La estatura mas baja registrada es: " + oku.getBajo());
    }
}
