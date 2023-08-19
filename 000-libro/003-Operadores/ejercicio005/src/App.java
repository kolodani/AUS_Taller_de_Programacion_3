/*
 *  Ejercicio 05:
 *  Cree una clase denominada Dog (perro) que contenga dos objetos Strin g: name (nombre) y says
 *  (ladrido). En main(), cree dos objetos perro con los nombres "spot" (que ladre diciendo " Ruff!") y
 *  "scruffy" (que ladre diciendo, "Wurf!"). Después, muestre sus nombres y el sonido que hacen al ladrar.
*/

ublic class App {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name = "Spot";
        d2.name = "Scruffy";
        d1.says = "Ruff!";
        d2.says = "Wurf!";
        System.out.println("El ladrido de " + d1.name + " hace el ruido " + d1.says);
        System.out.println("El ladrido de " + d2.name + " hace el ruido " + d2.says);
    }
}
