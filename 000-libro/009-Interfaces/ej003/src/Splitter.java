import java.util.*;

class Splitter extends Processor {
    String process(Object input) {
        // El metodo split() divide una cadena en fragmentos:
        return Arrays.toString(((String) input).split(" "));
    }
}