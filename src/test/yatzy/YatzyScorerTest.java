package yatzy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: GA2PASH
 * Date: 03/09/14
 * Time: 12:31
 * To change this template use File | Settings | File Templates.
 */
public class YatzyScorerTest {

    private YatzyScorer scorer;

    @Before
    public void doBefore() {
        scorer = new YatzyScorer();
    }

    @Test
    public void whenScoringAChanceTheResultIsTheSumOfAllDice() {
        checkScore(new int[]{1, 1, 3, 3, 6}, 14, "chance");
        checkScore(new int[]{3, 4, 5, 4, 6}, 22, "chance");
    }

    @Test
    public void whenScoringAYatzyTheResultIs50IfAllDiceShareANumber() {
        checkScore(new int[]{5, 5, 5, 5, 5}, 50, "yatzy");
        checkScore(new int[]{6, 6, 6, 6, 6}, 50, "yatzy");
        checkScore(new int[]{1, 5, 5, 5, 5}, 0, "yatzy");
    }

    @Test
    public void whenScoringOnesTwosThreesWeSumTheInstancesOfTheMatchingDice() {
//        checkScore(new int[]{2, 2, 3, 4, 5}, 4, "twos");
    }

    private void checkScore(int[] roll, int expected, String type) {
        int result = scorer.scoreAs(roll, type);
        assertEquals(expected, result);
    }
}
