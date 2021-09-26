package parcial1ejercicio2;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.lang.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import parcial1ejercicio2.Empleado;
import parcial1ejercicio2.Persona;

public class Parcial1Ejercicio2 {

   
    public static void main(String[] args) throws IOException {    
        Persona p = new Persona();
        Empleado e = new Empleado();
        int op=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Menú de opciones*"); 
        System.out.println("1.Agregar empleado"); 
        System.out.println("2.Mostrar calculo de salarios");
        System.out.println("3.Salir del sistema");
        System.out.println("Digite la opción");
        op=leer.nextInt();
        
                switch (op){                   
                    case 1://Agregar empleado     
//                     for(int i=5; i<=5; i++){ //No usamos for por que a la hora de mostrar los datos, solo mostraba el ultimo ingresado
                     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                     System.out.println("INGRESE DATOS DEL EMPLEADO ");                    
                     System.out.println("Nombre"); 
                     p.Nombre = br.readLine();
                     System.out.println("Apellido");
                     p.Apellido = br.readLine();
                     System.out.println("Puesto");
                     p.Puesto = br.readLine();
                     System.out.println("Horas trabajadas");
                     e.HorasTrab = Float.valueOf(br.readLine());
                         if(e.HorasTrab<=0){
                         System.out.println("Las horas no pueden ser iguales a '0'");
                         Parcial1Ejercicio2.main(null);
                         break;
                     }
                         if(e.HorasTrab>160){
                         System.out.println("Las horas arriba de 160 se digitan como Horas Extra");
                         Parcial1Ejercicio2.main(null);
                         break;}
                     System.out.println("Horas Extra");
                     e.HorasEx = Float.valueOf(br.readLine());
                     System.out.println("Empleado Guardado ");

//                     continue;                    
//}
                     Parcial1Ejercicio2.main(null);
                    case 2://Mostrar calculos de salarios  
                         e.Horast = e.HorasTrab*9.75;
                         BigDecimal bd = new BigDecimal(e.Horast).setScale(2, RoundingMode.HALF_UP);
                         e.HorasEx = e.HorasEx*11.50;
                         BigDecimal bd0 = new BigDecimal(e.HorasEx).setScale(2, RoundingMode.HALF_UP);
                         e.ISSS = e.Horast*0.0525;
                         BigDecimal bd1 = new BigDecimal(e.ISSS).setScale(2, RoundingMode.HALF_UP);
                         e.AFP = (e.Horast*0.0688);
                         BigDecimal bd2 = new BigDecimal(e.AFP).setScale(2, RoundingMode.HALF_UP);
                         e.Renta = (e.Horast*0.10);
                         BigDecimal bd3 = new BigDecimal(e.Renta).setScale(2, RoundingMode.HALF_UP);
                         e.Liquido = (e.Horast - e.ISSS - e.AFP - e.Renta + e.HorasEx);
                         BigDecimal bd4 = new BigDecimal(e.Liquido).setScale(2, RoundingMode.HALF_UP);
                         System.out.println("calculo de salarios");
                         System.out.println("Tu Sueldo es: "+"Nombre: "+ p.Nombre+ ", " + "Apellido: " + p.Apellido+", "+"Puesto: " +p.Puesto+", " + 
                                  "Horas Trabajadas: "+ e.HorasTrab+", "+"Horas Extra: " + e.HorasEx+
                                  ", "+"ISSS: " + bd1+", "+"AFP: " + bd2+", "+"Renta: " + bd3+", "+"Liquido: " + bd4);
                          break;                            
                    case 3://Salir del sistema
                     System.out.println("Saliendo del programa");
                     break;
                    default:
                     System.out.println("Opción no valida");
                    break;
                    }
    }
}
    