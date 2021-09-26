package parcial1ejercicio2;

import java.util.Scanner;

public class Empleado extends Persona {
 
    public double ISSS, AFP, Renta,HorasEx,Liquido,HorasTrab, Horast;
    Persona p = new Persona();
    public Empleado() {   }
    Scanner emp = new Scanner(System.in);
    public Empleado(String Puesto, double HE, double HT, double L, double ISSS, double AFP, double RT) {
        this.HorasEx = HE;
        this.Puesto = Puesto;
        this.HorasTrab=HT;
        this.Liquido=L;
        this.ISSS=ISSS;
        this.AFP=AFP;
        this.Renta=RT;
    }

    public double getSueldoliquido() {   return Liquido;  }
    public void setSueldoliquido(double sueldoliquido) {  this.Liquido = sueldoliquido;  }
    public String getPuesto() {     return Puesto;  }
    public void setPuesto(String Puesto) { this.Puesto = Puesto;    }
    public double getHorasTrab() {        return HorasTrab;    }
    public void setHorasTrab(double HorasTrab) {this.HorasTrab = HorasTrab;    }
    public double getHorasEx() {        return HorasEx;    }
    public void setHorasEx(double HorasEx) {this.HorasEx = HorasEx;    }
    public double getDesISSS() { return ISSS;    }
    public void setDesISSS(double DesISSS) { this.ISSS = DesISSS; }
    public double getDesAFP() {return AFP;    }
    public void setDesAFP(double DesAFP) {  this.AFP = DesAFP;  }
    public double getDesRENTA() { return Renta;    }
    public void setDesRenta(double DesRenta) {  this.Renta = DesRenta;}  
}
