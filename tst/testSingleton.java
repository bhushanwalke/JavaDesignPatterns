import com.patterns.singleton.Singleton;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

/**
 * Created by bhushan on 8/30/16.
 */

@RunWith(MockitoJUnitRunner.class)
public class testSingleton {
    @Mock
    private Singleton singleton;

    @Test
    public void testSingleton() {
        when(singleton.getRuntime()).thenReturn(new Singleton());

        assertEquals();
    }


}
