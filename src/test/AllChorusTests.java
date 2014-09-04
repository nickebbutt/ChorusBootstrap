import org.chorusbdd.chorus.ChorusSuite;
import org.junit.runner.RunWith;

/**
 * Created by nick on 10/03/2014.
 *
 * Run all the chorus examples as a JUnit test suite
 * Here you can pass in all the parameters you would usually pass to Chorus on the command line
 */
@RunWith(ChorusSuite.class)
public class AllChorusTests {

    public static String getChorusArgs() {
        return "-f src " +     //find feature files under src beneath the working directory
               "-h com.gildedrose " +    //find handler classes in packages starting with demo
               "-c ";          //use console mode for output

    }

}
