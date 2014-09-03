package yatzy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: GA2PASH
 * Date: 03/09/14
 * Time: 12:30
 * To change this template use File | Settings | File Templates.
 */
public class YatzyScorer {

    public int scoreAs(int[] roll, String handType) {
        switch(handType) {
            case ("chance") :
                return sumRoll(roll);
            case ("yatzy") :
                return scoreYatzy(roll);
            default:
                throw new UnsupportedOperationException("Unsupported handType"+ handType);
        }
    }

    private int scoreYatzy(int[] roll) {
        Set rollSet = new HashSet<>(toIntegerList(roll));
        return rollSet.size() == 1 ? 50 : 0;
    }

    private List<Integer> toIntegerList(int[] ints) {
        LinkedList<Integer> l = new LinkedList<>();
        for ( int i : ints) {
            l.add(i);
        }
        return l;
    }

    private int sumRoll(int[] roll) {
        int sum = 0;
        for(int i = 0; i < roll.length; i++){
            sum += roll[i];
        }
        return sum;
    }
}
