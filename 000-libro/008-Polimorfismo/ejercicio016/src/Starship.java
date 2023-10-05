public class Starship {
    private AlertStatus status = new GreenAlertStatus();
    public void setStatus(AlertStatus istatus){
        status = istatus;
    }
    public String toString() {
        return status.getStatus();
    }
}
