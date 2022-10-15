package Ejercicio4;

class Animal{
    void walk()
    {
       System.out.println("I'm walking");
    }
 }
 

 class Bird extends Animal
 {
    void fly()
    {
       System.out.println("I'm flying");
    }
     
     void sing(){
         System.out.println("I'm singing");
     }
 }


 public class MainAnimals
 {
       public static void main(String args[])
    {
 
      Bird bird = new Bird();
      bird.walk();
      bird.fly();
      bird.sing();
    
    }
 }

