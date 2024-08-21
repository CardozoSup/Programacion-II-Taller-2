/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estatura;

/**
 *
 * @author SANTIAGO CARDOZO
 */
public class Estatura {
    protected double bajo;
    protected double alto;
    protected double vect[];
    public Estatura(){
    }
     public void setEstaturas(int pos, double num) {
        vect[pos] = num;
    }

    public void setAlto() {
        alto = 0;
        for (int i = 0; i <= 24; i++) {
            if (vect[i] > alto) {
                alto = vect[i];
            }
        }
    }

    public void setBajo() {
        bajo = Double.MAX_VALUE;
        for (int i = 0; i <= 24; i++) {
            if (vect[i] < bajo) {
                bajo = vect [i];
            }
        }
    }
    public double getBajo() {
        return bajo;
    }

    public double getAlto() {
        return alto;
    }
}
