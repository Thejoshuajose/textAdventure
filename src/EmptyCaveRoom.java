public class EmptyCaveRoom extends MapTile {
    public EmptyCaveRoom(int x, int y) {
        super(x,y);
    }
    public String intro_text(){
        return "You look around and see absolutely...nothing.\n There is only ways forward" +
                "\nYou choose where to go next.";
    }
}
