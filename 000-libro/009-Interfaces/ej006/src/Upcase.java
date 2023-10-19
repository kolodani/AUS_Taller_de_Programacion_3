public class Upcase extends StringProcessor {
    public String process(Object input) { // Retorno covariante
        return ((String)input).toUpperCase();
    }
}
