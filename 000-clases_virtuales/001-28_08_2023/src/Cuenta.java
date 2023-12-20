public class Cuenta {
    private double saldo;
    private static final int SALDO_INSUFICIENTE = -1;
    private static double dolar;

    // bloque de inicializacion estatica
    static {
        dolar = 700;
    }
    // el constructor tiene el mismo nombre de la clase
    // no tienen tipo de retorno, no son ni void
    public Cuenta () {
        // asi reutilizo el constructor de abajo para no hacer muchas asignaciones
        this(200000);
    }

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositarDolares(double cantDolares) {
        this.depositar(cantDolares * dolar);
    }

    public void depositar(double cant) {
        saldo += cant;
    }

    public double extraerDolares(double cantDolares) {
        return this.extraer(cantDolares * dolar);
    }

    public double extraer(double cant) {
        if (cant <= saldo) {
            saldo -= cant;
            return cant;
        }
        return SALDO_INSUFICIENTE;
    }

    public double consultar() {
        return saldo;
    }

    // los metodos son estaticos porque el precio del dolar pertenece a la clase no a la instancia
    // los metodos de clase no tiene this, hay que poner el nombre de la clase
    public static double consultarDolar() {
        return dolar;
    }

    public static void cambiarDolar(double dolar) {
        Cuenta.dolar = dolar;
    }

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(1000);
        System.out.println(c1.consultar());
        System.out.println(Cuenta.consultarDolar());
        c1.extraerDolares(1);
        System.out.println(c1.consultar());
        if(c1.extraerDolares(1) == SALDO_INSUFICIENTE) {
            System.out.println("No tenes un mango");
        }
        System.out.println(c1.consultar());
        Cuenta c2 = new Cuenta();
        System.out.println(c2.consultar());
        System.out.println(Cuenta.consultarDolar());
        Cuenta.cambiarDolar(630);
        System.out.println(Cuenta.consultarDolar());
        System.out.println(Cuenta.consultarDolar());
    }
}
