/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas_s;

/**
 *
 * @author SANTIAGO CARDOZO
 */
public class Notas_s {
private double[] notas = new double[15];
    private double alta;
    private double por;
    private double avi;
    private double baja = 5.0;
    private int bajas;

    public Notas_s(){
    }
    public void setNotas(int pos, double num) {
        notas[pos] = num;
    }

    public void calcAlto() {
        for (int i = 0; i <= 14; i++) {
            if (notas[i] > alta) {
                alta = notas[i];
            }
            if (notas[i] < baja) {
               baja = notas[i];
                bajas = i; 
            }    
        }
    }

    public void calcPor() {
        double counter = 0;
        for (int i = 0; i <= 14; i++) {
            if (notas[i] >= 3.0) {
                counter = counter + 1;
            }
        }
        por = (counter / 15) * 100;
    }

    public void calcAvi() {
        double suma = 0;
        for (int i = 0; i <= 14; i++) {
            suma = suma + notas[i];
        }
        avi = suma / 15;
    }
    public double getAlta() {
        return alta;
    }

    public double getPor() {
        return por;
    }

    public double getAvi() {
        return avi;
    }

    public double getBaja() {
        return baja;
    }

    public int getBajas() {
        return bajas;
    }
}