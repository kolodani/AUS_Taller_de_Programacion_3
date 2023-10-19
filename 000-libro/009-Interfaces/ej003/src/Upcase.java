class Upcase extends Processor {
    String process(Object input) { // Retorno covariante
        return ((String) input).toUpperCase();
    }
}