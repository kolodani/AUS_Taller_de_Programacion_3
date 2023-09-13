package perrera;

public class SuperPerro extends Perro{
    private String poder;
    public SuperPerro(String name, String poder){
        super(name);
        this.poder = poder;
    }
    public void setPoder(String poder){
        this.poder = poder;
    }
    public String toString(){
        return "El Nombre del perro es: " + getName() + " y su poder es: " + poder;
    }
    public static void main(String[] args) {
        SuperPerro heroe = new SuperPerro("Marco", "Morder");
        System.out.println(heroe.toString());
        heroe.setPoder("Volar");
        heroe.setName("Grover");
        System.out.println(heroe.toString());
    }
}
