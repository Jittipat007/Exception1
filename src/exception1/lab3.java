/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author Jittipat
 */
public class lab3 {
    public static void main(String[] args) {
        try {
            System.out.println("Statement 1");
            System.out.println(list[10]);
            System.out.println("Statement 3");
        }
        catch (Exception e){
        }
        finally {
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");
    }
}
