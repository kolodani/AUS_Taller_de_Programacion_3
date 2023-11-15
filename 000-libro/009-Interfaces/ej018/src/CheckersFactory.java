public class CheckersFactory implements GameFactory{
    public Game getGame() {
        return new Checkers();
    }
}
