package ejercicio1parcial1;
import java.util.Scanner; 
public class Ejercicio1Parcial1 { 
  public static void main(String[] args) {
    float a, b, c;
        try {//Declaramos las variables
            Scanner sca = new Scanner(System.in);
            System.out.println("Escriba la variable A");
            a = sca.nextFloat();
            System.out.println("Escriba la variable B");
            b = sca.nextFloat();
            System.out.println("Escriba la variable C");  
            c = sca.nextFloat();
            float raiz = b * b - (4 * a * c);
            String res1 = null, res2 = null, paso1, paso2;
            if (raiz <= 0) { // igual o menor a cero
                             System.out.println("No tiene solución");
                             } 
            else {
                    float o1 = (float) (-1 * b + Math.sqrt(raiz));
                    float Total1 = o1 / (2 * a);
                    float o2 = (float) (1 * b - Math.sqrt(raiz));
                    float Total2 = o2 / (2 * a);
                    paso1 = Total1 + "";
                    paso2 = Total2 + "";
            if (paso1.equals("NaN")){//NaN es para valores resultado "imposible" como division 0/0
                                     res1 = "Imposible realizar";
                                    }
            else {//operacion 1
                  res1 = paso1;
                 }
            if (paso2.equals("0")){//podemos usar el 0 funciona igual que NaN DIGAMOS
                                   res2 = "Imposible realizar";
                                  } 
            else {//operacion 2 
                  res2 = paso2;
                 }
                System.out.println("El resultado es " + "Respuesta 1 = " + res1
                        + "  " + "Respuesta 2 = " + res2);
            }
        }catch (Exception ex){
            System.out.println("Imposible realizar . . .  "+ex.toString());
        }
    }
}