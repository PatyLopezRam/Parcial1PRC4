package parcial1ejercicio2;
import java.util.Scanner;
import java.io.*;
public class Menu {
    
        public static void Menu(String[] args){
        int op=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Menú de opciones*"); 
        System.out.println("1.Agregar empleado"); 
        System.out.println("2.Mostrar calculo de salarios");
        System.out.println("3.Salir del sistema");
        System.out.println("Digite la opción");
        op=leer.nextInt();
    }

    
}
