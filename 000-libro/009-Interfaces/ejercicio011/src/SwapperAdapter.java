public class SwapperAdapter implements Processor {
    public String name() {
        return CharacterPairSwapper.class.getSimpleName();
    }
    public String process(Object input) {
        return CharacterPairSwapper.swap((String) input);
    }
}
