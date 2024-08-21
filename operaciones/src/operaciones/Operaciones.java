/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

/**
 *
 * @author SANTIAGO CARDOZO
 */
public class Operaciones {
    protected int num1;
    protected int num2;
    protected int res1;
    protected int res2;
    protected int res3;
    public Operaciones(){
    }
    public void Establecer (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void multiplicacion(){
        res1 = (num1 * num2) ;
    }
    public void suma(){
        res2 = (num1 + num2);
    }
    public void rest(){
        res3 = (num1 - num2);
    }
    public int getRes1() {
        return res1;
    }    

    public int getRes2() {
        return res2;
    }

    public int getRes3() {
        return res3;
    }
}
