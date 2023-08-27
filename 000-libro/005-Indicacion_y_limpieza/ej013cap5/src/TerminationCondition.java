class Book{
    boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }
    void checkIn(){
        checkedOut = false;
    }
    protected void finalize(){
        if(checkedOut){
            System.out.println("Error: checked out");
            // Normalmente, tambien haremos esto:
            // super.finalize(); // Invocar la version de la clase base
        }
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Limpieza apropiada:
        novel.checkIn();
        // Falta la referencia, nos olvidamos de limpiar:
        new Book(true);
        // Forzar la depuracion de memoria y la finalizacion:
        System.gc();
    }
}
