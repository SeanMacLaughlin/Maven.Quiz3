package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        return RockPaperScissorHandSign.ROCK;
    }

    public RockPaperScissorHandSign getLoser() {
        return RockPaperScissorHandSign.ROCK;
    }
}
