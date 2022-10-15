package Ejercicio3;

class Arithmetic {
    public int add(int digit1, int digit2) {
        return digit1 + digit2;
    }
} 

class Adder extends Arithmetic {}

public class MainSolution3{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("\nMy superclass is: " + a.getClass().getSuperclass().getName());    
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}