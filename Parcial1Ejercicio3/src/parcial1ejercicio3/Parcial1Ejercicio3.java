package parcial1ejercicio3;
import parcial1ejercicio3.Estudiante;
import parcial1ejercicio3.Materias;
import java.util.Scanner;


public class Parcial1Ejercicio3 {
    public static void main(String[] args) throws InterruptedException {
         Materias lista[] = new Materias[5];
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
               Materias    m = new Materias();
            // Estudiante e = new Estudiante();
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
            double E1, E2, E3, E4, E5, p1, p2, p3, p4, p5;
            System.out.println(" *** Notas del alumno *** ");
            System.out.println("Recuerde verificar los porcentajes");
            System.out.println("     ---   ---   ---   ---   ---   ");
            System.out.println("Nota de actividad #1 < 15%>");
                    E1 = in.nextDouble();
                 if (E1 > 10) {
                    System.out.println("La nota maxima es 10");
                    Thread.sleep(2000);//tiempo en mili segundos(2000 = 2 segundos)
                    Parcial1Ejercicio3.main(null);
                    }
                    p1 = E1 * 0.15;                 
            System.out.println("Nota de actividad #2  <valor 10%>");
                   E2 = in.nextDouble();
                   if (E2 > 10) {
                    System.out.println("La nota maxima es 10");
                    Thread.sleep(2000);//tiempo en mili segundos(2000 = 2 segundos)
                    Parcial1Ejercicio3.main(null);
                    }
                    p2 = E2 * 0.10;
            System.out.println("Nota de actividad #3  <valor 20%>");
                    E3 = in.nextDouble();
                  if (E3 > 10) {
                    System.out.println("La nota maxima es 10");
                    Thread.sleep(2000);//tiempo en mili segundos(2000 = 2 segundos)
                    Parcial1Ejercicio3.main(null);
                    }
                    p3 = E3 * 0.20;
            System.out.println("Nota de actividad #4  <valor 30%>");
                    E4 = in.nextDouble();
                  if (E4 > 10) {
                    System.out.println("La nota maxima es 10");
                    Thread.sleep(2000);//tiempo en mili segundos(2000 = 2 segundos)
                    Parcial1Ejercicio3.main(null);
                    }
                    p4 = E4 * 0.30;
            System.out.println("Nota de actividad #5  <valor 25%>");
                    E5 = in.nextDouble();
                  if (E5 > 10) {
                    System.out.println("La nota maxima es 10");
                    Thread.sleep(2000);//tiempo en mili segundos(2000 = 2 segundos)
                    Parcial1Ejercicio3.main(null);
                    }
                    p5 = E5 * 0.25;
            double SumaAct = p1 + p2 + p3 + p4 + p5;
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
        } while (limite <= 5);
        for (int i = 0; i < contmaterias; i++) {
            System.out.println("Estudiante: " + lista[i].getNombre()+" "+ lista[i].getApellido());
            System.out.println("Materia: " + lista[i].getMateria()+" "+"Nota final: " + lista[i].getNotaFinal()
                    +" "+ Estado1[i]);
            System.out.println("Resultado del año: " + Estado2[i]);
            System.out.println("  ****   ***  ***  *** ***   ***  ");
        }
    }
    
}




