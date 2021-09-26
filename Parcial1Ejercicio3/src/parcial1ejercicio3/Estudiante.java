package parcial1ejercicio3;
class Estudiante {
    private int codigo;
    private String Nombre, Apellido; 
    public Estudiante() {}
    public Estudiante(int codigo, String Nombre, String Apellido) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    public int getCodigo()
    { return codigo; }
    public void setCodigo(int codigo)
    {this.codigo = codigo; }      
    public void setNombre(String Nombre) 
    { this.Nombre = Nombre; }
    public String getNombre()
    { return Nombre; }    
    public String getApellido() 
    { return Apellido; }
    public void setApellido(String Apellido) 
    { this.Apellido = Apellido; }
}