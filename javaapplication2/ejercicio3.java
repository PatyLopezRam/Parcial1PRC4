package javaapplication2;
import javaapplication2.Materia;
import javaapplication2.Estudiante;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        //Crear lista y variables
        Materia lista[] = new Materia[5];
        String Estado1[] = new String[5];
        String Estado2[] = new String[5];
        int limite = 1, Aprobar = 0;
        int contmaterias = 0;
        String[] Estado;
        do {//Declaramos el scanner y trae datos           
            Scanner in = new Scanner(System.in);
            int cod, Grado;
            String Nombre, Apellido, Materia;
            System.out.println("Digite el id");
                 cod = in.nextInt();
            System.out.println("Digite el nombre");
                 Nombre = in.next();
            System.out.println("Digite el apellido");
                 Apellido = in.next();
            System.out.println("Digite el nombre de la materia");
                 Materia = in.next();
            System.out.println("Digite el grado actual");
                   Grado = in.nextInt();
               Materia    m = new Materia();
//               Estudiante e = new Estudiante();
            //LLamamos a la clase Materia y pasamos datos
            m.setCodigoMateria(cod);
            m.setNombre(Nombre);
            m.setApellido(Apellido);
            m.setMateria(Materia);
            m.setGrado(Grado);
            lista[contmaterias] = m;
            contmaterias++;
            cod++;
            limite++;
            //Variables para procesar notas
            double E1 = 0, E2 = 0, A3 = 0, E4 = 0, E5 = 0, p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
            System.out.println(" *** Notas del alumno *** ");
            System.out.println("Recuerde verificar los porcentajes");
            System.out.println("     ---   ---   ---   ---   ---   ");
            System.out.println("Nota de actividad #1 < 15%>");
                 E1 = in.nextDouble();
                 p1 = E1 * 0.15;
            System.out.println("Nota de actividad #2  <valor 10%>");
                 E2 = in.nextDouble();
                 p2 = E2 * 0.10;
            System.out.println("Nota de actividad #3  <valor 20%>");
                 A3 = in.nextDouble();
                 p3 = A3 * 0.20;
            System.out.println("Nota de actividad #4  <valor 30%>");
                 E4 = in.nextDouble();
              p4 = E4 * 0.30;
            System.out.println("Nota de actividad #5  <valor 25%>");
                 E5 = in.nextDouble();
                 p5 = E5 * 0.25;
            double SumaAct = p1 + p2 + p3 + p4 + p5;
            boolean concedido = false;
            //Hacemos el ciclo do while para continuar si la suma de las 5 actividades son menores a 50
            do {
                if (SumaAct > 50) {
                    System.out.println("La sumatoria de las 5 actividades no puede dar mayor a 50");
                    concedido = false;
                } else {concedido = true;}
                } 
            while (concedido == false);
                     m.setNotaFinal(SumaAct);
            if (SumaAct >= 7) {
                Estado1[Aprobar] = "Aprobado";
                if (Grado == 10) {
                    Estado1[Aprobar] = "Graduado";
                } else {
                    Estado1[Aprobar] = "Promovido";
                }
                Aprobar++;
            }
            if (SumaAct <= 6.49) {
                Estado1[Aprobar] = "Aprobado";
                Estado2[Aprobar] = "Reprobado";
                Aprobar++;
            }
            //NOTAS ENTERE 6.50 Y 6.99
            if (6.50 < SumaAct && SumaAct < 6.99) {
                Estado1[Aprobar] = "Realizar suficiencia para aprobar";
                Estado2[Aprobar] = "Repetir prueba";
                Aprobar++;
            }
        } while (limite <= 2);
        for (int i = 0; i < contmaterias; i++) {
            System.out.println("Estudiante: " + lista[i].getNombre()+" "+ lista[i].getApellido());
            System.out.println("Materia: " + lista[i].getMateria()+" "+"Nota final: " + lista[i].getNotaFinal()
                    +" "+ Estado1[i]);
            System.out.println("Resultado del año: " + Estado2[i]);
            System.out.println("  ****   ***  ***  *** ***   ***  ");
        }
    }
}
