/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author Jittipat
 */
public class lab2 {
    public static void main(String[] args) {
        int[] list = new int [10];
        try {
        //System.out.println(list[10]);
        throw new Exception();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArithmeticException");
        }
        catch (RuntimeException e){
            System.out.println("RuntimeException");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}
