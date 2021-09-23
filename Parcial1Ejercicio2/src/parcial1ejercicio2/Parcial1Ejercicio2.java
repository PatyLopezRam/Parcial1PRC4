package parcial1ejercicio2;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.lang.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Parcial1Ejercicio2 {

   
    public static boolean main(String[] args) throws IOException {    
       // void Menu(){
        String Nombre = null,Apellido = null,Puesto = null;
        double HorasTrab = 0;
        double HorasEx = 0;
        double ISSS = 0;
        double AFP = 0;
        double Renta = 0;
        double Liquido = 0;
        double Horast = 0;
       
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
//                     for(int i=1; i<=2; i++){
                     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                     System.out.println("INGRESE DATOS DEL EMPLEADO ");                    
                     System.out.println("Nombre"); 
                     Nombre = br.readLine();
                     System.out.println("Apellido");
                     Apellido = br.readLine();
                     System.out.println("Puesto");
                     Puesto = br.readLine();
                     System.out.println("Horas trabajadas");
                     HorasTrab = Float.valueOf(br.readLine());
                     if(HorasTrab<=0){
                         System.out.println("Las horas no pueden ser iguales a '0'");
                         Parcial1Ejercicio2.main(null);
                         break;
                     }
                     
                     System.out.println("Empleado Guardado ");
                     
//                     continue;                    
//}
                     Parcial1Ejercicio2.main(null);
                    case 2://Mostrar calculos de salarios  
                     do{
                         if(HorasTrab<=160){ 
                         Horast = HorasTrab*9.75;
                         BigDecimal bd = new BigDecimal(Horast).setScale(2, RoundingMode.HALF_UP);
                         ISSS = Horast*0.0525;
                         BigDecimal bd1 = new BigDecimal(ISSS).setScale(2, RoundingMode.HALF_UP);
                         AFP = (Horast*0.0688);
                         BigDecimal bd2 = new BigDecimal(AFP).setScale(2, RoundingMode.HALF_UP);
                         Renta = (Horast*0.10);
                         BigDecimal bd3 = new BigDecimal(Renta).setScale(2, RoundingMode.HALF_UP);
                         Liquido = (Horast - ISSS - AFP - Renta);
                         BigDecimal bd4 = new BigDecimal(Liquido).setScale(2, RoundingMode.HALF_UP);
                         System.out.println("calculo de salarios");
                         System.out.println("Tu Sueldo es: "+"Nombre: "+ Nombre+ ", " + "Apellido: " + Apellido+", "+"Puesto: " +
                         Puesto+", " +"Horas Trabajadas: "+ HorasTrab+", "+"ISSS: " + bd1+", "+"AFP: " + bd2+", "+"Renta: " + bd3+", "+"Liquido: " + bd4);
                         }
                         else{
                         if(HorasTrab>160 && HorasTrab<=500){ 
                         HorasEx = HorasTrab*11.50;
                         BigDecimal bd0 = new BigDecimal(HorasEx).setScale(2, RoundingMode.HALF_UP);
                         Horast = HorasTrab*9.75;
                         BigDecimal bd = new BigDecimal(Horast).setScale(2, RoundingMode.HALF_UP);
                         ISSS = Horast*0.0525;
                         BigDecimal bd1 = new BigDecimal(ISSS).setScale(2, RoundingMode.HALF_UP);
                         AFP = (Horast*0.0688);
                         BigDecimal bd2 = new BigDecimal(AFP).setScale(2, RoundingMode.HALF_UP);
                         Renta = (Horast*0.10);
                         BigDecimal bd3 = new BigDecimal(Renta).setScale(2, RoundingMode.HALF_UP);
                         Liquido = (Horast - ISSS - AFP - Renta);
                         BigDecimal bd4 = new BigDecimal(Liquido).setScale(2, RoundingMode.HALF_UP);
                   
                         System.out.println("calculo de salarios");
                         System.out.println("Tu Sueldo es: "+"Nombre: "+ Nombre+ ", " + "Apellido: " + Apellido+", "+"Puesto: " +
                                 Puesto+", " +"Horas Trabajadas: "+ HorasTrab+", "+"ISSS: " + bd1+", "+"AFP: " + bd2+", "+"Renta: " + bd3+", "+"Liquido: " + bd4);}
                     }
                     }
                     while (HorasTrab>160 && HorasTrab<=500);{
                             }    return false;

                    case 3://Salir del sistema
                     System.out.println("Saliendo del programa");
                     break;
                    default:
                     System.out.println("Opción no valida");
                    break;
                 }
    }
 }