package javaapplication2;


public class Materia extends Estudiante{
     private int cdMateria, Grado;
    private String NMateria;
    public double NotaFinal;
    
    public Materia() { 
    }
    public Materia(int co, String no, int CodigoMateria, String ap, String NMateria, int Gra) {
        
        this.cdMateria = CodigoMateria;
        this.NMateria = NMateria;
        this.Grado = Gra;
    }
    public double getNotaFinal() {
        return NotaFinal;
    }
    public void setNotaFinal(double NotaFinal) {
        this.NotaFinal = NotaFinal;
    }
    public int getCodMateria() {
        return cdMateria;
    }
    public String getMateria() {
        return NMateria;
    }
    public int getGrado() {
        return Grado;
    }
    public void setCodigoMateria(int CodigoMateria) {
        this.cdMateria = CodigoMateria;
    }
    public void setMateria(String Materia) {
        this.NMateria = Materia;
    }
    public void setGrado(int Grado) {
        this.Grado = Grado;
    }
}
