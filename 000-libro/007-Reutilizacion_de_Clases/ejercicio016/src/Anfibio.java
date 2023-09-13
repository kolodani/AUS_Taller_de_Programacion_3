public class Anfibio {
    private String especie;
    public Anfibio(){
        this.especie = "Sin Identificar";
    }
    protected void setEspecie(String especie){
        this.especie = especie;
    }
    protected String getEspecie(){
        return especie;
    }
    protected void nadar(String e){
        System.out.println(e + " esta nadando");
    }
    protected void correr(String e){
        System.out.println(e + " esta corriendo");
    }
}
