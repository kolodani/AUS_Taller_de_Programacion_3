public class Perro {
    private String nombre;
    private String raza;
    private int edad;

    Perro(){
        this.nombre = "Rex";
        this.raza = "Beagle";
        this.edad = 5;
    }

    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    private void setRaza(String raza){
        this.raza = raza;
    }
    protected void setEdad(int edad){
        this.edad = edad;
    }
}
