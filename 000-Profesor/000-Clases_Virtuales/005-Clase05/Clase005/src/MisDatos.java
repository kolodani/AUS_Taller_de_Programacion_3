import java.io.Serializable;

public class MisDatos implements Serializable{
    private static final long serialVersionUID = 1L;

    private static String VALOR;
    private int i;
    private boolean b;
    private double d;
    private String s;
    private short sh;
    transient private String clave;

    public MisDatos(int i, boolean b, double d, String s, short sh, String clave) {
        this.i = i;
        this.b = b;
        this.d = d;
        this.s = s;
        this.sh = sh;
        this.clave = clave;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public boolean getB() {
        return b;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setSh(short sh) {
        this.sh = sh;
    }

    public short getSh() {
        return sh;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public static void setVALOR(String VALOR) {
        MisDatos.VALOR = VALOR;
    }

    public static String getVALOR() {
        return VALOR;
    }
}
