public class Cuenta {
    private static final int SALDO_INSUFICIENTE = -1;
    private double saldo;
    private static double dolar;

    static {
        dolar = 700;
    }

    public Cuenta() {
        this(200000);
    }

    public Cuenta(double saldoInicial) {
        if(saldoInicial > 0){
            this.saldo = saldoInicial;
        }
    }

    public void depositarDolares(double cantDolares){
        depositar(cantDolares * dolar);
    }

    public void depositar(double cant) {
        saldo += cant;
    }

    public double extraerDolares(double cantDolares){
        return extraer(cantDolares * dolar);
    }

    public double extraer(double cant) {
        if(saldo >= cant){
            saldo -= cant;
            return saldo;
        }
        return SALDO_INSUFICIENTE;
    }

    public double consultar() {
        return saldo;
    }

    public static double consultarDolar() {
        return dolar;
    }

    public static void cambiarDolar (double dolar){
        Cuenta.dolar = dolar;
    }

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(1000);
        c1.depositar(100000);
        System.out.println(c1.consultar());
        System.out.println(Cuenta.consultarDolar());
        Cuenta c2 = new Cuenta();
        System.out.println(c2.consultar());
        System.out.println(Cuenta.consultarDolar());

        Cuenta.cambiarDolar(630);

        System.out.println(Cuenta.consultarDolar());
        System.out.println(Cuenta.consultarDolar());
    }
}
