public class breaAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i == 74) break;        // Fuera de bucle
            if(i % 9 != 0) continue;  // Siguiente iteracion
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
        // Un "bucle infinito"
        while(true){
            i++;
            int j = i * 27;
            if(j == 1269) break;       // fuera del bucle for
            if(i % 10 !=0) continue;   // Principio del bucle
            System.out.print(i + " ");
        }
    }
}
