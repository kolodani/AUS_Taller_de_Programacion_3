package perrera;

public class Perro {
    private String name;
    public Perro(String name){
        this.name = name;
    }
    protected void setName(String name){
        this.name = name;
    }
    protected String getName(){
        return name;
    }
    public String toString(){
        return "El Nombre del perro es: " + name;
    }
}
