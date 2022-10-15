package Ejercicio2;
import java.util.Scanner;


abstract class Book {
    String title;
    String getTitle() {
       return title;
    } abstract void setTitle(String titulo);
}
class MyBook extends Book{
    void setTitle(String titulo) {
        this.title = titulo;
    }
}
public class MainBook {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("\nEscriba la entrada de información requerida: 'Las Clases Abstractas'");
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("\nThe title is: "+new_novel.getTitle());
        sc.close();

    }
}