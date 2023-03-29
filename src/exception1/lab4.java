/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author Jittipat
 */
public class lab4 {
    public static void main(String[] args) {
        
        try {
            System.out.println("Statement 1");
            System.out.println(1/0);
            System.out.println("Statement 3");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            
        }
        catch (ArithmeticException e){
            throw new StringIndexOutOfBoundsException();
        }
        finally {
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");
    }
}
