package demo.mockito;

import org.junit.Test;

import java.util.List;

//Let's import Mockito statically so that the code looks clearer
import static org.mockito.Mockito.*;

/**
 * Created by nick on 02/09/2014.
 */
public class TestMockitoIsWorking {

    @Test
    public void testMockitoIsWorking() {
        //mock creation
        List mockedList = mock(List.class);

        mockedList.add("one");
        mockedList.clear();

        verify(mockedList).add("one");
        verify(mockedList).clear();
    }
}
