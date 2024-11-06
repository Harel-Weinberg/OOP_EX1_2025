import java.util.ArrayList;
import java.util.List;

public class GameLogic implements PlayableLogic {

    @Override
    public boolean locate_disc(Position a, Disc disc) {
        if(getDiscAtPosition(a)!=null)return false;//בדיקה שהמיקום שהדיסק מעוניין להגיע איליו ריק
        List<Position> l = ValidMoves();
        for( Position p:l ){
            if(p.equals(a))return true;
        }
        return false;
    }

    @Override
    public Disc getDiscAtPosition(Position position) {
        return null;
    }

    @Override
    public int getBoardSize() {
        return 0;
    }

    @Override
    public List<Position> ValidMoves() {
        return null;
    }

    @Override
    public int countFlips(Position a) {
        return 0;
    }

    @Override
    public Player getFirstPlayer() {
        return null;
    }

    @Override
    public Player getSecondPlayer() {
        return null;
    }

    @Override
    public void setPlayers(Player player1, Player player2) {

    }

    @Override
    public boolean isFirstPlayerTurn() {
        return false;
    }

    @Override
    public boolean isGameFinished() {
        List<Position> l = ValidMoves();
        if(l==null)return true;
        return false;
    }

    @Override
    public void reset() {

    }

    @Override
    public void undoLastMove(){

    }
}
