/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia3dowhile;

/**
 *
 * @author naomi
 */
public class Potencia3DoWhile {


    public static void main(String[] args) {
        double x;
        int i;
        i=0;
        do
        {
        x = Math.pow(3,i);
        System.out.print(x + "\n");
        i++;
        }while(i<16);
    }
    
}
