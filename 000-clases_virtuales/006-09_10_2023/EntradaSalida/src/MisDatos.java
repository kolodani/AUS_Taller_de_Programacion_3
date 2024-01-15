import java.io.Serializable;

public class MisDatos implements Serializable {

    private static final long serialVersionUID = 1L;

    private static String VALOR;
    private int i;
    private boolean b;
    private double d;
    private String s;
    private short sh;
    private transient String clave;
    // no queria que se guarden los datos en la serializacion

    public MisDatos(int i, boolean b, double d, String s, short sh, String clave) {
        this.i = i;
        this.b = b;
        this.d = d;
        this.s = s;
        this.sh = sh;
        this.clave = clave;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    public boolean isB() {
        return b;
    }
    public void setB(boolean b) {
        this.b = b;
    }
    public double getD() {
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }
    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }
    public short getSh() {
        return sh;
    }
    public void setSh(short sh) {
        this.sh = sh;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public static String getVALOR() {
        return VALOR;
    }
    public static void setVALOR(String vALOR) {
        VALOR = vALOR;
    }
}
